/**
 * 
 */
package com.vikram.appl;

import java.util.Arrays;

import com.vikram.appl.arrays.FirstAndLastPositionInSortedArray34;
import com.vikram.appl.arrays.ThreeSum15;
import com.vikram.appl.string.LogReOrdering937;
import com.vikram.appl.string.LongestSubstringWithoutRepetativeChars3;

/**
 * @author Remoz World
 *
 */
public class ApleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		LogReOrdering937 l937 = new LogReOrdering937();
		System.out.println(Arrays.toString(l937.reorderLogFiles(input)));
		
		int[] l937Inp = {5,4,3,2,9,1};
		System.out.println(Arrays.deepToString(l937.ascendingOrderSortingWithComparator(l937Inp)));
		ThreeSum15 l15 = new ThreeSum15();
		int[] l15inp = {-2,-1,2,1,0,5};
		System.out.println("Triplet solution: "+(l15.get3Sum(l15inp).toString()));
		
		LongestSubstringWithoutRepetativeChars3 l3 = new LongestSubstringWithoutRepetativeChars3();
		System.out.println("Longest Substring Length: "+l3.getLongestSubStringLength("abcbabacde"));
		
		FirstAndLastPositionInSortedArray34 l34 = new FirstAndLastPositionInSortedArray34();
		int[] l34in = {1,2,3};
		System.out.println("Index Range: " + Arrays.toString(l34.searchRange(l34in, 3)));
	}

}
