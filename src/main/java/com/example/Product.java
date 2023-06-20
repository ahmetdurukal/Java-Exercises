package com.example;

public class Product {
    private int _id;
    public String name;
    public String description;
    public double price;
    private int _stock;
    public String renk;

    //getter
    public int getId() {
        return _id;
    }

    //setter
    public void setId(int id) {
        _id = id;
    }

    public int get_stock() {
        return _stock;
    }

    public void set_stock(int stock) {
        _stock = stock;
    }
}
