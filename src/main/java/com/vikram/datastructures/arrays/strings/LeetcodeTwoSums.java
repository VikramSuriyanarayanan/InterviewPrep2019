/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class LeetcodeTwoSums {
	    public int[] twoSum(int[] nums, int target) {
	    	int[] result = new int[2];
//			int temp;
			int secondindex = -1;
					
			for(int i=0; i < nums.length; i++) {
//				if ((target <= 0) && (nums[i] <= 0)) {
//					temp = target - nums[i];
//				} else if((target < 0) || (nums[i] < 0)) {
//					temp = target + nums[i];
//				} else if (target > nums[i]) {
//					temp = target - nums[i];
//				} else {
//					temp = nums[i] - target;
//				}
//				
				if((secondindex = contains(target, nums, i)) != -1) {
					result[0] = i;
					result[1] = secondindex;
					return result;
				}
			}
			
	        return result;  	
	    }

	  private int contains(int target, int[] arr, int index) {
		  for (int i=0; i < arr.length;i++) {
			  if ((arr[i] == index) && (i != index))
				  return i;
		  }
	        return -1;
	  }
}
