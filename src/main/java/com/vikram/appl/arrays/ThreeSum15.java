/**
 * 
 */
package com.vikram.appl.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Remoz World
 *Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
//This sol will return non-unique pairs too, I wrote it coz to simplify the solution
//if you want the accurate solution, then enhance from here or look at 3sum triplet solution. 
//https://www.youtube.com/watch?v=qJSPYnS35SE
public class ThreeSum15 {
	public List<List<Integer>> get3Sum(int[] nums) {
		if(nums.length < 3)
			return null;

		Arrays.sort(nums);
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		for(int i=0;i<nums.length-2;i++) {
			int sum = 0-nums[i];

			int hi = nums.length-1, lo = i+1;
			while(lo < hi) {
				if(nums[lo]+nums[hi]==sum) {
					output.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
					lo++;
					hi--;
				} else if (nums[lo]+nums[hi]>sum)
					hi--;
				else 
					lo++;
			}
		}
			return output;
	}
}
