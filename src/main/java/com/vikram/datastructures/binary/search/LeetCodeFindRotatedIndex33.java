/**
 * 
 */
package com.vikram.datastructures.binary.search;

/**
 * @author Remoz World
 *
 */
public class LeetCodeFindRotatedIndex33 {
	public int search(int[] nums, int target) {
		//O(n) solution:

		/** for (int i=1; i< nums.length;i++) {
	            if (nums[i]< nums[i-1])
	                return i;
	        }
	        return -1;
		 **/
		if (nums.length == 0)
			return -1;

		if (nums.length == 1)
			return nums[0]==target?0:-1;

		int rotate_index = getRotateIndex(nums);
		int left = 0, right = nums.length-1;

		if (target > nums[0]) {
			right = rotate_index;
		} else if(target< nums[0]) {
			left = rotate_index;
		}

		while(left<=right) {
			int mid = (right+left)/2;

			if (nums[mid]==target) {
				return mid;
			}else if (target < nums[mid]) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}

		return -1;
	}

	public int getRotateIndex(int[] nums) {

		int left = 0, right = nums.length-1;
		if (nums[left] < nums[right])
			return 0;

		while(left<=right) {
			int mid = (right+left)/2;

			if (nums[mid]>nums[mid+1]) {
				return mid+1;
			}else if (nums[mid] < nums[left]) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		return 0;
	}
}
