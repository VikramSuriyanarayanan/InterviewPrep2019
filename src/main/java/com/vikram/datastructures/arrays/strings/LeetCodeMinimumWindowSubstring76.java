/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).

Example:

Input: S = "ADOBECODEBANC", T = "ABC"
Output: "BANC"
Note:

If there is no such window in S that covers all characters in T, return the empty string "".
If there is such window, you are guaranteed that there will always be only one unique minimum window in S.

ANS:

1. Use two pointers: start and end to represent a window.
2. Move end to find a valid window.
3. When a valid window is found, move start to find a smaller window.
To check if a window is valid, we use a map to store (char, count) for chars in t. And use counter for the number of chars of t to be found in s. The key part is m[s[end]]--;. We decrease count for each char in s. If it does not exist in t, the count will be negative.

https://leetcode.com/problems/minimum-window-substring/discuss/26808/here-is-a-10-line-template-that-can-solve-most-substring-problems
 */
public class LeetCodeMinimumWindowSubstring76 {

	public String findMin(String s, String t) {
		int[] arr = new int[128];

		for (Character c:t.toCharArray())
			arr[c]++;

		int left=0, right = 0, counter = t.length(), minStart = 0, minLength = Integer.MAX_VALUE;

		while(right<s.length()) {
			char c1 = s.charAt(right);
			if (arr[c1]>0)
				counter--;
			arr[c1]--;
			right++;

			while (counter == 0) {
				if (minLength > right-left) {
					minLength = right-left;
					minStart = left;
				}
				char c2 = s.charAt(left);
				if (arr[c2]>=0)
					counter++;
				arr[c2]++;
				left++;
			}
		}

		return minLength == Integer.MAX_VALUE ? "": s.substring(minStart,minStart+minLength);

	}
}
