package com.capstone.CapstoneProject.models;

        import java.util.ArrayList;
        import java.util.List;

public class Truck {

    private Long id;
    private int maxCapacity;
    private List<Order> orders;

    public Truck(int maxCapacity) {
        this.id = id;
        this.maxCapacity = maxCapacity;
        this.orders = new ArrayList<>();
    }

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

    public List<Order> getOrder() {
        return orders;
    }

    public void setOrder(List<Order> order) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void removeOrder(Order order) {
        this.orders.remove(order);
    }
}
