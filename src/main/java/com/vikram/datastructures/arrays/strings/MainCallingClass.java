/**
 * 
 */
package com.vikram.datastructures.arrays.strings;

/**
 * @author Remoz World
 *
 */
public class MainCallingClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "VikramM";
		int[] nums = {-10,7,19,15};
			
		int target = 9;

		//problem 1
		CrackingTheCodingInterviewProblem1 prob1 = new CrackingTheCodingInterviewProblem1();
		System.out.println("Does given input string have unique set of chars? " + prob1.isUnique(input));
		LeetcodeTwoSums leetcodeTwoSums = new LeetcodeTwoSums();
		int[] result = leetcodeTwoSums.twoSum(nums, target);
		System.out.println(result[0]+ "res" + result[1]);
	}

}
