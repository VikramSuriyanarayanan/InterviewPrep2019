/**
 * 
 */
package com.vikram.uber.arrays;

/**
 * @author Remoz World
 *
 *Given an integer number n, return the difference between the product of its digits and the sum of its digits.

 */
public class CalcProdSum1281 {
	public int calcProductSum(int num) {
		
		String val = Integer.toString(num);
		int sum = 0, prod = 1 ;
		for(char c:val.toCharArray()) {
			sum += c -'0';
			prod *= (c-'0');
		}
		
		return prod-sum;
	}
}
