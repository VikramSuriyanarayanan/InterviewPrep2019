/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class CrackingTheCodingInterviewStringRotationProblem8 {

	/**
	 * Checks if given comparison string is a rotation of input string
	 * @param input
	 * @param compare
	 * @return
	 */
	public boolean isStringRotated(String input, String compare) {
		input = input+ input;
		return isSubstring(input,compare);
	}

	/**
	 * This Algorithm is wrong, Use Boyer-Moore and Knuth-Morris-Pratt algorithms.
	 * @param input
	 * @param compare
	 * @return
	 */
	private boolean isSubstring(String input, String compare) {
		int j=0;
		for(int i=0; i < input.length();i++) {
			if(input.charAt(i) == compare.charAt(j)) {
				j++;
			}
			
			if(j==compare.length()) {
				return true;
			}
		}
		
		
		
		return false;
	}
}
