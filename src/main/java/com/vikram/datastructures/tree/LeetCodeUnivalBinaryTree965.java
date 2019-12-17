/**
 * 
 */
package com.vikram.datastructures.tree;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Remoz World
 A binary tree is univalued if every node in the tree has the same value.

Return true if and only if the given tree is univalued.


Input: [1,1,1,1,1,null,1]
Output: true
 */
public class LeetCodeUnivalBinaryTree965 {
	 Set<Integer> hashSet = new HashSet<Integer>();

	    public boolean isUnivalTree(TreeNode root) {
	        performTraversal(root);
	        return hashSet.size()>1?false:true;
	    }
	    
	    public void performTraversal(TreeNode root) {
	        if (root != null) {
	            hashSet.add(root.val);
	            isUnivalTree(root.left);
	            isUnivalTree(root.right);
	        }
	    }
}
