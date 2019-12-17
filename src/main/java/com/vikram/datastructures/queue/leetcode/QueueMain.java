package com.vikram.datastructures.queue.leetcode;

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

			int param_6 = obj.Rear();
			System.out.println(param_6);
			
			 param_4 = obj.deQueue();
			 System.out.println(param_4);
			 
			 param_6 = obj.Rear();
			 System.out.println(param_6);
				

			boolean param_51 = obj.isEmpty();
			System.out.println(param_51);
			
			boolean param_61 = obj.isFull();
			System.out.println(param_61);
	}

}
