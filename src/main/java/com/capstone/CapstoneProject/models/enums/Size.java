package com.capstone.CapstoneProject.models.enums;

public enum Size {

    SMALL(3),
    MEDIUM(7),
    LARGE(10);

    private final int displaySize;
    Size (int displaySize){
        this.displaySize = displaySize;
    }
    public int getSize(){
        return displaySize;
    }

//    REVIEW LATER
    public static Size valueFromDisplaySize (int displaySize) {
        for (Size size : values()) {
            if (size.displaySize == displaySize) {
                return size;
            }
        }
        return null;
    }
    public static Size findByName(String sizeName){
        Size result = null;
        for (Size size : values()){
            if (size.name().equalsIgnoreCase(sizeName)){
                result = size;
                break;
            }
        }
        return result;
    }
}

