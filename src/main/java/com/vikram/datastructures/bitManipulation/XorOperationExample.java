/**
 * 
 */
package com.vikram.datastructures.bitManipulation;

/**
 * @author Remoz World
 *
 */
public class XorOperationExample {
	public int doXOR(int[] nums) {
		int missing = nums.length;
		for (int i = 0; i < nums.length; i++) {
			missing ^= i ^ nums[i];
		}
		return missing;
	}
}
