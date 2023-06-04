package com.example;

import java.util.Arrays;

public class NumberSorting {
    public static void main(String[] args) {
        int intArray[] = new int[]{256, 132, 117, 89, 822, 116, 744};
        int[] result = sortingNumber(intArray);

        System.out.println(Arrays.toString(result));

    }

    public static int[] sortingNumber(int[] intArray) {

        int resArray[] = new int[intArray.length];

        for (int i = 0; i < intArray.length; i++) {

            for (int j = i + 1; j < intArray.length; j++) {

                int fixvalue = 0;
                if (intArray[j] < intArray[i]) {

                    fixvalue = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = fixvalue;
                }
            }
            resArray[i] = intArray[i];

        }
        return resArray;
    }
}

