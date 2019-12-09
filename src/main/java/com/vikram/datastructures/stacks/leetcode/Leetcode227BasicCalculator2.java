/**
 * 
 */
package com.vikram.datastructures.stacks.leetcode;

import java.util.Stack;

/**
 * @author Remoz World
 *
 */
public class Leetcode227BasicCalculator2 {

	public int calculate(String s) {

		int len;
		if(s==null || (len = s.length())==0) return 0;
		Stack<Integer> stack = new Stack<Integer>();
		int num = 0;
		char sign = '+';
		for(int i=0;i<len;i++){
			if(Character.isDigit(s.charAt(i))){
				num = num*10+s.charAt(i)-'0';
			}
			if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
				if(sign=='-'){
					stack.push(-num);
				}
				if(sign=='+'){
					stack.push(num);
				}
				if(sign=='*'){
					stack.push(stack.pop()*num);
				}
				if(sign=='/'){
					stack.push(stack.pop()/num);
				}
				sign = s.charAt(i);
				num = 0;
			}
		}

		int re = 0;
		for(int i:stack){
			re += i;
		}
		return re;
	}
}

//	public int calculate(String str) {
//		int output = 0;
//		String trimmedString = str.trim();
//		Stack<Integer> s = new Stack<Integer>();
//
//		for(int i=0;i<trimmedString.length();i++) {
//			if(trimmedString.charAt(i) == '/' || trimmedString.charAt(i) == '*') {
//				int left = s.pop();
//				s.push(operate(left,trimmedString.charAt(i++)-'0',trimmedString.charAt(i)));
//			} else {
//				s.push(trimmedString.charAt(i)-'0');
//			}            
//		}
//
//		while(s.capacity()) {
//
//		}
//
//		return output;
//	}
//
//	private int operate(int leftVal, int rightVal, char operator) {
//		switch(operator) {
//		case '+':
//			return leftVal + rightVal;
//		case '-':
//			return leftVal - rightVal;
//		case '*':
//			return leftVal * rightVal;
//		case '/':
//			return leftVal/rightVal;
//		default:
//			return 0;
//		}
//	}
