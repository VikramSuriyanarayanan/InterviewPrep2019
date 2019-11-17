/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class CrackingTheCodingInterviewURLifyProblem3 {

	/**
	 * Eg. MR John Smith => MR%20John%20Smith
	 * 
	 * @param input
	 * @return
	 */
	public String replaceSpaces(String input) {
		StringBuilder output = new StringBuilder();
		for(char c: input.toCharArray()) {
			if (c == ' ') {
				output.append("%20");
			} else {
				output.append(c);
			}
		}
		
		return output.toString();
	}
}
