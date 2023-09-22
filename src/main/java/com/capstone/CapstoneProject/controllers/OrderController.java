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

//    http://localhost:8080/orders/updateOrderStatus?orderId=1&employeeId=1&truckId=3&status=ONGOING
    @PatchMapping(value = "/updateOrderStatus")
    public void updateOrderStatus(@RequestParam Status status, @RequestParam Long orderId, @RequestParam Long employeeId, @RequestParam Long truckId){
        orderService.updateOrderStatus(status, orderId, employeeId, truckId);
    }




}
