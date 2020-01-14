/**
 * 
 */
package com.vikram.datastructures.tree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Remoz World
 *
 *Given a root node, compute its corresponding expression.
 *      +
 *   3     *
 *       +   2
 *     5   9  
 */
public class Geek4GeeksExpressionTree {
	
	Deque<Character> stack = new ArrayDeque<Character>();
	int result = 0;

	//Given:
	public int performExpression(TreeNode root) {
		if(root != null) {
			performExpression(root.left);
			performExpression(root.right);
			if(root.charval != 0) {
				char c1 = stack.pop();
				char c2 = stack.pop();
	
				result = c1-'0' root.charval c2-'0';
			} else {
				stack.push(root.charval);
			}
		}
		
			
		
		
	}
} 
