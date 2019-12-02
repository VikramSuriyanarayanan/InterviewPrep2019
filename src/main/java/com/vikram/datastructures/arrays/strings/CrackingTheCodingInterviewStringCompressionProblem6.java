/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class CrackingTheCodingInterviewStringCompressionProblem6 {
	
	/**
	 * compress given input string.
	 * 
	 * eg. viiiikraaaam ==> v1i4k1r1a4m1
	 * if input < compressed output ==> return input. 
	 */
	public String compressString(String input) {
		StringBuilder output = new StringBuilder();
		char previousChar = input.charAt(0);
		int count = 0;

		for (int i=0; i < input.length(); i++) {
			if (input.charAt(i)== previousChar) {
				count++;
			} else {
				output.append(previousChar);
				output.append(count);
				previousChar = input.charAt(i);
				count = 1;
			}
		}
		
		output.append(previousChar);
		output.append(count);
		
		return output.toString().length() > input.length()? input:output.toString();
	}
}
