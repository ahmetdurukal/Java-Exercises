package com.example;

public class Loops {
    public static void main(String[] args) {
        //For
        for (int a = 1; a <= 10; a = a + 1) {
            System.out.println(a);
        }
        System.out.println("For Döngüsü bitti");
        //While
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti");
        //Do while
        int j = 1;
        do {
            System.out.println(j);
            j = j + 2;
        }
        while (j < 10);
        System.out.println("Do-while döngüsü bitti");
    }
}
