/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Remoz World
 *Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Note:

Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class LeetCodeArrayIntersection {

	public int[] intersect(int[] nums1, int[] nums2) {
		int outputLength;
		int counter = 0;
		int outputCounter = 0;
		
		Map<Integer, Integer> intermediateMap = new HashMap<Integer,Integer> ();
		List<Integer> intermediateList = new ArrayList<Integer>();					

		for(int i=0; i < nums1.length; i++) {
        	if (intermediateMap.containsKey(nums1[i])) {
        		  counter = intermediateMap.get(nums1[i]);
        		  counter++;
        		  intermediateMap.put(nums1[i], counter);
        	} else {
        		intermediateMap.put(nums1[i], 1);
        	}
        }
		
		for(int j=0; j < nums2.length;j++) {
			if (intermediateMap.containsKey(nums2[j]) && (intermediateMap.get(nums2[j])> 0)) {
				intermediateList.add(nums2[j]);
				outputCounter++;
				int internalCount = intermediateMap.get(nums2[j]);
				internalCount--;
				intermediateMap.put(nums2[j], internalCount);
			}			
		}
		
		int[] output = new int[intermediateList.size()];

		for(int i=0; i<intermediateList.size();i++) {
			output[i]=intermediateList.get(i);
		}
		return output;	
	}
}
