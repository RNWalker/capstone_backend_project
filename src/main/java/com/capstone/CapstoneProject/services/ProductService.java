package com.capstone.CapstoneProject.services;

import com.capstone.CapstoneProject.models.DecreaseProductQuantityDTO;
import com.capstone.CapstoneProject.models.Order;
import com.capstone.CapstoneProject.models.Product;
import com.capstone.CapstoneProject.repositories.OrderRepository;
import com.capstone.CapstoneProject.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderRepository orderRepository;

    public void decreaseStockLevel(Long orderId) {
        Order orderToDecreaseStockLevel = orderRepository.findById(orderId).get();
        for(Product product : orderToDecreaseStockLevel.getProducts()) {
            product.setStockLevel(product.getStockLevel() - 1);
            productRepository.save(product);
        }
    }
}
