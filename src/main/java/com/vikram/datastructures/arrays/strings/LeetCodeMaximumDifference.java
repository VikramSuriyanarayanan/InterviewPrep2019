/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Remoz World
 *
 */
public class LeetCodeMaximumDifference {
	public int maximumGap(int[] nums) {
		if(nums.length < 2)
			return 0;
		
        Arrays.sort(nums);
        int maximalDifference = 0;
        
        for (int i=0;i < nums.length; i++) {
        	if(nums[i+1]-nums[i] > maximalDifference)
        		maximalDifference = nums[i+1]-nums[i];
        }
        
        return maximalDifference;
    }
}
