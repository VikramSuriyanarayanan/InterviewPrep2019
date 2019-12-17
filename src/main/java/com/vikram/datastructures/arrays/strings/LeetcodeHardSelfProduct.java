/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.LinkedList;

/**
 * @author Remoz World
 
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
 */
public class LeetcodeHardSelfProduct {

public int[] productExceptSelf(int[] nums) {
		int[] output = new int[nums.length];
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		
		left[0]=1;
		right[nums.length-1]=1;
		
		//fill left
		for (int i=1; i< nums.length;i++) {
			left[i]=left[i-1]*nums[i-1];
		}
		
		
        for(int j=nums.length-2; j>=0;j--) {
        	right[j]=right[j+1]*nums[j+1];
        }
        
        for(int k=0;k<nums.length;k++) {
        	output[k] = left[k]*right[k];
        }
    
	return output;
}
}
