/**
 * 
 */
package com.vikram.datastructures.recursion.PermutationNdCombination;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Remoz World
 *
 *
Given a string s, return all the palindromic permutations (without duplicates) of it. Return an empty list if no palindromic permutation could be form.

Example 1:

Input: "aabb"
Output: ["abba", "baab"]
Example 2:

Input: "abc"
Output: []
 */
public class PalindromicPermutationII267 {
    public List<String> generatePalindromes(String s) {
		Set<String> result = new HashSet<String>();
		if(s.length() == 0)
			return null;
		
		backTrack(result,new StringBuffer(),s,0);
        
        List<String> finalList = new ArrayList<String>();
        finalList.addAll(result);
		return finalList;
	}
	
	public void backTrack(Set<String> result, StringBuffer sb, String s, int start) {
		if(!sb.toString().equals("") && isPalindrome(sb)) {
			if(sb.length() == 4)
				result.add(sb.toString());
			return;
		}
		
		for(int i=start;i<s.length();i++) {
			sb.append(s.charAt(start));
			backTrack(result,sb,s,start);
		}
	}
	
	public boolean isPalindrome(StringBuffer sb) {
		StringBuffer reverse = new StringBuffer();
		
		for(int i=sb.length()-1;i>=0;i--) {
			reverse.append(sb.charAt(i));
		}
		
		return sb.toString().equals(reverse.toString());
	} 
}
