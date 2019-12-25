/**
 * 
 */
package com.vikram.datastructures.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Remoz World
 *
 *Given a binary tree, return all duplicate subtrees. For each kind of duplicate subtrees, you only need to return the root node of any one of them.

Two trees are duplicate if they have the same structure with same node values.

Example 1:

        1
       / \
      2   3
     /   / \
    4   2   4
       /
      4
The following are two duplicate subtrees:

      2
     /
    4
and

    4
Therefore, you need to return above trees' root in the form of a list.
 */
public class FindDuplicateSubTrees652 {
	Map<String, Integer> count;
	List<TreeNode> ans;
	public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
		count = new HashMap();
		ans = new ArrayList();
		collect(root);
		return ans;
	}

	public String collect(TreeNode node) {
		if (node == null) return "#";
		String serial = node.val + "," + collect(node.left) + "," + collect(node.right);
		System.out.println(serial);
		count.put(serial, count.getOrDefault(serial, 0) + 1);
		if (count.get(serial) == 2)
			ans.add(node);
		return serial;
	}
}
