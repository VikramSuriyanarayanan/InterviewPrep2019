/**
 * 
 */
package com.vikram.datastructures.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Remoz World
 *
 *Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note:
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1
Example 2:

Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3
Follow up:
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?
 */
public class LeetCodeKthSmallestElement230 {
	   List<Integer> treeList = new ArrayList<Integer>();
	    public int kthSmallest(TreeNode root, int k) {
	        performInOrder(root);
	        
	        return treeList.size()>k-1?treeList.get(k-1):-1;
	    }
	    
	    public void performInOrder(TreeNode root) {
	        if(root == null)
	            return;
	        
	        performInOrder(root.left);
	        if(!treeList.contains(root.val)) {
	            treeList.add(root.val);
	        }
	        performInOrder(root.right);
	    }
}
