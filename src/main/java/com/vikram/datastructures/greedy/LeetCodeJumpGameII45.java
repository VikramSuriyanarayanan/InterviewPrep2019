/**
 * 
 */
package com.vikram.datastructures.greedy;

/**
 * @author Remoz World
 *
 *Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

Example:

Input: [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2.
    Jump 1 step from index 0 to 1, then 3 steps to the last index.
Note:

You can assume that you can always reach the last index.
 */
public class LeetCodeJumpGameII45 {
	 public int jump(int[] nums) {    
	        //https://www.youtube.com/watch?v=vBdo7wtwlXs
	        
	        if (nums.length <= 1)
	            return 0;
	        
	        int ladder = nums[0], stairs = nums[0], jump=1;
	        
	        for(int level=1;level<nums.length;level++) {
	            if(level==nums.length-1)
	                return jump;
	            
	            if(nums[level]+level>ladder) {
	                ladder = level + nums[level];
	            }
	            
	            stairs--;
	            
	            if(stairs ==0) {
	                jump++;
	                stairs = ladder-level;
	            }
	                
	                
	        }
	                
	    
	        return jump;
	    }
}
