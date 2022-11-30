package com.bahadir.hairmodels.models;

public class HairModel {
    private String name, imageUrl;
    private int color;

    public HairModel(String name, String imageUrl, int color){
        this.name = name;
        this.imageUrl = imageUrl;
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }
}
