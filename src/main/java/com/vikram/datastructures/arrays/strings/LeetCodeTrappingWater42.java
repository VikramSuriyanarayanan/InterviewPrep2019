/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 *Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.


The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!

Example:

Input: [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
 */
public class LeetCodeTrappingWater42 {
	  public int trap(int[] height) {
	        int[] left_max = new int[height.length];
	        int[] right_max = new int[height.length];
	        int sum=0;
	        
	        left_max[0] = height[0];
	        
	        for(int i=1;i<height.length;i++){
	            left_max[i] = Math.max(left_max[i-1], height[i]);
	        }
	        
	        right_max[height.length-1] = height[height.length-1];
	        
	        for(int i=height.length-2;i>=0;i--) {
	            right_max[i]=Math.max(height[i],right_max[i+1]);
	        }
	        
	        for(int i=0;i<height.length;i++)
	            sum += Math.min(left_max[i],right_max[i])-height[i];
	        
	        return sum;
	    }
}
