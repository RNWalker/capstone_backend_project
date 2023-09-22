package com.capstone.CapstoneProject.models;


import com.capstone.CapstoneProject.models.enums.Position;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="employees")
public class Employee {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String username;

    @Column
    private String password;

    @OneToMany(mappedBy = "employee")
    @JsonIgnoreProperties({"employees"})
    private List<Order> orders;

//    @Column
    @Enumerated(EnumType.STRING)
    private Position position;

    public Employee(String name, String username, String password, Position position) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.orders = new ArrayList<>();
        this.position = position;
    }


    // DEFAULT CONSTRUCTOR

    public Employee (){}

    // GETTERS AND SETTERS


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    // ADDITIONAL METHODS

    public void addOrderToEmployee(Order order) {
        this.orders.add(order);
    }

    public void removeOrderFromEmployee(Order order){
        this.orders.remove(order);
    }
}
