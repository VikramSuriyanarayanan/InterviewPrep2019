package com.vikram.datastructures.arrays.strings;

public class LeetCodeLongestCommonPrefix {
	/**
    str[] = ["flower","flow","flight"]
    output: fl
    prefix= flower
    lengthToTraverse = 6
    
    **/
    public String longestCommonPrefix(String[] strs) {
    	StringBuffer output = new StringBuffer();
    	int minLen = Integer.MAX_VALUE;
    	
    	for(int i=0;i<strs.length;i++) {
    		if(strs[i].length() < minLen) 
    			String minVal = new String(strs[i]);
    	}
    	
    	return output.toString();
    }
}
