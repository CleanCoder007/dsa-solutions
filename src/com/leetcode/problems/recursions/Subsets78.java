package com.leetcode.problems.recursions;

import java.util.ArrayList;
import java.util.List;

/*
 https://leetcode.com/problems/subsets/
 Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

* Example 2:
Input: nums = [0]
Output: [[],[0]]

Constraints:
1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.

 */
public class Subsets78 {

    public  static List<List<Integer>> resultSubset = new ArrayList<>();

    public  static void findSubset(int[] nums, int index, List<Integer> combinationsFormedSoFar) {
        //Base Case Condition
        if (index == nums.length) {
//            System.out.println("base case condition called with index, nums.length:"+index +','+ nums.length);
//            System.out.println(combinationsFormedSoFar);
            resultSubset.add(new ArrayList<>(combinationsFormedSoFar));
            return;
        }

        //Do not pick  element at index
        findSubset(nums, index + 1, combinationsFormedSoFar);

        // Pick element at index
        combinationsFormedSoFar.add(nums[index]);
        findSubset(nums, index + 1, combinationsFormedSoFar);
        combinationsFormedSoFar.remove(combinationsFormedSoFar.size()-1);//Back tracking
        //why do we need? because the last element if not removed, we will modify the original list till end
    }

    public static List<List<Integer>> subsets(int[] nums) {

        findSubset(nums,0,new ArrayList<>());
        return resultSubset;

    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3};
        List<List<Integer>> subsets = subsets(array);

        subsets.forEach(System.out::print);
    }
}

