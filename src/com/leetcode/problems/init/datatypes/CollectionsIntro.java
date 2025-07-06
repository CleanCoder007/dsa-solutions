package com.leetcode.problems.init.datatypes;

public class CollectionsIntro {


    public static void main(String[] args) {
        //1D Array
        int[] arr = new int[5]; //initializes array with all zero elements
        arr[0]=1;
        arr[1]=2;
        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println(
        "\nBelow line gives compile time exception  java.lang.ArrayIndexOutOfBoundsException\n"+
        "arr[5]=9;\n"+
        "Array Index is always int other long/Long\n"+
        "Max size of array 10^6 or  10^7\n"
        );

        //2D Array
        int [][] twoDimensionalArray= new int[2][2];
        twoDimensionalArray[0][0]=1;

        for (int[] individualArray : twoDimensionalArray) {
            System.out.print("\n");
            for (int i : individualArray) {
                System.out.print(i+",");
            }
        }

        String str = "123";
        System.out.println("\n"+Integer.parseInt(str));

        //Boxing and Unboxing
        // Converting from primitive to Wrapper classes is Boxing
        // Converting from Wrapper classes to Primitive


    }


}
