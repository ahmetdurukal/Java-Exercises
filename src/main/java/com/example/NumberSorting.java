package com.example;

public class NumberSorting {
    public static void main(String[] args) {

        int intArray[] =new int[] {2, 3, 1};
        
        for (int i = 0; i < intArray.length; i++) {

            for (int j = i + 1; j < intArray.length; j++) {

                int fixvalue = 0;
                if (intArray[j] < intArray[i]) {

                    fixvalue = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = fixvalue;
                }
            }

            System.out.print(intArray[i] + " ");
                }

            }
        }

