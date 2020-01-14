/**
 * 
 */
package com.vikram.datastructures.tree;

/**
 * @author Remoz World
 *
 */
public class LeetCodeLCABST235 {
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root == null)
	            return root;
	        
	        while(root != null) {
	            if(p.val <root.val && q.val<root.val)
	                root = root.left;
	            else if (p.val >root.val && q.val>root.val)
	                root = root.right;
	            else
	                return root;
	        }
	            
	        return null;

	    }
}
