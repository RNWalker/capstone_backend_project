package com.capstone.CapstoneProject.models;

import com.capstone.CapstoneProject.models.enums.Category;
import com.capstone.CapstoneProject.models.enums.Size;

public class Product {

    private Long id;

    private String name;

    private int stockLevel;

    private String notes;

    private Category category;

    private Size size;

   private String imageURL;

    private String productLocation;

    private boolean fragile;

    private boolean heavy;

    private boolean flammable;

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
}
