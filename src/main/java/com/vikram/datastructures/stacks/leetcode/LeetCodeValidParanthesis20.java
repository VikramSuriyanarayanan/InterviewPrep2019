/**
 * 
 */
package com.vikram.datastructures.stacks.leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Remoz World
 *
 */
public class LeetCodeValidParanthesis20 {
	
	 HashMap<Character,Character> hm = new HashMap<Character,Character>();
	    
	    public LeetCodeValidParanthesis20() { 
	        hm.put(')', '(');
	        hm.put('}','{');
	        hm.put(']','[');
	    }
	    
	public boolean isValid(String s) {
		Stack<Character> stk = new Stack<Character>();

		if (s == null)
			return false;

		for(char c:s.toCharArray()) {
			if (!stk.empty()) {
				if (hm.get(c) == stk.peek()) {
					stk.pop();
				} else {
					stk.push(c);  
				}
			} else {
				stk.push(c);
			}
		}

		return stk.empty();
	}
}
