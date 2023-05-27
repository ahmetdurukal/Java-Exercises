package com.example;
import java.util.Scanner;
public class StarTree {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("İlk satır yıldız sayısını giriniz (Tek sayı girmeniz düzgün sonuç verecektir.): ");
            int rows;
            rows = input.nextInt();

            for (int rep = 1; rep < rows + 1; rep++) {
                for (int space = 1; space < rep; space++) {
                    System.out.print(" ");
                }
                for (int star = rep; star <= rows; star++) {
                    System.out.print("*");
                }
                System.out.println();
                rows -= 1;
            }
        }
        catch (Exception InputMismatchException){
            System.out.println("Geçerli bir değer giriniz. (Girdiğiniz değer int değidir.)");
            return;
        }
    }
}

