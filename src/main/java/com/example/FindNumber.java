package com.example;
public class FindNumber {
    public static void main(String[] args){
        int[] numbers = new int[]{1,2,3,4,5,6};
        int wanted = 9;
        boolean isthere = false;
        for(int number: numbers){
            if(wanted == number){
                isthere=true;
                break;
            }
        }
        if(isthere){
            System.out.println("Aranan Sayi Liste İçerisinde.");
        }else {
            System.out.println("Aranan Sayı Bulunamadı.");
        }
    }
}
