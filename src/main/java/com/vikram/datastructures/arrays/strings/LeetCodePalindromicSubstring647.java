package com.vikram.datastructures.arrays.strings;

/**
 * 
 * Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.

Example 1:

Input: "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
 

Example 2:

Input: "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 

Example 3:

Input: "madam"
Ouput: 7
Explanation: Seven palindromic strings: "m","a","d","a","m","ada","madam".
Note:

The input string length won't exceed 1000.

 * @author Remoz World
 *
 */
public class LeetCodePalindromicSubstring647 {
	 public int countSubstrings(String s) {
	        if (s == null || s.equals(""))
	            return 0;
	        
	        int maxCount = 0;
	        for(int i=0;i<s.length();i++) {
	            int len1 = extendFromCenter(s,i,i);
	            maxCount += len1;
	            int len2 = extendFromCenter(s,i,i+1);
	            maxCount += len2;
	        }
	        
	        return maxCount;
	    }
	    
	    public int extendFromCenter(String s, int start, int end) {
	        if (s == null || s.equals(""))
	            return 0;
	        int count = 0;
	        while(end < s.length() && start >= 0 && s.charAt(end)==s.charAt(start)) {
	            start--;
	            end++;
	                     
	            if (end-start-1 > 0)
	                count++;
	        }

	        return count;
	    }
}
