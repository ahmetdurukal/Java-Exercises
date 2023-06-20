package com.example;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Laptop";
        product.setId(1);
        product.description = "Asus Laptop";
        product.price = 5000;
        product.set_stock(10);
        product.get_stock();

        Product product1 = new Product();
        product1.name = "Laptop";
        product1.setId(2);
        product1.description = "HP Laptop";
        product1.price = 4500;
        product1.set_stock(3);
        product1.get_stock();

        ProductManager ProductManager = new ProductManager();
        ProductManager.Add(product);
        ProductManager.Add(product1);

    }

}
