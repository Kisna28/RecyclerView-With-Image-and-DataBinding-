package com.example.recyclerview_images;

public class Information {
    String name;
    String uses;
    int image;

    public Information() {

    }

    public Information(String name, String uses, int image) {
        this.name = name;
        this.uses = uses;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}