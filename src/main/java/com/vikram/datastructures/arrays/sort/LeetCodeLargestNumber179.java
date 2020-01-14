/**
 * 
 */
package com.vikram.datastructures.arrays.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Remoz World
 * 
 * Given a list of non negative integers, arrange them such that they form the largest number.

Example 1:

Input: [10,2]
Output: "210"
Example 2:

Input: [3,30,34,5,9]
Output: "9534330"
Note: The result may be very large, so you need to return a string instead of an integer.
 */
public class LeetCodeLargestNumber179 {
	 public String largestNumber(int[] nums) {
	        
	        String[] input = new String[nums.length];
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<nums.length;i++) {
	            input[i] = Integer.toString(nums[i]);
	        }
	        
	        Comparator<String> comp = (String n1,String n2)-> {
	            String order1 = n1+n2;
	            String order2 = n2+n1;
	            return order2.compareTo(order1);
	        };
	        
	        Arrays.sort(input, comp);
	            
	        for(String s:input)
	            sb.append(s);
	        
	        if(input[0].equals("0"))
	            return "0";
	        
	        return sb.toString();
	    }
}
