package com.capstone.CapstoneProject.services;

import com.capstone.CapstoneProject.models.Order;
import com.capstone.CapstoneProject.models.enums.Status;
import com.capstone.CapstoneProject.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public void updateOrderStatus(Status status, Long orderId) {
        Order orderToUpdate = orderRepository.findById(orderId).get();
        orderToUpdate.setStatus(status);
    }
}
