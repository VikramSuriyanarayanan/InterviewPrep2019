/**
 * 
 */
package com.vikram.datastructures.tree;

/**
 * @author Remoz World
 *
 *FIND MAX Depth of a Binary tree.
 */
public class LeetCodeMaxDepthBinaryTree {
		
	// 		1
	//	 2 		3
	//4		5		
	//			
	
	public int findDepth(TreeNode root) {
		maximum_depth(root,1);
		return answer;
	}
	
	private int answer;		// don't forget to initialize answer before call maximum_depth
	
	/**
	 * TOP DOWN APPROACH for DFS RECURSIVE
	 * 
	 * @param root
	 * @param depth
	 */
	private void maximum_depth(TreeNode root, int depth) {
	    if (root == null) {
	        return;
	    }
	    if (root.left == null && root.right == null) {
	        answer = Math.max(answer, depth);
	    }
	    maximum_depth(root.left, depth + 1);
	    maximum_depth(root.right, depth + 1);
	}
	
	/**
	 * BOTTOM UP APPROACH for DFS RECURSIVE
	 * @param root
	 * @return
	 */
	public int bottomUp(TreeNode root) {
		if (root == null)
			return 0;
		
		int leftVal  = bottomUp(root.left);
		int rightVal = bottomUp(root.right);
		
		return Math.max(leftVal, rightVal)+1;
	}
}
