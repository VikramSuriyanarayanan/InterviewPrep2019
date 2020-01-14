/**
 * 
 */
package com.vikram.datastructures.tree;

/**
 * @author Remoz World
 *
 */
public class LeetCodeLCABinaryTree236 {
	TreeNode ans;
    public LeetCodeLCABinaryTree236() {
        this.ans = null;
    }
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            recurseTree(root,p,q);
            return this.ans;
    }
    
    public boolean recurseTree(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null)
            return false;
        
        //DFS Bottom up approach.
        int left = recurseTree(root.left,p,q)?1:0;
        int right = recurseTree(root.right,p,q)?1:0;
        
        int mid = (root.val == p.val || root.val == q.val) ? 1:0;
        
        int sum = left+right+mid;
        
        if(sum >= 2)
            this.ans = root;
        
        return sum>0 ;
    }
}
