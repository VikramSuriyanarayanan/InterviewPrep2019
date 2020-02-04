/**
 * 
 */
package com.vikram.datastructures.recursion.PermutationNdCombination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Remoz World
 *
 Given a collection of numbers that might contain duplicates, return all possible unique permutations.

Example:

Input: [1,1,2]
Output:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
 */
public class PermutationIandII47 {
	public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(nums.length==0)
            return result;
        
        List<Integer> temp = new ArrayList<Integer>();
        for(int num:nums) {
           temp.add(num); 
        }
        
        backTrack(result, temp,nums, 0);
        
        return result;
        
    }
    
    public void backTrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        if(!result.contains(temp) && temp.size()==nums.length) {
            result.add(new ArrayList<Integer>(temp));
        }
               
        for(int i=start;i<nums.length;i++) {           
            Collections.swap(temp, start, i);
            backTrack(result, temp, nums, start+1);
            Collections.swap(temp, start, i);
        }
    }
}
