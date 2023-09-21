package com.capstone.CapstoneProject.models;

import com.capstone.CapstoneProject.models.enums.Size;

public class Product {

    private Long id;

    private String name;

    private int stockLevel;

    private String notes;

    private String category;

    private Size size;

//    private String image; Needed to check the type of image

    private String warehouseLocation;

    private boolean fragile;

    private boolean heavy;

    private boolean flammable;

    public Product(String name, int stockLevel, String notes, String category, Size size, String warehouseLocation, boolean fragile, boolean heavy, boolean flammable) {
        this.name = name;
        this.stockLevel = stockLevel;
        this.notes = notes;
        this.category = category;
        this.size = size;
        this.warehouseLocation = warehouseLocation;
        this.fragile = fragile;
        this.heavy = heavy;
        this.flammable = flammable;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getWarehouseLocation() {
        return warehouseLocation;
    }

    public void setWarehouseLocation(String warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
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
}
