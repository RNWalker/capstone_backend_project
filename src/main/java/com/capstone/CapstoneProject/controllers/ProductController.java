package com.capstone.CapstoneProject.controllers;

import com.capstone.CapstoneProject.models.enums.Status;
import com.capstone.CapstoneProject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PatchMapping(value= "/decreaseStockLevel")
    public void decreaseStockLevel(@RequestParam Long orderId){
        productService.decreaseStockLevel(orderId);
    }





}
