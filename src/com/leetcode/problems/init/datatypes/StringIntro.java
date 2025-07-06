package com.leetcode.problems.init.datatypes;

public class StringIntro {
    public static void main(String[] args) {
        String str ="abcd";
        System.out.println(str.charAt(0));

        System.out.println(str.substring(2,4));

        String str2 = "abcd";

        if(str==str2){ //address comparison
            System.out.println("This will not be printed as above comparison is not content comparison");
            //but this is condition is true Need to check.
        }

        String s3 = new String("world"); // A new object "world" is created in the heap
        String s4 = new String("world"); // Another new object "world" is created in the heap
        System.out.println(s3 == s4); // Output: false (they are different objects, even if content is same)

//        Always compare two string using .equals method.
    }
}
