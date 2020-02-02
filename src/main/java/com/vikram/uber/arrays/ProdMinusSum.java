/**
 * 
 */
package com.vikram.uber.arrays;

/**
 * @author Remoz World
 *
 */
public class ProdMinusSum {
	public int prodSum(int number) {
		String num = Integer.toString(number);
		int sum = 0, prod = 1;
		
		for(char c:num.toCharArray()) {
			sum += c-'0';
			prod *= c-'0';
		}
		
		return Math.abs(prod-sum);
		
	}
}
