/**
 * 
 */
package com.vikram.datastructures.greedy;

/**
 * @author Remoz World
 *
 *Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class LeetCodeMaximalSumSubarray53 {
	public int maxSubArray(int[] nums) {

		int maxSum = nums[0];
		int sum = nums[0];

		for(int i=1;i<nums.length;i++) {
			sum = Math.max(nums[i], sum + nums[i]);
			maxSum = Math.max(maxSum, sum); 
		}
		return maxSum;
	}
}
