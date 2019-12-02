package com.vikram.datastructures.arrays.strings;

import java.util.Arrays;

/**Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 **/
public class LeetCodeMoveZeros {
	public void moveZeroes(int[] nums) {
		for(int i=0, j=1; i < nums.length && j < nums.length;i++,j++) {
			if(nums[i]==0 && nums[j] != 0) {
				swap(nums, i, j);
				System.out.println(Arrays.toString(nums));
			} else if ((nums[i] == 0) && (nums[j] == 0)) {
				i--;
			}
		}
	}
	
	/**
	 * Reverse integer. 
	 * 
	 * @param nums
	 * @param start
	 * @param end
	 */
	public void swap(int[] nums, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}
}
