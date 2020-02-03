/**
 * 
 */
package com.vikram.datastructures.recursion.PermutationNdCombination;

/**
 * @author Remoz World
 *
 */
public class CombinationMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSum39 c39 = new CombinationSum39();
		int[] c39in = {2,3,4,5};
		c39.combinationSum(c39in, 5);
		
		CombinationSumII40 c40 = new CombinationSumII40();
		c40.combinationSum2(c39in, 5);
		
		PalindromicPermutationII267 p267 = new PalindromicPermutationII267();
		System.out.println(p267.generatePalindromes("aabb").toString());
	}

}
