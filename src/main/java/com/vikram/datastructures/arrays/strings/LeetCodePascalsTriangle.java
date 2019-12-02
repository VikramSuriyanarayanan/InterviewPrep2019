/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Remoz World
 *
 */
public class LeetCodePascalsTriangle {

	public List<List<Integer>> generatePascalsTriangle(int length) {
		List<List<Integer>> nums = new ArrayList<List<Integer>>();
		
		for(int i=0;i <length;i++) {
			List<Integer> arr = new ArrayList<Integer>();
			List<Integer> prev = null;
			int j = i;

			if(i !=0) {
				prev = nums.get(i-1);
			}

			while(j>=0) {
				if((j != 0) && (j != i)) {
					int val = prev.get(j-1) + prev.get(j);
					arr.add(val);
				} else {
					arr.add(1);
				}
				j--;
			}
			nums.add(arr);
		}
		
		return nums;
	}
}
