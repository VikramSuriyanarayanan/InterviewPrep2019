/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class CrackingTheCodingInterviewArrayRotateProblem6 {

	/**
	 * Rotate input array by 90 degrees in-place.
	 * @param input
	 * @return
	 */
	public int[][] rotateArray(int[][] input) {
				int temp=0;
		for(int i=0; i<input.length/2;i++) {
			for(int j=0;j < input[i].length;j++) {
				System.out.println(input[i][j]);
				temp = input[i][j];
				input[i][j] = input[j][i];
			}
		}
		
		System.out.println("------------ after rotation ---------");
		for(int i=0; i<input.length;i++) {
			for(int j=0;j < input[i].length;j++) {
				System.out.println(input[i][j]);
			}
		}
		
		return input;
	}
}
