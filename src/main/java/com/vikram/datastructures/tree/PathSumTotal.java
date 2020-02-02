/**
 * 
 */
package com.vikram.datastructures.tree;

/**
 * @author Remoz World
 *
 */
public class PathSumTotal {
	int sum;
	int midSum;
	
	public int path(TreeNode root) {
		 getTotalSum(root);
		 getMidSum(root);
		 return midSum * (sum-midSum);
	}

	private void getTotalSum(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null)
		return;
		sum +=root.val;
		getTotalSum(root.left);
		getTotalSum(root.right);
		return;
	}
	
	private void getMidSum(TreeNode root) {
		if(root==null)
			return;
		
		if(midSum >= sum/2)
			return;
		
		midSum +=root.val;
		getMidSum(root.left);
		getMidSum(root.right);
		
		return;
	}
	
}
