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
        
        int max = 0;
        int left = 0;
        int right = 0;
        
        Set<Character> hashSet = new HashSet<Character>();
        
        while (right < s.length() && left < s.length()) {
           if ((!hashSet.contains(s.charAt(right))) && (hashSet.size() < 2)) {
               hashSet.add(s.charAt(right++));
               max = Math.max(max,right-left);
           } else if ((hashSet.contains(s.charAt(right))) && (hashSet.size() <= 2)) {
               hashSet.add(s.charAt(right++));
               max = Math.max(max,right-left);
           } else {
               hashSet.remove(s.charAt(left++));
           }
        }
       
        return max;

    }
}
