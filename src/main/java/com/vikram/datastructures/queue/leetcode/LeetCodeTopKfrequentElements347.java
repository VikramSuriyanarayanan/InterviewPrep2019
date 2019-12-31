/**
 * 
 */
package com.vikram.datastructures.queue.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.*;

/**
 * @author Remoz World
 *
 */
public class LeetCodeTopKfrequentElements347 {

	   public List<Integer> topKFrequent(int[] nums, int k) {
		    // build hash map : character and how often it appears
		    HashMap<Integer, Integer> count = new HashMap();
		    for (int n: nums) {
		      count.put(n, count.getOrDefault(n, 0) + 1);
		    }

		    // init heap 'the less frequent element first'
		    PriorityQueue<Integer> heap =
		            new PriorityQueue<Integer>((n1, n2) -> count.get(n1) - count.get(n2));

		    // keep k top frequent elements in the heap
		    for (int n: count.keySet()) {
		      heap.add(n);
		      if (heap.size() > k)
		        heap.poll();
		    }

		    // build output list
		    List<Integer> top_k = new ArrayList();
		    while (!heap.isEmpty())
		      top_k.add(heap.poll());
		    Collections.reverse(top_k);
		    return top_k;
		  }
}
