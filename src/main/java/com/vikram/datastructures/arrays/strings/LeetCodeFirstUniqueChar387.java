package com.vikram.datastructures.arrays.strings;

import java.util.HashMap;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
 * @author Remoz World
 *
 */
public class LeetCodeFirstUniqueChar387 {
	class Solution {
	    public int firstUniqChar(String s) {
	        HashMap<Character,Integer> val = new HashMap<Character, Integer>();
	        
	        for(char c:s.toCharArray()) {
	            if(val.containsKey(c)) {
	                int count  = val.get(c);
	                count++;
	                val.put(c,count);
	            } else {
	                val.put(c,1);
	            }
	        }
	        
	        for(int i=0; i<s.length();i++) {
	            if (val.get(s.toCharArray()[i]) == 1) {
	                return i;
	            }
	        }
	        
	        return -1;
	    }
	    
	    /**
	    Recommended solution
	    
	    public int getindex(String s) {
	     if (s.length() == 1 || s == null)
	            return 0;
	        
	        int[] counter = new int[26];
	        
	        for (int i = 0; i < s.length(); i++) {
	            counter[s.charAt(i) - 'a']++;
	        }
	        
	        for (int i = 0; i < s.length(); i++) {
	            if (counter[s.charAt(i) - 'a'] == 1)
	                return i;
	        }
	        return -1;
	        
	    } **/
	}
}
