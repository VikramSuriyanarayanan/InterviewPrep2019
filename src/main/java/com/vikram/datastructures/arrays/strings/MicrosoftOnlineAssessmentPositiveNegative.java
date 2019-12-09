/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.HashSet;

/**
 * @author Remoz World
 *
Write a function that, given an array A of N integers, returns the lagest integer K > 0 such that both values K and -K exisit in array A. If there is no such integer, the function should return 0.

Example 1:

Input: [3, 2, -2, 5, -3]
Output: 3
Example 2:

Input: [1, 2, 3, -4]
Output: 0
 */
public class MicrosoftOnlineAssessmentPositiveNegative {
	public int findPositiveNegIndex(int[] nums) {
		HashSet<Integer> val = new HashSet<Integer>();
		int max = 0;
		if (nums.length < 1) 
			return 0;
		
		for (int i =0;i < nums.length;i++) {
			if (val.contains(Math.abs(nums[i])) && (Math.abs(nums[i]) > max))
				max = Math.abs(nums[i]);
			else 
				val.add(Math.abs(nums[i]));
		}
		
		return max;
	}
}
