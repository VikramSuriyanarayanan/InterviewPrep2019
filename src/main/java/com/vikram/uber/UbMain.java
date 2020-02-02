/**
 * 
 */
package com.vikram.uber;

import java.util.ArrayList;
import java.util.List;

import com.vikram.datastructures.tree.TreeNode;
import com.vikram.uber.arrays.ComparatorElement;
import com.vikram.uber.arrays.MaxContiguousSubArray;
import com.vikram.uber.arrays.ProdMinusSum;
import com.vikram.uber.string.ReconstructItinery332;
import com.vikram.uber.tree.PathSumIII437;

/**
 * @author Remoz World
 *
 */
public class UbMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReconstructItinery332 r332 = new ReconstructItinery332();
		List<List<String>> tickets = new ArrayList<List<String>>();
		List<String> l1 = new ArrayList<String>();
		l1.add("JFK"); l1.add("KUL");
		List<String> l2 = new ArrayList<String>();
		l2.add("JFK"); l2.add("NRT");
		List<String> l3 = new ArrayList<String>();
		l3.add("NRT"); l3.add("JFK");
		tickets.add(l1);tickets.add(l2); tickets.add(l3);
		System.out.println("MODIFIED ITINERY:" + r332.findItinerary(tickets).toString());
		
		
		TreeNode root = new TreeNode(1); 
		root.left = new TreeNode(2); 
		root.right = new TreeNode(3); 
		root.left.right = new TreeNode(3); 
		root.left.left = new TreeNode(4); 
		root.right.right = new TreeNode(6);
		
		PathSumIII437 p437 = new PathSumIII437();
		System.out.println("Total Paths: " + p437.pathSum(root, 6));
		
		ProdMinusSum ps = new ProdMinusSum();
		System.out.println(ps.prodSum(1234));
		
		ComparatorElement ce = new ComparatorElement();
		int[] num1 = {2,9};
		int[] num2 = {12,19,8};
		System.out.println(ce.compareArrays(num1, num2, 3));
		
		MaxContiguousSubArray mm = new MaxContiguousSubArray();
		System.out.println(mm.findMaxSubArray(num2, 2));
	}

}
