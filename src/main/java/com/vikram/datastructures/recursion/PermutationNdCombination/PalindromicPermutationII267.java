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
		List<String> result = new ArrayList<String>();
        
        if(s.length() == 0)
            return result;
        Set<String> set = new HashSet<String>();
        backTrack(set,new StringBuffer(s),s,0);
        result.addAll(set);
        return result;
	}
	
	public void backTrack(Set<String> result, StringBuffer sb, String s, int start) {
		if(isPalindrome(sb)) {
			result.add(new String(sb.toString()));
		}
		
		for(int i=start;i<s.length();i++) {
            char[] inp = sb.toString().toCharArray();		                                             swap(inp,start,i);
            sb = new StringBuffer(new String(inp));
			backTrack(result,sb,s,start+1);
            swap(inp,start,i);
            sb = new StringBuffer(new String(inp));
		}
	}
	
	public boolean isPalindrome(StringBuffer sb) {
		StringBuffer reverse = new StringBuffer();
		
		for(int i=sb.length()-1;i>=0;i--) {
			reverse.append(sb.charAt(i));
		}
		
		return sb.toString().equals(reverse.toString());
	}  
    
    public void swap(char[] chars, int start, int end) {
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        return;
    }
}
