/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.*;
/**
 * @author Remoz World
 *
 */
/* String has all unique characters */

public class CrackingTheCodingInterviewProblem1 {

	private List<Character> inputList = new ArrayList<Character>();

	/**
	 * Finding for unique chars with hashTable
	 * 
	 * E.g if input = "Vikram" => True
	 * "Vikramm" => False
	 * 
	 * @param input
	 * @return {@code boolean}
	 */
	protected boolean isUnique(String input) {
		if(input == null || input=="")
			return false;
		
		for (char c:input.toCharArray()) {
			if (inputList.contains(c))
				return false;
			inputList.add(c);
		}
		return true;
	}

}
