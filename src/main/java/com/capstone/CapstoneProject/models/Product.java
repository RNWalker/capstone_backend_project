package com.capstone.CapstoneProject.models;

import com.capstone.CapstoneProject.models.enums.Category;
import com.capstone.CapstoneProject.models.enums.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="products")
public class Product {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(name="stock_level")
    private int stockLevel;

    @Column
    private String notes;

//    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

//    @Column
    @Enumerated(EnumType.STRING)
    private Size size;

    @Column(name="image_url")
    private String imageURL;

    @Column(name="product_location")
    private String productLocation;

    @Column
    private boolean fragile;

    @Column
    private boolean heavy;

    @Column
    private boolean flammable;

    @Column
    @ManyToMany(mappedBy = "products")
    @JsonIgnoreProperties({"products"})
    private List<Order> orders;

    public Product(String name, int stockLevel, String notes, Category category, Size size, String imageURL, String productLocation, boolean fragile, boolean heavy, boolean flammable) {
        this.name = name;
        this.stockLevel = stockLevel;
        this.notes = notes;
        this.category = category;
        this.size = size;
        this.productLocation = productLocation;
        this.fragile = fragile;
        this.heavy = heavy;
        this.flammable = flammable;
        this.imageURL = imageURL;
    }

    // DEFAULT CONSTRUCTOR

    public Product (){}

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

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getProductLocation() {
        return productLocation;
    }

    public void setProductLocation(String warehouseLocation) {
        this.productLocation = productLocation;
    }

    public boolean isFragile() {
        return fragile;
    }

    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    public boolean isHeavy() {
        return heavy;
    }

    public void setHeavy(boolean heavy) {
        this.heavy = heavy;
    }

    public boolean isFlammable() {
        return flammable;
    }

    public void setFlammable(boolean flammable) {
        this.flammable = flammable;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
