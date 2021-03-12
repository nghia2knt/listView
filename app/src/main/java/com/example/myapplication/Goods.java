package com.example.myapplication;

public class Goods {
    private String name;
    private String price;
    private int imageGoods;

    public Goods(String name, String price, int imageGoods) {
        this.name = name;
        this.price = price;
        this.imageGoods = imageGoods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImageGoods() {
        return imageGoods;
    }

    public void setImageGoods(int imageGoods) {
        this.imageGoods = imageGoods;
    }

}
