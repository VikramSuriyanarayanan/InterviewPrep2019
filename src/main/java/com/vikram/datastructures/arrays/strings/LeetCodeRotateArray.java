/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 *Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
Note:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 */
public class LeetCodeRotateArray {
	
	public int[] rotateEasy(int[] nums, int k) {
        while (k > nums.length)
        	k = k - nums.length;
        
        int output[] = new int[nums.length];
        for(int i=0; i < nums.length; i++) {      	
        	int position = i+nums.length-(k); 
        	if (position >= nums.length) {
        		position = position - nums.length;
        	}
        	output[i] = nums[position];
        }
        return output;
    }
	
	public void rotateInPlace(int[] nums, int k) {
        while (k > nums.length)
        	k = k - nums.length;
        
        for(int i=nums.length-1; i > nums.length; i--) {
        	int position = nums.length+k-1-i;
        	int temp = 0;
        	
        	while (position >= nums.length) {
        		position = position - nums.length;
        	}
        	
        	temp = nums[i];
        	nums[i] = nums[position];
        	nums[position] = temp;
        }
        return;
    }
}
