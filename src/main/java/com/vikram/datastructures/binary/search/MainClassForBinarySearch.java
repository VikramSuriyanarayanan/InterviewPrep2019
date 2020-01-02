/**
 * 
 */
package com.vikram.datastructures.binary.search;

import java.util.Arrays;

/**
 * @author Remoz World
 *
 */
public class MainClassForBinarySearch {
	public static void main(String[] args) {
		LeetCodeFindRotatedIndex33 l33 = new LeetCodeFindRotatedIndex33();
		int[] l33input = {5,3};
		l33.search(l33input,0);
		
		CountingSort counting = new CountingSort();
		int[] countinp = {1, 4, 1, 2, 7, 5, 2};
		System.out.println("After sorting: "+Arrays.toString(counting.performCountingSort(countinp)));
	}
}
