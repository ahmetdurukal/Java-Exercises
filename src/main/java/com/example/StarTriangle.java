package com.example;
public class StarTriangle {
    public static void main(String[] args){
        int rows=6;
        int starrep=1;
        for (int rep = 1; rep < rows+1; rep++){
            for (int space = 6-rep; space>0;space--){
                System.out.print(" ");
            }
            for (int star=1;star<=starrep;star++){
                System.out.print("*");
            }
            System.out.println();
            starrep=starrep+2;
        }








    }
}
