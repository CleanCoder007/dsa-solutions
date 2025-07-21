package com.utils;

public class DataPrinter {
    public static void printOneDimensionalArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i!=array.length-1)
                System.out.print(",");
       }

        System.out.print("]\n");
    }
 public static void printTwoDimensionalArray(int[][] array){
//     System.out.println("array = " + Arrays.deepToString(array));
     for (int[] oneDArray : array) {
        printOneDimensionalArray(oneDArray);
     }
 }
}
