package com.example.vanda.share;

class Fruit {
    private int image_id;
    private String name;

    public Fruit(int image_id, String name) {
        this.image_id = image_id;
        this.name = name;
    }

    public int getImage_id() {

        return image_id;
    }


    public void setImage_id(int image_id) {

        this.image_id = image_id;
    }


    public String getName() {
        return name;
    }
}
