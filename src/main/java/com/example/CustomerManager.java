package com.example;

public class CustomerManager {
    public void add() {
        System.out.println("Müşteri Eklendi.");
    }
    public void remove() {
        System.out.println("Müşteri Silindi.");
    }
    public void update() {
        System.out.println("Müşteri güncellendi.");
    }

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();
    }
}

