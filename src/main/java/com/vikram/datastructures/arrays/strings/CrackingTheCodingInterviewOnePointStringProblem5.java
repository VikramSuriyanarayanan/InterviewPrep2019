/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class CrackingTheCodingInterviewOnePointStringProblem5 {
	
	/**
	 * pale, bale ==> true
	 * pale, pbale ==> true
	 * pale, pal => true
	 * pale, pbbbale ==> false
	 * 
	 * @param input1
	 * @param input2
	 * @return
	 */
	public boolean oneStep(String input1, String input2) {
		
		if (input1.length() == input2.length()) {
			return oneStepReplacement(input1, input2);
		} else if (input1.length()+1 == input2.length()){
			return oneStepInsert(input1, input2);
		} else if (input1.length() == input2.length()+1) {
			return oneStepInsert(input2, input1);
		}
		
		return false;
	}

	private boolean oneStepInsert(String input1, String input2) {
		boolean duplicate = false;
		int j=0;
		for(int i=0; i < input1.length();i++) {
			if((input1.charAt(i) != input2.charAt(j)) && duplicate) 
				return false;
			else if ((input1.charAt(i) != input2.charAt(j))) {
				j++;
				duplicate = true;
			}
			j++;
		}
		return true;
	}

	private boolean oneStepReplacement(String input1, String input2) {
		boolean duplicate = false;
		for(int i=0; i < input1.length();i++) {
			if ((input1.charAt(i) != input2.charAt(i)) && duplicate) {
				return false;
			} else if (input1.charAt(i) != input2.charAt(i))
				duplicate = true;
		}
		return true;
	}
}
