/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class LeetCodePlusOne {
	public int[] plusOne(int[] nums) {	
		int reminder = 0;
		int[] output = new int[nums.length+1];
		for(int i=nums.length-1;i > 0;i--) {
			nums[i]++;
			if((nums[i]==10)){
				reminder = 1;
			}
			
			output[i]= nums[i]+reminder;
		}
		
		return output;
	}
}
