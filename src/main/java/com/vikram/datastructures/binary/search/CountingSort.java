/**
 * 
 */
package com.vikram.datastructures.binary.search;

/**
 * @author Remoz World
 *
 */
public class CountingSort {
	
	int[] int_count = new int[10];

	/**
	 * @param args
	 */
	public int[] performCountingSort(int[] nums) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<nums.length;i++)
			int_count[nums[i]]++;
		
		for(int i=0, j=0;i<10;i++) {
			while(int_count[i]-- != 0) {
				nums[j]= i;
				j++;
			}
		}
		
		return nums;
	}
}
