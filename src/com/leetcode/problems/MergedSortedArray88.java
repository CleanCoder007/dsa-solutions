package com.leetcode.problems;

import java.util.Arrays;

/*
* https://leetcode.com/problems/merge-sorted-array/description/
*
*
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
*
* */
public class MergedSortedArray88 {
    /*
     * Time Complexity : O(M) + O(N) + O(M+N)LOG(M+N) : ~ O(M+N)LOG(M+N)
     * First Loop : O(M)
     * Second Loop: O(N)
     * Third Loop to Sort: O(M+N)LOG(M+N)
     *
     * Space Complexity: O(M+N)
     *
     * O(1) < O(LOGN) < O(N) <O(NLOGN) < O(N^2)
     * */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] combinedArray = new int[m+n];
        for(int i=0; i<m ;i ++)
            combinedArray[i] = nums1[i];

        for(int j=0; j<n; j ++)
            combinedArray[m+j] = nums2[j];

        Arrays.sort(combinedArray);

        for(int i=0; i<combinedArray.length; i++)
            nums1[i] = combinedArray[i];

    }
    /*
    *
    * Space Complexity is O(1) now.
    * */
    public void mergeFirstOptimization(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0; j<nums2.length; j ++)
            nums1[m + j] = nums2[j];
        Arrays.sort(nums1);
    }
    /*
     *Time Complexity is
     * Space Complexity is O(1) now.
     * */
    public void mergeFirstOptimized(int[] nums1, int m, int[] nums2, int n) {
        int p = m-1;
        int q = n-1;
        int r = nums1.length-1;

        while(r >= 0 ){
            if( q < 0)
                break;
            if(p >= 0 && nums1[p] >= nums2[q])
                nums1[r --] = nums1[p --];
            else
                nums1[r--] = nums2[q --];
        }

    }


    public static void main(String[] args) {
        MergedSortedArray88 sortedArray88 = new MergedSortedArray88();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
//        sortedArray88.merge(nums1,m,nums2,n);
//        sortedArray88.mergeFirstOptimization(nums1,m,nums2,n);
        sortedArray88.mergeFirstOptimized(nums1,m,nums2,n);
        for (int i : nums1) {
            System.out.print(i+",");
        }
    }
}

