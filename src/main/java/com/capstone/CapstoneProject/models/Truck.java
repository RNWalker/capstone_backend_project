package com.capstone.CapstoneProject.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="trucks")
public class Truck {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="max_capacity")
    private int maxCapacity;

    @OneToMany(mappedBy = "truck")
    @JsonIgnoreProperties({"trucks"})
    private List<Order> orders;

    public Truck(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.orders = new ArrayList<>();
    }

    // DEFAULT CONSTRUCTOR
    public Truck() {
    }

    // GETTERS AND SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void removeOrder(Order order) {
        this.orders.remove(order);
    }
}
