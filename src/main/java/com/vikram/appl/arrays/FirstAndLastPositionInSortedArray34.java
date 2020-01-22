/**
 * 
 */
package com.vikram.appl.arrays;

/**
 * @author Remoz World
 *
 *Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
 */
public class FirstAndLastPositionInSortedArray34 {
	//FIRST ATTEMPT:
	/**public int[] searchRange(int[] nums, int target) {
        int[] output = {-1,-1};
        
        int lo = 0, hi=nums.length-1;
        
        while(lo<hi) {
            int mid = (lo +(hi-lo))/2;
            
            if(nums[mid] == target) {
                lo = mid;
                hi = mid;
                while((lo>=0 && nums[lo] == target)) {
                    if(nums[lo] == target) {
                        output[0]=lo;
                        lo--;
                    }
                }
                
                while(hi<nums.length && nums[hi] == target) {                  
                    if(nums[hi]==target) {
                        output[1] = hi;
                        hi++;
                    }
                }
                break;
            }
            
            if (nums[mid] < target) {
                lo = mid+1;
            } else if (nums[mid]>target) {
                hi = mid;
            }
        }
        
        return output;
    }**/
	
	public int[] searchRange(int[] nums, int target) {
        int[] output = {-1,-1};
        
        for(int lo = 0 ;lo<nums.length;lo++){
            if(nums[lo]==target) {
                output[0]=lo;
                break;
            }
        }
        
        for(int hi=nums.length-1;hi>=0;hi--) {
            if(nums[hi]==target) {
                output[1]=hi;
                break;
            }
        }
       
        
        return output;
    }
}
