/**
 * 
 */
package com.vikram.datastructures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Remoz World
 *
 */
public class DFSwithStack {
	
	/**
	 * PRE ORDER:
	 * 
	 * @param root
	 * @return
	 */
	public List<Integer> performDFSIterativelyPreOrder(TreeNode root) {
		List<Integer> output = new ArrayList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		
		if (root != null) {
			s.push(root);
		}
		
		TreeNode curr;
		
		while(!s.isEmpty()) {
			curr = s.pop();
			output.add(curr.val);
			if (curr.right !=null) {
				s.push(curr.right);
			}
			
			if (curr.left != null) {
				s.push(curr.left);
			}
		}
		
		return output;
	}
	
	public List<Integer> performDFSIterativelyINOrder(TreeNode root) {
		List < Integer > res = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
	}
	
	
	public List<Integer> performDFSIterativelyPOSTOrder(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null)
            return res;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> output = new Stack<>();

        stack.push(root);
        while(!stack.empty()){

            TreeNode cur = stack.pop();
            output.push(cur.val);

            if(cur.left != null)
                stack.push(cur.left);
            if(cur.right != null)
                stack.push(cur.right);
        }

        while(!output.empty())
            res.add(output.pop());
        return res;
	}
	
    public List<Integer> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> output1 = new ArrayList<Integer>();
        
        if(root == null)
            return null;
        
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            output1.add(curr.val);
            if(curr.left != null) {
                queue.offer(curr.left);
            }
            
            if (curr.right != null) {
                queue.offer(curr.right);
            }
        }
        
        return output1;
    }
}
