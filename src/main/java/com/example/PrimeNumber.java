package com.example;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 999983;
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Asal Değildir");
            return;
        }

        if (number < 1) {
            System.out.println("Geçersiz Sayi");
            return;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;

            }
        }
        if (isPrime == true) {
            System.out.println("Sayi Asaldır.");
        } else {
            System.out.println("Asal Değildir");
        }


    }
}
