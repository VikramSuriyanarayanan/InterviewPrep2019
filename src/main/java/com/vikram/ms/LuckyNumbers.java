/**
 * 
 */
package com.vikram.ms;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Remoz World
 * For each iteration remove i+1 th entry. For n = 10. Check if n is lucky number or not. 
 * Iteration: 0
 * 1,2,3,4,5,6,7,8,9,10
 * 
 * Iteration: 1
 * 1,3,5,7,9
 * 
 * Iteration: 2
 * 1,3,7,9
 * 
 * Iteration: 3
 * 1,3,7
 * 
 * Iteration : 4 cannot happen since size() < i+1;
 */
public class LuckyNumbers {
	
	List<Integer> input = new ArrayList<Integer>();

	public boolean isLuckyNumber(int n) {
		if(n<=1)
			return true;	
		
		for(int i=0;i<n;i++)
			input.add(i+1);
		int iteration = 1;
		while(input.size()>iteration+1) {
			removeElements(iteration++);
		}
		
		return input.size()>0;
	}
	
	public void removeElements(int iteration) {
		for(int i=0;i<input.size()-1;i++) {
			if((i+1)%iteration ==0)
				input.remove(i+1);
		}
	}
	
	public List<Integer> getLuckyNumberList() {
		return input;
	}
}
