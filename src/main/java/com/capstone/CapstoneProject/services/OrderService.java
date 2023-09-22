package com.capstone.CapstoneProject.services;

import com.capstone.CapstoneProject.models.Order;
import com.capstone.CapstoneProject.models.Truck;
import com.capstone.CapstoneProject.models.enums.Status;
import com.capstone.CapstoneProject.repositories.EmployeeRepository;
import com.capstone.CapstoneProject.repositories.OrderRepository;
import com.capstone.CapstoneProject.repositories.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    TruckRepository truckRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public void updateOrderStatus(Status status, Long orderId, Long employeeId, Long truckId) {
        Order orderToUpdate = orderRepository.findById(orderId).get();
        orderToUpdate.setStatus(status);
        if(status.equals(Status.ONGOING)) {
            orderToUpdate.setEmployee(employeeRepository.findById(employeeId).get());
            orderToUpdate.setTruck(truckRepository.findById(truckId).get());
        }
        if(status.equals(Status.ONHOLD)) {
            orderToUpdate.setTruck(null);
            Truck truckToUpdate = truckRepository.findById(truckId).get();
            truckToUpdate.removeOrder(orderToUpdate);
            truckRepository.save(truckToUpdate);
        }
        orderRepository.save(orderToUpdate);
    }
}
