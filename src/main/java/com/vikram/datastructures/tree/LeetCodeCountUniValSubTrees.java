/**
 * 
 */
package com.vikram.datastructures.tree;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Remoz World
 *Given a binary tree, count the number of uni-value subtrees.

A Uni-value subtree means all nodes of the subtree have the same value.

Example :

Input:  root = [5,1,5,5,5,null,5]

              5
             / \
            1   5
           / \   \
          5   5   5

Output: 4
 */
public class LeetCodeCountUniValSubTrees {
	   int count = 0;
	    Set<Integer> ans = new HashSet<Integer>();

	    
	    public int countUnivalSubtrees(TreeNode root) {
	        traverseTree(root);
	        return count;
	    }
	    
	    public void traverseTree(TreeNode root) {
	    	
	    	if (root == null)
	    		return;
	    	
	        if (root.left == null && root.right == null) {
	            count++;
	            return;
	        }
	        
	        traverseTree(root.left);
	        traverseTree(root.right);
	        ans.add(root.val);

	        if(ans.size() == 1) {
	            count++;
	        } 
	    }
}
