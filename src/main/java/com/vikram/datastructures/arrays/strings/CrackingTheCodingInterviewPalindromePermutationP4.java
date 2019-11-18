/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Remoz World
 *
 */
public class CrackingTheCodingInterviewPalindromePermutationP4 {

	List<String> permutationList = new ArrayList<String>();
	boolean distinctLetters[] = new boolean[26];
	
	Map<Character, Integer> countChars = new HashMap<Character, Integer>();

	/**
	 * Checks if any of given input string's permutations is a palindrome.
	 * e.g: "madame" --> One of its permutation is "madam" , it would return true.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isPermutationPalindrome(String input) {
		generatePermutation(input,"");
		System.out.println("List of permutations: "+ permutationList.toString());
		for(String s:permutationList) {
			if(isPalindrome(s))
				return true;
		}
		return false;
	}
	
	/**
	 * Checks whether given string is palindrome or not. 
	 * 
	 * @param input
	 * @return
	 */
	protected boolean isPalindrome(String input) {
		StringBuilder reverseString = new StringBuilder();
		for(int i=input.length()-1; i>=0;i--) {
			reverseString.append(input.charAt(i));
		}
			
		return reverseString.toString().equals(input);
	}
	
	/**
	 * Create permutation of all strings and add to list
	 * see {@link https://www.geeksforgeeks.org/print-all-permutations-of-a-string-in-java/}
	 * 
	 * @param input
	 * @param answer 
	 */
	protected void generatePermutation(String input, String answer) {
		if (input.length() == 0) {
			permutationList.add(answer);
			return;
		}
		
		for(int i=0; i < input.length(); i++) {
			char ch = input.charAt(i); 
			
			String ros = input.substring(0, i) +  
                       input.substring(i + 1); 
			generatePermutation(ros, answer + ch); 
		}
	}
	
	/**
	 * Cracking the coding interview solution
	 * 
	 * Count the no of odds and evens of chars. If no of odds exceed more than 1 then, its not a palindrome. 
	 */
	public boolean recommendedPermutationPalindrome(String input) {
		boolean oneOdd = false;
		
		
		for (char c : input.toCharArray()) {
			if (countChars.containsKey(c)) {
				int count = countChars.get(c);
				count++;
				countChars.put(c, count);
			} else {
				countChars.put(c, 1);
			}
		}
		
		for (Integer i:countChars.values()) {
			if ((i%2 != 0) && oneOdd) {
				return false;
			} else if (i%2 !=0) {
				oneOdd = true;
			}
		}
		
		return true;
	}
}
