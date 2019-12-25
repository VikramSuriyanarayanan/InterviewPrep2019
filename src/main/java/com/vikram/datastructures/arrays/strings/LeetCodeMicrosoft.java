package com.vikram.datastructures.arrays.strings;

import java.util.Arrays;

/**
 * Find the max difference in given array
 * @author Remoz World
 *
 */
public class LeetCodeMicrosoft {

	public int findMaxDistance(int[] nums) {
		Arrays.sort(nums);
		int result  = -1;
		for(int i=0,j=1;j<nums.length;i++,j++) {
			if (nums[j]-nums[i] > result) 
				result = nums[j]-nums[i];
		}
		
		return result;
	}
}
