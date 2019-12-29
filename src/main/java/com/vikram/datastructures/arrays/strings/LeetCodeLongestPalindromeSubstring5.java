/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
 */
public class LeetCodeLongestPalindromeSubstring5 {
	
	public String longestPalindrome(String s) {
        int maxLen=0;
        int left = 0, right = 0;
        
        for(int i=0; i<s.length();i++) {
            int len1 = getCount(s,i,i);
            int len2 = getCount(s,i,i+1);
            maxLen = Math.max(len1, len2);
            if(maxLen > right-left) {
            	left = i -((maxLen-1)/2);
            	right = i + (maxLen/2);
            }
        }
        
        return s.substring(left,right+1);
    }
    
    public int getCount(String s, int start, int end) {
        if (s == null)
            return 0;
        
        while (end < s.length() && start >=0 && s.charAt(end) == s.charAt(start)) {
            start--;
            end++;
        }
        
        return end-start-1;
    }
	
}
