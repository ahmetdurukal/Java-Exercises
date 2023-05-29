package com.example;

public class BasicCalculator {
    public int topla(int sayi1,int sayi2){
        return sayi1+sayi2;
    }
    public int cikar(int sayi1,int sayi2){
        return sayi1-sayi2;
    }
    public int carp(int sayi1,int sayi2) {
        return sayi1 + sayi2;
    }
    public int bol(int sayi1,int sayi2) {
        return sayi1 / sayi2;
    }
    public static void main(String[] args) {
        int answer = 0;
        BasicCalculator BasicCalculator = new BasicCalculator();
        answer=BasicCalculator.topla(8,2);
        //answer=BasicCalculator.cikar(8,2);
        //answer=BasicCalculator.carp(8,2);
        //answer=BasicCalculator.bol(8,2);
        System.out.println(answer);
    }
}
