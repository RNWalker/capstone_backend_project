package com.capstone.CapstoneProject.controllers;

import com.capstone.CapstoneProject.models.Order;
import com.capstone.CapstoneProject.models.Truck;
import com.capstone.CapstoneProject.models.enums.Status;
import com.capstone.CapstoneProject.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders(){
        return new ResponseEntity<>(orderService.getAllOrders(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable Long id){
        return new ResponseEntity<>(orderService.getOrderById(id).get(), HttpStatus.OK);
    }

    @PatchMapping(value = "/updateOrderStatus")
    public void updateOrderStatus(@RequestParam Long orderId, Long employeeId, Long truckId, Status status){
        orderService.updateOrderStatus(status, orderId, employeeId, truckId);
    }




}
