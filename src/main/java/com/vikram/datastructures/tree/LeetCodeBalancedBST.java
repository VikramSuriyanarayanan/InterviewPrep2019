package com.vikram.datastructures.tree;

/**
 * Given a binary tree, determine if it is height-balanced.

For this problem, a height-balanced binary tree is defined as:

a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

 

Example 1:

Given the following tree [3,9,20,null,null,15,7]:

    3
   / \
  9  20
    /  \
   15   7
Return true.

Example 2:

Given the following tree [1,2,2,3,3,null,null,4,4]:

       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
Return false.
 * @author Remoz World
 *
 */
public class LeetCodeBalancedBST {
	public boolean isBalanced(TreeNode root) {
        if (root == null )
			return true;
		
		int leftVal  = maxHeight(root.left);
		int rightVal = maxHeight(root.right);
		
		return (Math.abs(leftVal-rightVal)<=1)&& isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int maxHeight(TreeNode root) {
        if(root == null)
            return -1;
        
        int leftval = maxHeight(root.left);
        int rightval = maxHeight(root.right);
        
        return Math.max(leftval,rightval)+1;
            
    }
}
