/**
 * 
 */
package com.vikram.datastructures.tree;

import java.util.Stack;

/**
 * @author Remoz World
 * Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 
 */
public class LeetCodeValidBSTree98 {
	public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null)
            return true;
        
        double prev = - Double.MAX_VALUE;
        TreeNode curr = root;
        
        while(!stack.empty() || curr != null) {
            while(curr !=null) {
                stack.push(curr);
                curr = curr.left;
            }
            
            curr = stack.pop();
            
            if (prev >= curr.val)
                return false;
            prev = curr.val;
            curr = curr.right;
        }
        
        return true;
    }
}
