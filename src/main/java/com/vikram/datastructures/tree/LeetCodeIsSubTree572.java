package com.vikram.datastructures.tree;

/**
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.

Example 1:
Given tree s:

     3
    / \
   4   5
  / \
 1   2
Given tree t:
   4 
  / \
 1   2
Return true, because t has the same structure and node values with a subtree of s.
 * @author Remoz World
 *
 */
public class LeetCodeIsSubTree572 {
	public boolean isSubtree(TreeNode s, TreeNode t) {
        String tree1 = performTraversal(s, true);
        String tree2 = performTraversal(t, true);
        System.out.println(tree1);
        System.out.println(tree2);
        
        return tree1.indexOf(tree2) >= 0;
    }
    
    public String performTraversal(TreeNode root, boolean left) {
        if(root == null) {
            if (left)
                return "lnull";
            else 
                return "rnull";
        }
        
        return "#" + root.val + performTraversal(root.left, true) +
            performTraversal(root.right, false);
        
    }
}
