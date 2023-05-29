package com.example;

public class StarTriangle {
    public static void main(String[] args) {
        int rows = 6;
        int starRep = 1;
        for (int rep = 1; rep < rows + 1; rep++) {
            for (int space = rows - rep; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 1; star <= starRep; star++) {
                System.out.print("*");
            }
            System.out.println();
            starRep = starRep + 2;
        }


    }
}
