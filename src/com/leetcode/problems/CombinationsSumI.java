package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/combination-sum/description/
*/
public class CombinationsSumI {

    public static List<List<Integer>> uniqueCombinations= new ArrayList<>();

    public static void main(String[] args) {
        int[] candidates = {2,3,5};
        int target = 8;

        helper(candidates,target,0,new ArrayList<Integer>());

        System.out.println(uniqueCombinations);
    }

    private static void helper(int[] candidates, int target, int index ,List<Integer> combinationsFormedSoFar) {
        //Base Case condition or Termination Conditions
        if(target == 0) {
            uniqueCombinations.add(new ArrayList<>(combinationsFormedSoFar));
            return;
        }
        if(index == candidates.length || target < 0){
            return;
        }
        //Do not pick up element at same index, move ahead
        {
            //Move ahead the index
            helper(candidates,target,index+1,combinationsFormedSoFar);
            //System.out.println("CF after not picking up:"+combinationsFormedSoFar);
        }

        //Pick up element at same index- as in this problem we have freedom of selecting same element n number of times
        {
            //Add the element in combinationsFormedSoFar as we are picking up
            combinationsFormedSoFar.add(candidates[index]);
            //System.out.println("Adding element:"+candidates[index]);
            helper(candidates,target-candidates[index],index,combinationsFormedSoFar);
            //System.out.println("CF after picking up:"+combinationsFormedSoFar);
//            combinationsFormedSoFar.remove(combinationsFormedSoFar.size()-1);
            combinationsFormedSoFar.removeLast();
        }

    }


}
