/**
 * 
 */
package com.vikram.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Remoz World
 Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [3,2,1]
 
 */
public class PostOrderTraversalTree {
	 List<Integer> output = new ArrayList<Integer>();

	    public List<Integer> postorderTraversal(TreeNode root) {
	        if (root!=null) {
	            postorderTraversal(root.left);
	            postorderTraversal(root.right);
	            output.add(root.val);
	        }
	        
	        return output;
	    }
}
