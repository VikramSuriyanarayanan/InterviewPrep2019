/**
 * 
 */
package com.vikram.uber.arrays;

import java.util.Arrays;

/**
 * @author Remoz World
 *
 */
public class ComparatorElement {
	public int compareArrays(int[] num1, int[] num2, int diff) {
		if(num1.length==0 || num2.length==0) {
		 	return 0;
		}
		 	
		int count = 0;
		
		Arrays.sort(num1);
		Arrays.sort(num2);
		
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num2.length;j++) {
				if(Math.abs(num1[i]-num2[j])<diff) {
					count++;
				}
			}
		}
		
		return count;
	}
	
	
	public int attempt2(int[] arr1, int[] arr2, int diff) {
		if(arr1.length<1 || arr2.length<1)
			return 0;
		
		int i=0,j=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		while(i<arr1.length && j<arr2.length) {
			if()
		}
	}
} 
