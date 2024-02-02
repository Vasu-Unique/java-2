package Leetcode;
import java.util.*;
class CombinationSum39 {
    public static void main(String args[])
    {
        CombinationSum39 obj =new CombinationSum39();
        int[] candidates = {2, 3, 6, 7};
        int target=7;
        List<List<Integer>> result = obj.combinationSum(candidates, target);
        System.out.println("Output: " + result);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates==null)
        {
            return null;
        }
        List<List<Integer>> result = new ArrayList();
        find(candidates,0,target,new ArrayList<>(),result);
        return result;
    }

    public void find(int[] candidates,int index, int target,List<Integer> current, List<List<Integer>> result)
    {
        if(target==0)
        {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=index;i<candidates.length;i++)
        {
            if(candidates[i]<=target)
            {
                current.add(candidates[i]);
                find(candidates, i, target-candidates[i], current, result);
                
                current.remove(new Integer(candidates[i]));
            }
        }
    }
}

/* 
Given an array of distinct integers candidates and a target integer target, return a list of all unique
combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 
150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:

Input: candidates = [2], target = 1
Output: []

*/