package com.vikram.datastructures.arrays.strings;

public class LeetCodeLongestCommonPrefix {
	/**
	 * Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
Note:

All given inputs are in lowercase letters a-z.

    str[] = ["flower","flow","flight"]
    output: fl
    prefix= flower
    lengthToTraverse = 6
    
    **/
    public String longestCommonPrefix(String[] strs) {
        if(strs.length <= 0)
            return "";
        
         String prefix = strs[0]; //flower
	        
	        for(int i=0;i<strs.length;i++) {
	            int lengthToTraverse = strs[i].length() <= prefix.length() ? strs[i].length():prefix.length();
	            int j=0;
	            
	            while((lengthToTraverse !=0) && (strs[i].toCharArray()[j] == prefix.toCharArray()[j])) {
	                lengthToTraverse--;
	                j++;
	            }
	            
	            prefix = prefix.substring(0,j);
	        }
	        
	        return prefix;
    }
}
