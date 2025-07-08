package com.leetcode.problems;
/*
* 977. Squares of a Sorted Array
* https://leetcode.com/problems/squares-of-a-sorted-array/description/
*
*
* */
public class SquaresSortedArray {

    public int[] sortedSquares(int[] nums) {
        int[] copy=  nums.clone();
//        printArray(copy);
        int p = nums.length-1;
        int q = 0;
        int r = nums.length-1;

        while( p >= 0 && r>=0){
//            System.out.println("nums[p] * nums[p] > nums[q] * nums[q] :" +nums[p]+ "*"+ nums[q]);
            if( (nums[ p ] * nums[ p ] )> (nums[ q ] * nums[ q ] )) {
                copy[ r ] = nums[ p ] * nums[ p ];
                p= p - 1;
            }
            else {
                copy[ r ] =  nums[ q ] * nums[ q ];
                q= q + 1;
            }
            r=r-1;
//            printArray(copy);
        }
        return copy;
    }
    public static void main(String[] args) {
        int [] nums = new int[] {-4,-1,0,3,10};
    SquaresSortedArray squaresSortedArray = new SquaresSortedArray();
        nums=squaresSortedArray.sortedSquares(nums);
        printArray(nums);

    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num+",");
        }
        System.out.println("\n***************");
    }
}

/*
*  {-4,-1,0,3,10}
*  {16,1,0,9,100}
*  {0,1,9,16,100}
*
* */