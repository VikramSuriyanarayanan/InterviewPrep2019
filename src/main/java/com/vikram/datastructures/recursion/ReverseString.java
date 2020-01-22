/**
 * 
 */
package com.vikram.datastructures.recursion;

/**
 * @author Remoz World
 *
 * Simple string reversal
 */
public class ReverseString {
	 public void reverseString(char[] s) {
	        helper(s,0,s.length-1);
	    }
	    
	    public void helper(char[] s, int start, int end) {
	        if(start >= end)
	            return;
	        
	        swap(s,start,end);
	        helper(s, ++start,--end);
	    }

	    public void swap(char[] s, int i,int j) {
	        char temp = 'a';
	        temp = s[i];
	        s[i] = s[j];
	        s[j] = temp;     
	    }
}
