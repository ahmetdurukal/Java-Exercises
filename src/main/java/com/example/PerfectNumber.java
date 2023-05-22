package com.example;
public class PerfectNumber {
    public static void main(String[] args){
        //Kendisi hariç bütün pozitif bölenlerinin toplamı kendisine eşit olan sayılara mükemmel sayı denir.
        //6 --> 1,2,3
        //28--> 1,2,4,7,14
        int number = 28;
        int divisor = 0;
        if(number<1){
            System.out.println("Geçersiz Sayi");
            return;
        }

        for (int i=1; i<number; i++){
            if(number%i==0){
                divisor = divisor + i;

            }
        }
        if(divisor==number){
            System.out.println("Sayımız Muhteşem Sayıdır.");
        }else
            System.out.println("Muhteşem Değildir.");
    }
}
