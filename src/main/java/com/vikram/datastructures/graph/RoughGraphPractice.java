/**
 * 
 */
package com.vikram.datastructures.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author Remoz World
 *
 */
public class RoughGraphPractice {
	
	/**
	 * [0,1][1,2],[2,3],[3,4]
	 * @param graph
	 * @return
	 */
	public List<List<Integer>> populateAdjList(int n, int[][] nums) {
		List<List<Integer>> adjList = new ArrayList<List<Integer>>();
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] isVisited = new boolean[n];
		
		if(nums.length == 0)
			return null;
		
		for(int i=0;i<n;i++) {
			adjList.add(new ArrayList<Integer>());
		}
		
		for(int i=0;i<nums.length;i++) {
			adjList.get(nums[i][0]).add(nums[i][1]);
		}
		
		for(int i=0;i<adjList.size();i++) {
			
		}
		
		return adjList;
	}
	
	public static void main(String[] args) {
		RoughGraphPractice rg = new RoughGraphPractice();
		int[][] nums = {{0,1},{1,2},{2,3},{4,5}};
		System.out.println(rg.populateAdjList(6,nums).toString());
	}
}
