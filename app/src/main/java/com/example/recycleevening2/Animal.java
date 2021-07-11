package com.example.recycleevening2;

public class Animal {
    private int image;
    String name;
    String category;
    String bark;

    public Animal(int image, String name, String category, String bark) {
        this.image = image;
        this.name = name;
        this.category = category;
        this.bark = bark;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBark() {
        return bark;
    }
}
