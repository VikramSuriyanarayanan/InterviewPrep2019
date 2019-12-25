/**
 * 
 */
package com.vikram.datastructures.tree;

/**
 * @author Remoz World
 
         Set<Integer> ans = new HashSet<Integer>();
Given two binary trees, write a function to check if they are the same or not.

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
public class LeetCodeIsSameTree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String pTree = traverseTree(p);
        String qTree = traverseTree(q);
        
        return pTree.equals(qTree);
    }
    
    public String traverseTree(TreeNode root) {
        if (root == null)
            return "#";
        
        return root.val + "," + traverseTree(root.left) + "," + traverseTree(root.right);
    }
}
