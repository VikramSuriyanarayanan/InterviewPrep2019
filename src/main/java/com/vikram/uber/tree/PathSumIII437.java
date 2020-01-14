/**
 * 
 */
package com.vikram.uber.tree;

import com.vikram.datastructures.tree.TreeNode;

/**
 * @author Remoz World
 *
 */
public class PathSumIII437 {
	
	public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    private int pathSumFrom(TreeNode node, int sum) {
        if (node == null) return 0;
        return (node.val == sum ? 1 : 0) 
            + pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);
    }
	
	
	
	// MY TRY:
	
//	 int count;
//	    public int pathSum(TreeNode root, int sum) {
//	        int init = 0;
//	        calcRec(root,sum,init);
//	        return count;
//	    }
//	    
//	    public void calcRec(TreeNode root, int sum, int init) {
//	        if (root == null)
//	            return;
//	        
//	        init += root.val;
//	        
//	        if(init>sum)
//	            init=0;
//	        
//	        if(init==sum) {
//	            System.out.println(root.val);
//	           init -=root.val;
//	            count++;
//	        }
//	        
//	        calcRec(root.left,sum,init);
//	        calcRec(root.right,sum,init);
//	            
//	    }
}
