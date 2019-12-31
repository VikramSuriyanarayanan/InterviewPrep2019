/**
 * 
 */
package com.vikram.datastructures.queue.leetcode;

/**
 * @author Remoz World
 *Given a max heap, find the minimum element present in the heap.

Examples:

Input :     100
           /    \ 
          75     50 
         /  \    / \
       55   10  2  40
Output : 2

Input :     20
           /   \ 
          4    18
Output : 4
 */
public class MinElementInMaxHeap {
	public int findMinElement(int[] nums) {
		
		if(nums.length <1)
			return -1;
		
		int min = Integer.MAX_VALUE;
		for(int i=nums.length/2;i<nums.length;i++)
			min = Math.min(min, nums[i]);
		return min;
	}
}
