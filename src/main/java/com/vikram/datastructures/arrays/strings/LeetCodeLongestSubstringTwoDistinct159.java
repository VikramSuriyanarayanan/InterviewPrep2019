/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Remoz World
 *
 *Given a string s , find the length of the longest substring t  that contains at most 2 distinct characters.

Example 1:

Input: "eceba"
Output: 3
Explanation: t is "ece" which its length is 3.
Example 2:

Input: "ccaabbb"
Output: 5
Explanation: t is "aabbb" which its length is 5.
 */
public class LeetCodeLongestSubstringTwoDistinct159 {
	public int lengthOfLongestSubstringTwoDistinct(String s) {

		int[] map = new int[128];
		int start = 0, end = 0, maxLen = 0, counter = 0;

		while (end < s.length()) {
			final char c1 = s.charAt(end);
			if (map[c1] == 0) counter++;
			map[c1]++;
			end++;

			while (counter > 2) {
				final char c2 = s.charAt(start);
				if (map[c2] == 1) counter--;
				map[c2]--;
				start++;
			}

			maxLen = Math.max(maxLen, end - start);
		}

		return maxLen;

	}
}
