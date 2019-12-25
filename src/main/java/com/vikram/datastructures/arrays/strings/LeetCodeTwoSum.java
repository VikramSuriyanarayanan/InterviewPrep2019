/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class LeetCodeTwoSum {
	public int findFairIndex(int[] num1, int[] num2) {
		int count = 0;
		int sum1 = 0;
		int sum2 = 0;
		int intsum1=0, intsum2 = 0;
		
		for(int i=0;i<num1.length;i++) {
			sum1 += num1[i];
			sum2 += num2[i];
		}
		
		for (int i=0;i<num1.length;i++) {
			intsum1 += num1[i];
			intsum2 += num2[i];

			boolean bool1 = calcDiff(sum1, intsum1);
			boolean bool2 = calcDiff(sum2, intsum2);
			
			if (bool1 && bool2)
				count++;
		}
		
		return count;
	}
	
	public boolean calcDiff(int total, int inter) {
		int diff = 0;
		if (inter > 0) {
			diff = total - inter;
		} else {
			diff = total +inter;
		}
		
		return total == diff;
	}
}
