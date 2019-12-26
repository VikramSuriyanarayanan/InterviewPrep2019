/**
 * 
 */
package com.vikram.datastructures.stacks.leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Remoz World
 *
 *Algorithm

Instead of finding every possible string and checking its validity, we can make use of stack while scanning the given string to check if the string scanned so far is valid, and also the length of the longest valid string. In order to do so, we start by pushing -1−1 onto the stack.

For every \text{‘(’}‘(’ encountered, we push its index onto the stack.

For every \text{‘)’}‘)’ encountered, we pop the topmost element and subtract the current element's index from the top element of the stack, which gives the length of the currently encountered valid string of parentheses. If while popping the element, the stack becomes empty, we push the current element's index onto the stack. In this way, we keep on calculating the lengths of the valid substrings, and return the length of the longest valid string at the end.

See this example for better understanding.
 */
public class LeetCodeLongestValidParanthesis32 {
	public int longestValidParentheses(String s) {
       Stack<Integer> stk  = new Stack<Integer>();
       stk.push(-1);
       int maxans = 0;

       for(int i=0;i<s.length();i++) {
    	   if (s.charAt(i)== '(') {
    		   stk.push(i);
    	   } else {
    		   stk.pop();
    		   if (stk.empty()) {
    			   stk.push(i);
    		   } else {
    			   maxans = Math.max(maxans, stk.peek()-i);
    		   }
    	   }
       }
       
       return maxans;
    }
}
