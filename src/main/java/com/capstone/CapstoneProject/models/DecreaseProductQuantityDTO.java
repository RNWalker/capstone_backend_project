package com.capstone.CapstoneProject.models;


import java.util.*;

public class DecreaseProductQuantityDTO {

    private List<Long> productIds;

    public DecreaseProductQuantityDTO() {
    }

    public List<Long> getProductIds() {
        return productIds;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }
}

