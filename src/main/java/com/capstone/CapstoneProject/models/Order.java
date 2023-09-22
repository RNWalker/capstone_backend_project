package com.capstone.CapstoneProject.models;

import com.capstone.CapstoneProject.models.enums.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JsonIgnoreProperties({"orders"})
    @JoinTable(name="orders_products",joinColumns = @JoinColumn(name="order_id"), inverseJoinColumns = @JoinColumn(name="product_id"))
    private List<Product> products;

    @Column(name="order_priority")
    private boolean orderPriority;

    @Column
    private LocalDate date;

    @ManyToOne
    @JsonIgnoreProperties({"orders"})
    @JoinColumn(name="truck_id")
    private Truck truck;

    @ManyToOne
    @JsonIgnoreProperties({"orders"})
    @JoinColumn(name="employee_id")
    private Employee employee;

//    @Column
    @Enumerated(EnumType.STRING)
    private Status status;

    public Order(List<Product> products, boolean orderPriority, LocalDate date) {
        this.products = products;
        this.orderPriority = orderPriority;
        this.date = date;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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
