package com.example;

import java.util.Scanner;

public class StarTree {
    public static void main(String[] args) {
        System.out.println(getInput());
    }

    public static String getInput() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("İlk satır yıldız sayısını giriniz (Tek sayı girmeniz düzgün sonuç verecektir.): ");
            int rows;
            rows = input.nextInt();
            return drawTree(rows);
        } catch (Exception InputMismatchException) {
            System.out.println("Geçerli bir değer giriniz. (Girdiğiniz değer int değidir.)");
            return getInput();
        }
    }

    public static String drawTree(int length) {
        String result = "";
        for (int rep = 1; rep < length + 1; rep++) {
            for (int space = 1; space < rep; space++) {
                result = result + " ";
            }
            for (int star = rep; star <= length; star++) {
                result = result + "*";
            }
            result = result + "\n";
            length -= 1;
        }
        return result;
    }

}



