package com.sanxynet.tinderswipe;

public class ItemModel {
    private int image;
    private String name, age, state;

    public ItemModel() {
    }

    public ItemModel(int image, String name, String age, String state) {
        this.image = image;
        this.name = name;
        this.age = age;
        this.state = state;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getState() {
        return state;
    }
}
