package com.bahadir.starbuzz.Models;

import java.io.Serializable;

public class Drink implements Serializable {
    private String name, description;
    private int imageResourceID;

    public Drink(String name, String description, int imageResourceID) {
        setName(name);
        setDescription(description);
        setImageResourceID(imageResourceID);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    @Override
    public String toString() {
        return getName();
    }
}




