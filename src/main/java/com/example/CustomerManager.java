package com.example;

public class CustomerManager {
    public void Add(){
        System.out.println("Müşteri Eklendi.");
    }
    public void Remove(){
        System.out.println("Müşteri Silindi.");
    }
    public void Update(){
        System.out.println("Müşteri güncellendi.");
    }
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
    }
    }

