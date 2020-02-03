package com.vikram.datastructures.recursion.PermutationNdCombination;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

Each number in candidates may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]
 * @author Remoz World
 *
 */
public class CombinationSumII40 {
public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(candidates.length == 0)
            return result;
        
        Arrays.sort(candidates);
        Set<List<Integer>> resultSet = new HashSet<List<Integer>>();
        backTrack(resultSet, new ArrayList<Integer>(), candidates, target, 0);
        result.addAll(resultSet);
        return result;
    }
    
    public void backTrack(Set<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int start) {
        if(target == 0) {
            result.add(new ArrayList<Integer>(temp));
            return;
        }
        
        while(start<candidates.length) {
            if(target < 0)
                break;
            
            temp.add(candidates[start]);
            start++;
            backTrack(result, temp, candidates, target-candidates[start-1], start);
            temp.remove(temp.size()-1);
        }
    }
}
