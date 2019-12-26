/**
 * Given a string s that consists of only uppercase English letters, you can perform at most k operations on that string.

In one operation, you can choose any character of the string and change it to any other uppercase English character.

Find the length of the longest sub-string containing all repeating letters you can get after performing the above operations.

Note:
Both the string's length and k will not exceed 104.

Example 1:

Input:
s = "ABAB", k = 2

Output:
4

Explanation:
Replace the two 'A's with two 'B's or vice versa.
 

Example 2:

Input:
s = "AABABBA", k = 1

Output:
4

Explanation:
Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class LeetCodeLongestRepeatingCharacterReplacement424 {

	public int findReplacement(String s, int k) {
		int[] char_count = new int[128];
		int start = 0, end = 0, maxCount = 0, maxLen = 0;
		
		while(end < s.length()) {
			char c1 = s.charAt(end);
			char_count[c1]++;
			end++;
			maxCount = Math.max(maxCount, char_count[c1]);
			
			while(end-start-maxCount > k) {
				char c2 = s.charAt(start);
				char_count[c2]--;
				start++;
			}
			
			maxLen = Math.max(maxLen, end-start);
		}
		
		return maxLen;
	}
}
