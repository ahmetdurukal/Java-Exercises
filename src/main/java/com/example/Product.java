package com.example;
import java.util.Arrays;
public class Product {
    //attribute | field
    public int id;
    public String name;
    public String description;
    public double price;
    public int stock;
    public String renk;
    private String kod;
    public static void main(String[] args) {
        Product pc = new Product();
        pc.id = 1;
        pc.name = "Asus";
        pc.description = "Tuf Series";
        pc.price = 20.000;
        pc.stock = 300;
        pc.renk = "Siyah";
        pc.kod = pc.name + pc.id;
        System.out.println("Ürün eklendi " + pc.name);
    }
}










