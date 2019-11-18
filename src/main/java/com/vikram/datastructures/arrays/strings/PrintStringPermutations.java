/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class PrintStringPermutations {

	public void printStringPermutations(String input, String answer) {
		
		if (input.length() == 0) {
			System.out.println(answer + " ");
			return;
		}
		
		for(int i=0; i < input.length(); i++) {
			char ch = input.charAt(i); 
			
			String ros = input.substring(0, i) +  
                       input.substring(i + 1); 
			printStringPermutations(ros, answer + ch); 
		}
	}
}
