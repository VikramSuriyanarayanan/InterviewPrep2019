/**
 * 
 */
package com.vikram.datastructures.tree;

/**
 * @author Remoz World

Given a binary tree and a sum, determine if the tree has a root-to-leaf 
path such that adding up all the values along the path equals the given sum.

Note: A leaf is a node with no children.

Example:

Given the below binary tree and sum = 22,
 */
public class LeetCodePathSum {

	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) 
			return false;

		sum -= root.val;
		if(root.left == null && root.right == null) 
			return sum == 0;

		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	}


	public boolean doesPathExist(TreeNode root, int check, int sum) {

		if (root == null)
			return false;

		if ((root.left == null) && (root.right == null)) {
			if (sum +root.val == check)
				return true;
			else {
				return false;
			}
		}

		sum+=root.val;
		boolean result = doesPathExist(root.left,check, sum);
		if (result)
			return true;

		result = doesPathExist(root.right,check, sum);

		if (result)
			return true;


		return false;
	}
}
