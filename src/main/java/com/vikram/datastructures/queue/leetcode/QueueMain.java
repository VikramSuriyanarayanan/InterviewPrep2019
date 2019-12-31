package com.vikram.datastructures.queue.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class QueueMain {

	public static void main(String[] args) {
			MyCircularQueue obj = new MyCircularQueue(3);
			boolean param_1 = obj.enQueue(1);
			System.out.println(param_1);
			boolean param_2 = obj.enQueue(2);
			System.out.println(param_2);
			boolean param_3 = obj.enQueue(3);
			System.out.println(param_3);
			
			param_3 = obj.enQueue(4);
			System.out.println(param_3);
			
			boolean param_4 = obj.deQueue();
			System.out.println(param_4);
			
			param_3 = obj.enQueue(4);
			System.out.println(param_3);

			int param_5 = obj.Front();
			System.out.println(param_5);

			//int param_6 = obj.Rear();
			//System.out.println(param_6);
			
			 param_4 = obj.deQueue();
			 System.out.println(param_4);
			 
			 //param_6 = obj.Rear();
			 //System.out.println(param_6);
				

			boolean param_51 = obj.isEmpty();
			System.out.println(param_51);
			
			boolean param_61 = obj.isFull();
			System.out.println(param_61);
			
			MinElementInMaxHeap mininmax = new MinElementInMaxHeap();
			int[] minInput = {5,4,3,2,2,1,2};
			
	        
	        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	        for(Integer i:minInput) {
	        	hm.put(i,hm.getOrDefault(i,0)+1);
	        }
	        
			System.out.println("MIN element in max heap: " +mininmax.findMinElement(minInput));
			LeetCodeTopKfrequentElements347 l347 = new LeetCodeTopKfrequentElements347();
			int[] l347in = {1,1,1,2,2,3,4,5,67,79};
			l347.topKFrequent(l347in, 3);
	}

}
