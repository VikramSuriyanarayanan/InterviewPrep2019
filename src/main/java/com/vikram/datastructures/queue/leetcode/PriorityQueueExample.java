/**
 * 
 */
package com.vikram.datastructures.queue.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Remoz World
 *
 */
public class PriorityQueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(900);
		pq.offer(750);
		pq.offer(100);
		
		while(!pq.isEmpty())
			System.out.println("NATURAL ORDERING: " +pq.poll());
		
		//Now lets change the comparator.
		Comparator<Integer> compar = (int1,int2) -> {
			return int2-int1;
		};
		
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(compar);

		pq1.offer(10);
		pq1.offer(200);
		pq1.offer(250);
		pq1.offer(115);
		
		while(!pq1.isEmpty())
			System.out.println("DESCENDING ORDERING: " +pq1.poll());
	}

}
