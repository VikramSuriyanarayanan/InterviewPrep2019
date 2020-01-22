/**
 * 
 */
package com.vikram.appl.tree;

import com.vikram.datastructures.tree.TreeNode;

/**
 * @author Remoz World
 *
 *Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false
 */
public class SameTree100 {
	
	public boolean isSame(TreeNode t1, TreeNode t2) {
		if(t1==null && t2==null)
			return true;
		
		if(t1==null || t2==null)
			return false;
		
		String tree1 = traverse(t1);
		String tree2 = traverse(t2);
		return tree1 == tree2;
	}
	
	public String traverse(TreeNode t1) {
		if(t1== null)
			return "";
		StringBuffer val = new StringBuffer();
		
		if(t1!=null) {
			val.append(t1.left).append(",").append(t1.val).append(t1.right);
		}
		return val.toString();
	}
}
