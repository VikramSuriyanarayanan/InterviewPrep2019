/**
 * 
 */
package com.vikram.uber.arrays;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Remoz World
 *  https://leetcode.com/problems/sliding-window-maximum/
 */
public class MaxContiguousSubArray {
	
	    public int[] maxSlidingWindow(int[] nums, int k) {

	        if(nums.length == 0) 
				return new int[0];
	        
			//int maxVal = Integer.MIN_VALUE;
	                int[] maxVal = new int[(nums.length-k)+1];
	        Queue<Integer> queue = new LinkedList<Integer>();
	        int h=0;
			
			for(int i=0;i<nums.length;i++) {
	            queue.offer(nums[i]);

				if(queue.size()==k) {
	                PriorityQueue<Integer> pq = new PriorityQueue<Integer>( Collections.reverseOrder());
	                
	                pq.addAll(queue);
	                
	                maxVal[h++]=pq.poll();
	                queue.poll();
	            }             
			}
			
			return maxVal;
	    }
	}

