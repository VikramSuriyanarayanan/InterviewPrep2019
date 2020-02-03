/**
 * 
 */
package com.vikram.datastructures.recursion.PermutationNdCombination;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Remoz World
 *
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of times.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
Example 2:

Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]

https://www.youtube.com/watch?v=irFtGMLbf-s
https://leetcode.com/problems/combination-sum-ii/discuss/16878/Combination-Sum-I-II-and-III-Java-solution-(see-the-similarities-yourself)
 */
public class CombinationSum39 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if(candidates.length == 0)
			return result;

		backTrack(result,new ArrayList<Integer>(),candidates, target, 0);
		return result;
	}

	public void backTrack(List<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int start) {

		//base case
		if(target == 0) {
			result.add(new ArrayList<Integer>(temp));
			return;
		}

		for(int i = start;i<candidates.length;i++) {
			if(target < 0)
				break;

			temp.add(candidates[i]);
			backTrack(result,temp,candidates, target-candidates[i], i);
			temp.remove(temp.size()-1);
		}
	}
}
