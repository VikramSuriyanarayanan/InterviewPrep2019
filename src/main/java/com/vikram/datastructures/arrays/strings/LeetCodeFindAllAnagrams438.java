/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Remoz World
 *
 *s: "cbaebabacd" p: "abc"
 */
public class LeetCodeFindAllAnagrams438 {
	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> output = new ArrayList<Integer>();
        
        int[] char_count = new int[128];
        
        int start = 0, end = 0, counter = 0;
        
        for (char c:p.toCharArray()) {
            char_count[c]++;
        }
               
        while(end < s.length()) {
            char c1 = s.charAt(end);
            
            if(char_count[c1] > 0) {
                counter++;
            } 
            
            char_count[c1]--;
            end++;
            
            if(counter == p.length()) {
                output.add(start);
            }
            
            if (end - start == p.length() ) {
                
                if (char_count[s.charAt(start)] >= 0) {
                    counter--;
                }
                char_count[s.charAt(start)]++;
                start++;
            
            }

        }
        
        return output;
    }
	
	  public List<Integer> findAnagramsMethod2(String s, String p) {
	        List<Integer> list = new ArrayList<>();
	    if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;
	    
	    int[] hash = new int[256]; //character hash
	    
	    //record each character in p to hash
	    for (char c : p.toCharArray()) {
	        hash[c]++;
	    }
	    //two points, initialize count to p's length
	    int left = 0, right = 0, count = p.length();
	    
	    while (right < s.length()) {
	        //move right everytime, if the character exists in p's hash, decrease the count
	        //current hash value >= 1 means the character is existing in p
	        if (hash[s.charAt(right)] >= 1) {
	            count--;
	        }
	        hash[s.charAt(right)]--;
	        right++;
	        
	        //when the count is down to 0, means we found the right anagram
	        //then add window's left to result list
	        if (count == 0) {
	            list.add(left);
	        }
	        //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
	        //++ to reset the hash because we kicked out the left
	        //only increase the count if the character is in p
	        //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
	        if (right - left == p.length() ) {
	           
	            if (hash[s.charAt(left)] >= 0) {
	                count++;
	            }
	            hash[s.charAt(left)]++;
	            left++;
	        
	        }

	        
	    }
	        return list;
	    }
}
