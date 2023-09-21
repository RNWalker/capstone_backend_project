package com.capstone.CapstoneProject.models;

import com.capstone.CapstoneProject.models.enums.Status;

import java.util.List;

public class Order {

    private Long id;

    private List<Product> products;

    private boolean orderPriority;


    private String date;

    private int productSumSize;

    private Truck truck;

    private Employee employee;

    private Status status;

    public Order(List<Product> products, boolean orderPriority, String date) {
        this.products = products;
        this.orderPriority = orderPriority;
        this.date = date;
        this.productSumSize = 0;  // add method to calculate this
        this.truck = null;
        this.employee = null;
        this.status = Status.UNFULFILLED;
    }

    // DEFAULT CONSTRUCTOR
    public Order() {
    }

    // GETTERS AND SETTERS

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean isOrderPriority() {
        return orderPriority;
    }

    public void setOrderPriority(boolean orderPriority) {
        this.orderPriority = orderPriority;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getProductSumSize() {
        return productSumSize;
    }

    public void setProductSumSize(int productSumSize) {
        this.productSumSize = productSumSize;
    }

    public Truck getTruck() {
        return truck;
    }

    public void setTruck(Truck truck) {
        this.truck = truck;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
