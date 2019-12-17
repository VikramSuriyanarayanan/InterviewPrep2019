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
 */
public class CheckSymmetricTree {

	public List<List<Integer>> checkSymmeric(TreeNode root) {
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		if (root != null) {
			queue.offer(root);
		}
	
		while(!queue.isEmpty()) {
			List<Integer> subVal = new ArrayList<Integer>();
			int size = queue.size();

			for (int i=0; i<size;i++) {
				TreeNode curr = queue.poll();
				subVal.add(curr.val);

				if (curr.left != null) {
					queue.offer(curr.left);
				} else {
					subVal.add(null);
				}

				if (curr.right != null) {
					queue.offer(curr.right);
				} else {
					subVal.add(null);
				}
			}
			output.add(subVal);
		}

		return output;
	}

	public boolean isSymmetic(List<Integer> input) {
		if (input.size() == 0)
			return true;

		if (input.size()%2 != 0)
			return false;

		int pointer_2 = input.size()-1;
		for (int i=0;i<input.size();i++) {
			if (input.get(i) != input.get(pointer_2))
				return false;
			pointer_2--;
		}

		return true;
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		if (root != null) {
			q.offer(root);
		}
		TreeNode cur;
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> subAns = new LinkedList<Integer>();
			for (int i = 0; i < size; ++i) {        // traverse nodes in the same level
				cur = q.poll();
				subAns.add(cur.val);                // visit the root
				if (cur.left != null) {
					q.offer(cur.left);              // push left child to queue if it is not null
				}
				if (cur.right != null) {
					q.offer(cur.right);             // push right child to queue if it is not null
				}
			}
			ans.add(subAns);
		}
		
		return ans;
	}
}
