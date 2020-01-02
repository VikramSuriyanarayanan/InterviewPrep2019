/**
 * 
 */
package com.vikram.datastructures.tree;

/**
 * @author Remoz World
 *
 */
public class LeetCodeInsertIntoBST {
	 public TreeNode insertIntoBST(TreeNode root, int val) {
	     
		 TreeNode nodeToInsert = new TreeNode(val);
		 TreeNode prev = null;
		 TreeNode dummy = root;
		 
		 if(root == null)
	    	 return nodeToInsert;
		 
		 while(root != null) {
		     prev = root;

			 if(root.val < val)
				 root =root.right;
			 else 
				 root = root.left;
		 }
		 
		 if(prev.val>val)
			 prev.left = nodeToInsert;
		 else 
			 prev.right = nodeToInsert;
			 
		return dummy;
	 }
}
