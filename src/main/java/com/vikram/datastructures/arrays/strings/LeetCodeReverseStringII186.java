/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 *Given an input string , reverse the string word by word. 

Example:

Input:  ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]
Note: 

A word is defined as a sequence of non-space characters.
The input string does not contain leading or trailing spaces.
The words are always separated by a single space.
Follow up: Could you do it in-place without allocating extra space?
 */
public class LeetCodeReverseStringII186 {

	public void reverseWords(char[] s) {      
        if(s.length<1)
            return;
        
        for(int start=0,end=s.length-1; start<=end;start++,end--) {
        	swap(s,start,end);
        }
        
        int start = 0,end=0, temp = 0;
        while(start<s.length && end<s.length) {
            while(end<s.length && s[end] != ' ') {
                temp = end++;
            }
            
            while(start <= temp) {
            	swap(s,start++,temp--);            	
            }
            end++;
            start = end;
        }
        
        return;
    }
    
    public void swap(char[] s, int start, int end) {
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
    }
}
