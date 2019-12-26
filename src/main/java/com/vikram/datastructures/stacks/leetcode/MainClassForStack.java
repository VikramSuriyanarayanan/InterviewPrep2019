package com.vikram.datastructures.stacks.leetcode;

import java.util.Stack;

public class MainClassForStack {

	public static void main(String[] args) {
		LeetCodeMinStack155 obj = new LeetCodeMinStack155();
		 obj.push(-2);
		 obj.push(0);
		 obj.push(-3);
		 System.out.println("FIRST GET MIN: " + obj.getMin());
		 obj.pop();
		 System.out.println("TOP: "+obj.top());
		 System.out.println("SECOND GET MIN: " + obj.getMin());
		 
		 LeetCodeValidParanthesis20 l20 = new LeetCodeValidParanthesis20();
		 System.out.println("IS Valid Parantesis?" + l20.isValid("((())))"));
		 
		 LeetCodeLongestValidParanthesis32 l32 = new LeetCodeLongestValidParanthesis32();
		 System.out.println("Length of longest paranthesis: " + l32.longestValidParentheses(")()())"));
	}
}
