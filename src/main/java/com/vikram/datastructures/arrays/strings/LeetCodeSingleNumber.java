/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Remoz World
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
 */
public class LeetCodeSingleNumber {

	 public int singleNumber(int[] nums) {
	        Map<Integer,Integer> inte = new HashMap<Integer, Integer>();
	        int counter = 0;
	        
	        for(int i=0; i < nums.length; i++) {
	        	if (inte.containsKey(nums[i])) {
	        		  counter = inte.get(nums[i]);
	        		  counter++;
	        		  inte.put(nums[i], counter);
	        	} else {
	        		inte.put(nums[i], 1);
	        	}
	        }
	        
	         for(Integer key:inte.keySet()) {
	        	 if (inte.get(key)== 1) {
	        		 return key;
	        	 }
	         }
	        
	        return -1;
	    }
}
