package com.geekforgeeks.problems;

public class Segregate0And1s {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.segregate0and1(new int[]{0, 0, 1, 1, 0});

    }
}

// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        // [1,1,1,1,1]
        //  l/r
        //.
        int left=0;
        int right=arr.length-1;
        int r = 0;
        while(r!= arr.length-1){
            while(arr[left] == 0 & left<arr.length-1){
                left ++;
            }
            while(arr[right] == 1 && right>0){
                right --;
            }
            //swap left and right
            if(left < right){

                arr[left]=0;
                arr[right]=1;
            }
            r++;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}