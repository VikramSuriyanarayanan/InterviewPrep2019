/**
 * 
 */
package com.vikram.uber.string;

/**
 * @author Remoz World
 *
 *Given a string, determine if a permutation of the string could form a palindrome.
 * 
Example 1:

Input: "code"
Output: false
Example 2:

Input: "aab"
Output: true
Example 3:

Input: "carerac"
Output: true
 */
public class PalindromePermutation266 {
	public boolean canPermutePalindrome(String s) {
        int[] char_count = new int[128];
        boolean oddFlag = false;
        
        for(char c:s.toCharArray()) {
            char_count[c]++;
        }
        
        
        if (s.length()%2 != 0) {
            oddFlag = true;
        }
        
        for(int i=0;i<char_count.length;i++) {
            if(char_count[i]%2 != 0 && oddFlag) {
                oddFlag = false; 
            } else if (char_count[i]%2 != 0) {
                return false;
            }
        }
        
        return true;
    }
}
