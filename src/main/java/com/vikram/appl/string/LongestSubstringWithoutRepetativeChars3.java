/**
 * 
 */
package com.vikram.appl.string;

/**
 * @author Remoz World
 *Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepetativeChars3 {
	public int getLongestSubStringLength(String input) {
		int[] char_count = new int[26];
		
		if(input.length()==0)
			return 0;
		
		int start=0,end=0,len=0,maxLen=0;
		//abcababacde
		while(end<input.length()) {
			if(char_count[input.charAt(end)-'a'] ==0) {
				len=end-start+1;
				char_count[end]++;
				end++;
			} else {
				maxLen = Math.max(len, maxLen);
				len=0;
				char_count[input.charAt(start)-'a']--;
				start++;
			}			
		}
		
		//maxLen = Math.max(len, maxLen);
		
		return maxLen;
	}
}
