package com.vikram.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,2,3]
 * @author Remoz World
 *
 */
public class PreorderTraversalTree {
	 List<Integer> output = new ArrayList<Integer>();

	    public List<Integer> preorderTraversal(TreeNode root) {
	        if (root !=null) {
	            output.add(root.val);
	            preorderTraversal(root.left);
	            preorderTraversal(root.right);
	        }
	        return output;
	    }
}
