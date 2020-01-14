/**
 * 
 */
package com.vikram.ms;

import java.util.Arrays;

/**
 * @author Remoz World
 *
 */
public class MainForMS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oainput1 = {1,3,5,6,8,9};
		OnlineAssessment1 oa1 = new OnlineAssessment1();
		oa1.sortOddAndEven(oainput1, oainput1.length);
		System.out.println("OUTPUT: "+Arrays.toString(oainput1));
		
	}

}
