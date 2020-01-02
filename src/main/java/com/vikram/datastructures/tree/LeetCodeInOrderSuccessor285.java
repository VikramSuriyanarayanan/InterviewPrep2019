/**
 * 
 */
package com.vikram.datastructures.tree;

import java.util.Stack;

/**
 * @author Remoz World
 *
 */
public class LeetCodeInOrderSuccessor285 {
	public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null)
            return null;
        
        double prev = - Double.MAX_VALUE;
        TreeNode curr = root;
        
        while(!stack.empty() || curr != null) {
            while(curr !=null) {
                stack.push(curr);
                curr = curr.left;
            }
            
            curr = stack.pop();
            
            if (prev == p.val)
                return curr;
            
            prev = curr.val;
            curr = curr.right;
        }
        
        return null;
    }
}
