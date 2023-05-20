package com.example;
public class Test {
    public static void main(String[] args) {
        int ogrenciSayisi = 10;
        String mesaj = "Öğrenci Sayım: ";
        System.out.println(mesaj + ogrenciSayisi);
        int sayi = 24;
        if (sayi < 20) {
            System.out.println("Sayı 20'den küçüktür.");
        } else if (sayi == 20) {
            System.out.println("Sayı 20'ye eşittir.");
        } else {
            System.out.println("Sayı 20'den büyüktür");
        }
    }
}

