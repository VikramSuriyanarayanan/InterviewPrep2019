package com.vikram.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
Follow up: Recursive solution is trivial, could you do it iteratively?
 * @author Remoz World
 *
 */
public class InOrderTraversalTree {
	 List<Integer> output = new ArrayList<Integer>();

	    public List<Integer> inorderTraversal(TreeNode root) {
	        if (root != null) {
	            inorderTraversal(root.left);
	            output.add(root.val);
	            inorderTraversal(root.right);
	        }
	        
	        return output;
	    }
}
