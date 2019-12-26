/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Remoz World
 *
 *Given an array A of 0s and 1s, we may change up to K values from 0 to 1.

Return the length of the longest (contiguous) subarray that contains only 1s. 

 

Example 1:

Input: A = [1,1,1,0,0,0,1,1,1,1,0], K = 2
Output: 6
Explanation: 
[1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
Example 2:

Input: A = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], K = 3
Output: 10
Explanation: 
[0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1.  The longest subarray is underlined.
 

Note:

1 <= A.length <= 20000
0 <= K <= A.length
A[i] is 0 or 1 
 */
public class LeetCodeMaxConsecutiveIII1004 {
	public int longestOnes(int[] A, int K) {
		int left = 0, right;
		for (right = 0; right < A.length; right++) {
			// If we included a zero in the window we reduce the value of K.
			// Since K is the maximum zeros allowed in a window.
			if (A[right] == 0) K--;
			// A negative K denotes we have consumed all allowed flips and window has
			// more than allowed zeros, thus increment left pointer by 1 to keep the window size same.
			if (K < 0) {
				// If the left element to be thrown out is zero we increase K.
				if (A[left] == 0) K++;
				left++;
			}
		}
		return right - left;
	}
	
	/**
	 * [1,1,1,0,0,0,1,1,1,1,0] K=2
	 * @param nums
	 * @param K
	 * @return
	 */
	public int longestConsecutive(int[] nums, int K) {
		int start = 0, end = 0, maxLen = 0, counter = 0, maxCount=0;
		
		while(end < nums.length) {
			if (nums[end]== 1)
				counter++;
			end++;
			maxCount = Math.max(maxCount, counter);
			
			while(end-start-maxCount > K) {
				if (nums[start]== 1)
					counter--;
				start++;
			}
			
			maxLen = Math.max(maxLen, end-start);
		}
		
		return maxLen;
	}
}













