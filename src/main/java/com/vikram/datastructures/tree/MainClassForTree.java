/**
 * 
 */
package com.vikram.datastructures.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Remoz World
 *
 */
public class MainClassForTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1); 
		root.left = new TreeNode(2); 
		root.right = new TreeNode(3); 
		root.left.right = new TreeNode(5); 
		root.left.left = new TreeNode(4); 
		root.right.right = new TreeNode(6); 
		InOrderTraversalTree in = new InOrderTraversalTree();
		PreorderTraversalTree pre = new PreorderTraversalTree();
		PostOrderTraversalTree post = new PostOrderTraversalTree();
		DFSwithStack dfs = new DFSwithStack();
		System.out.println("PRE ORDER RECURSIVE: " +pre.preorderTraversal(root).toString());
		System.out.println("PRE ORDER ITERATIVE: " +dfs.performDFSIterativelyPreOrder(root).toString());

		System.out.println("IN ORDER RECURSIVE: "+in.inorderTraversal(root).toString());
		System.out.println("IN ORDER ITERATIVE: " +dfs.performDFSIterativelyINOrder(root).toString());

		System.out.println("POST ORDER RECURSIVE: " +post.postorderTraversal(root).toString());
		System.out.println("POST ORDER ITERATIVE: " +dfs.performDFSIterativelyPOSTOrder(root).toString());

		System.out.println("LEVEL ORDER: " + dfs.levelOrder(root).toString());

		LeetCodeMaxDepthBinaryTree lmax = new LeetCodeMaxDepthBinaryTree();
		System.out.println("MAX DEPTH: "+ lmax.findDepth(root));
		System.out.println("BOTTOM UP MAX DEPTH: " + lmax.bottomUp(root));
		
		List<Integer> inputcheck = new ArrayList<Integer>();
		inputcheck.add(1);
		inputcheck.add(2);
		inputcheck.add(2);
		inputcheck.add(2);
		CheckSymmetricTree chek = new CheckSymmetricTree();
		System.out.println(chek.isSymmetic(inputcheck));
		System.out.println(chek.checkSymmeric(root).toString());
		
		LeetCodePathSum lpsum = new LeetCodePathSum();
		
		TreeNode root1 = new TreeNode(1); 
		root1.left = new TreeNode(-2); 
		root1.right = new TreeNode(-3); 
		root1.left.right = new TreeNode(3); 
		root1.left.left = new TreeNode(10); 
		root1.right.left = new TreeNode(-2); 
		root1.left.left.left = new TreeNode(-1);
		
		System.out.println(lpsum.doesPathExist(root, 3, 0));
		LeetCodeIsSubTree572 lsubtree = new LeetCodeIsSubTree572();
		System.out.println(lsubtree.isSubtree(root, root));
		
		FindDuplicateSubTrees652 fdsubtree = new FindDuplicateSubTrees652();
		fdsubtree.findDuplicateSubtrees(root1);
		
		TreeNode rootuni = new TreeNode(5); 
		rootuni.left = new TreeNode(5); 
		rootuni.right = new TreeNode(1); 
		
		LeetCodeCountUniValSubTrees lccu = new LeetCodeCountUniValSubTrees();
		System.out.println(lccu.countUnivalSubtrees(rootuni));
		
		LeetCodeInOrderSuccessor285 l285 = new LeetCodeInOrderSuccessor285();
		System.out.println("CORRESPONDING INORDER TRAVERSAL IS " + l285.inorderSuccessor(root1, root1.left));
		
		LeetCodeSearchInBST lsbst = new LeetCodeSearchInBST();
		System.out.println(lsbst.searchBST(root1, -2));
	}

}
