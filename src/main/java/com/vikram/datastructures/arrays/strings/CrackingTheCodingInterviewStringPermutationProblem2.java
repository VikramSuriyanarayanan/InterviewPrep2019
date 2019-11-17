/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.Arrays;

/**
 * @author Remoz World
 *
 */
public class CrackingTheCodingInterviewStringPermutationProblem2 {

	/**
	 * Eg. "original", "nalorigi" => True. 
	 * @param original
	 * @param compare
	 * @return
	 */
	public boolean checkForPermutation(String original, String compare) {
		String sortedOriginal = sortString(original);
		String sortedCompare = sortString(compare);
		
		return sortedOriginal.equals(sortedCompare); 
	}
	
	/**
	 * Main code 
	 * @param input
	 * @return
	 */
	private String sortString(String input) {
		char[] charInput = input.toCharArray();
		Arrays.sort(charInput);		
		return new String(charInput);
	}
	
	private String sortManual(String input) {
		StringBuilder output = null;
		for(char c: input.toCharArray()) {
			
		}
		return null;
	}
}  
