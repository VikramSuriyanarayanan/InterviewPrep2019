/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.HashSet;
import java.util.Set;

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
Accepted
1,237,474
Submissions
4,225,639
Seen this question in a real interview before?

Yes

No
Contributor
LeetCode


 */
public class LeetCodeLongestConsecutiveOnes3 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> set = new HashSet<Character>();
        
        while(right<s.length()&& left<s.length()) {
//            if (hashset.contains(s.toCharArray()[right])) { 
//                hashset.remove(s.toCharArray()[right]);
//                left++;
//            }
//            else {
//                hashset.add(s.toCharArray()[right]);
//                right++;
//                max = Math.max(max,right-left);
//            }
        	
        	if (!set.contains(s.charAt(right))){
                set.add(s.charAt(right++));
                max = Math.max(max, right - left);
            }
            else {
                set.remove(s.charAt(left++));
            }
        }
        
        return max;
    }
}
