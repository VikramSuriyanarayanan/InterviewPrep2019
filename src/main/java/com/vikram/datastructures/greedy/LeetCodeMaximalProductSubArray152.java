/**
 * 
 */
package com.vikram.datastructures.greedy;

/**
 * @author Remoz World
 *
 *Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

Input: [-2, 3, -4]
Output: 24

 */
public class LeetCodeMaximalProductSubArray152 {

	public int findMaxProduct(int[] nums) {
		int maxProd = nums[0];
		int min = nums[0];
		int result = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			//prod = Math.max(nums[i], prod*nums[i]);
			//maxProd = Math.max(maxProd, prod);
			
			int temp = maxProd;
            maxProd = Math.max(Math.max(maxProd * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (maxProd > result) {
                result = maxProd;
            }
		}
		
		return result;
	}
}
