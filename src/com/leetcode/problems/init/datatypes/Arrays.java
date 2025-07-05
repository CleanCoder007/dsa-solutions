package com.leetcode.problems.init.datatypes;

import java.util.stream.IntStream;

public class Arrays {

    public static void main(String[] args){
        System.out.print("array:");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+ ",");
        }

        System.out.print("\narray2:");
        int[] array2 = {1,2,3};
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+ ",");
        }

        System.out.print("\narray3:");
        int[] array3 = new int[] {1,2,3,4,5};
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]+ ",");
        }

        /* Initialize an array using Java 8 */
        /*IntStream.range - accepts start and end(exclusive) of expected array
        * and create a array with consecutive elements
        * in below example 50 will not be added in array*/
        System.out.print("\narray4:[");
        int[] array4= IntStream.range(5,50).toArray();
        for (int i = 0; i < array4.length; i++) {
            System.out.print(array4[i]+ ",");
        }

        /*IntStream.range - accepts start and end(inclusive) of expected array
         * and create a array with consecutive elements
         * in below case 50 will be added in array*/
        System.out.print("\narray5:");
        int[] array5= IntStream.rangeClosed(5,50).toArray();
        for (int i = 0; i < array5.length; i++) {
            System.out.print(array5[i]+ ",");
        }

          System.out.print("\narray6:");
        int[] array6= IntStream.of(1,2,3,4).toArray();
        for (int i = 0; i < array6.length; i++) {
            System.out.print(array6[i]+ ",");
        }
        System.out.print("\nSortedArray7:");
        int[] array7= IntStream.of(100,10,200,30,44).sorted().toArray();
        for (int i = 0; i < array7.length; i++) {
            System.out.print(array7[i]+ ",");
        }


    }
}
