/**
 * 
 */
package com.vikram.datastructures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Remoz World
 *
 *Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
 */
// USE TWO STACK APPROACH. 
public class LeetCodeZigZagTraversal103 {
	public List<Integer> zigzagLevelOrder(TreeNode root) {
		List<Integer> output = new ArrayList<Integer>();
		int counter = 0;        
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		if(root == null)
			return null;

		queue.offer(root);
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			output.add(temp.val);
			if(counter%2 != 0)  {
				if(temp.left != null) 
					queue.offer(temp.left);

				if(temp.right != null)
					queue.offer(temp.right);
			}else {
				if(temp.right != null)
					queue.offer(temp.right);

				if(temp.left != null) 
					queue.offer(temp.left);
			}

			counter++;
		}        
		
		return output;
	}
}
