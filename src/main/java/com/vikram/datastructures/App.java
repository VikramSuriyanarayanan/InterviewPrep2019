package com.vikram.datastructures;

import java.util.*;

import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewArrayRotateProblem6;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewOnePointStringProblem5;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewPalindromePermutationP4;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewStringCompressionProblem6;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewStringPermutationProblem2;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewStringRotationProblem8;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewURLifyProblem3;
import com.vikram.datastructures.arrays.strings.LeetCode2DiagonalTraverse;
import com.vikram.datastructures.arrays.strings.LeetCodeAddBinaryString;
import com.vikram.datastructures.arrays.strings.LeetCodeArrayIntersection;
import com.vikram.datastructures.arrays.strings.LeetCodeDailyTemperatures;
import com.vikram.datastructures.arrays.strings.LeetCodeEasyDuplicatesFromSortedArray;
import com.vikram.datastructures.arrays.strings.LeetCodeLongestCommonSequence;
import com.vikram.datastructures.arrays.strings.LeetCodeMoveZeros;
import com.vikram.datastructures.arrays.strings.LeetCodePascalsTriangle;
import com.vikram.datastructures.arrays.strings.LeetCodePlusOne;
import com.vikram.datastructures.arrays.strings.LeetCodeRotateArray;
import com.vikram.datastructures.arrays.strings.LeetCodeSingleNumber;
import com.vikram.datastructures.arrays.strings.LeetCodeStockBuyMaxProfit;
import com.vikram.datastructures.arrays.strings.LeetcodeFindPivotElement;
import com.vikram.datastructures.arrays.strings.PrintStringPermutations;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    	int[] integerArray = new int[5];
    	integerArray[3]= 4;
    	System.out.println(integerArray[3]);
    	LinkedList<String> exampleList = new LinkedList<String>();
    	exampleList.add("Ram");
    	exampleList.add("Lax");
    	
    	System.out.println(exampleList.toString());
    	
    	CrackingTheCodingInterviewStringPermutationProblem2 crackingTheCodingInterviewStringPermutationProblem2 = new CrackingTheCodingInterviewStringPermutationProblem2();
    	System.out.println(crackingTheCodingInterviewStringPermutationProblem2.checkForPermutation("original", "nalorigi"));
    	
    	CrackingTheCodingInterviewURLifyProblem3 urlIn = new CrackingTheCodingInterviewURLifyProblem3();
    	System.out.println(urlIn.replaceSpaces("MR John Smith"));
    	
    	PrintStringPermutations psp = new PrintStringPermutations();
    	psp.printStringPermutations("vi", "");
    	
    	CrackingTheCodingInterviewPalindromePermutationP4 p4 = new CrackingTheCodingInterviewPalindromePermutationP4();
    	System.out.println("is Given input permutation palindrome? " + p4.isPermutationPalindrome("tactcoa"));
    	System.out.println("is Given input permutation palindrome? " + p4.recommendedPermutationPalindrome("tatcoa"));
    	
    	CrackingTheCodingInterviewOnePointStringProblem5 p5 = new CrackingTheCodingInterviewOnePointStringProblem5();
    	System.out.println(p5.oneStep("pale", "bale"));
    	System.out.println(p5.oneStep("pale", "pbale"));
    	System.out.println(p5.oneStep("baale", "bale"));
    	System.out.println(p5.oneStep("baale", "pbele"));
    	
    	CrackingTheCodingInterviewStringCompressionProblem6 p6 = new CrackingTheCodingInterviewStringCompressionProblem6();
    	System.out.println("Compress the string: " + p6.compressString("viiiikraaaam"));
    	System.out.println("Compress the string: " + p6.compressString("vikram"));
    	
    	CrackingTheCodingInterviewStringRotationProblem8 p8 = new CrackingTheCodingInterviewStringRotationProblem8();
    	System.out.println("is string rotated? " +p8.isStringRotated("waterbottle", "erbottlewat"));
    	
    	int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
    	CrackingTheCodingInterviewArrayRotateProblem6 pp6 = new CrackingTheCodingInterviewArrayRotateProblem6();
    	pp6.rotateArray(input);
    	
    	LeetCodeEasyDuplicatesFromSortedArray l1 = new LeetCodeEasyDuplicatesFromSortedArray();
    	int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
    	System.out.println("Length post removal: "+ l1.recommendedSolution(nums1));
    	System.out.println(Arrays.toString(nums1));
    	//System.out.println(Arrays.toString(l1.deleteElement(nums1, 5)));
    	
    	LeetCodeStockBuyMaxProfit l2 = new LeetCodeStockBuyMaxProfit();
    	int[] prices = {10, 22, 5, 75, 65, 80};
		System.out.println("Max Profit: " + l2.maxProfit(prices));

		LeetCodeRotateArray l3 = new LeetCodeRotateArray();
		int[] rotateArray = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(l3.rotateEasy(rotateArray, 3)));
		
		LeetCodeSingleNumber s1 = new LeetCodeSingleNumber();
		int[] ss = {4,1,2,1,2};
		System.out.println("Single number:" + s1.singleNumber(ss));
		
		LeetCodeArrayIntersection la1 = new LeetCodeArrayIntersection();
		int[] la1input = {4,9,5};
		int[] la2input = {9,4,9,8,4};
		System.out.println(Arrays.toString(la1.intersect(la1input, la2input)));
		
		LeetCodeDailyTemperatures dt = new LeetCodeDailyTemperatures();
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
		System.out.println(Arrays.toString(dt.dailyTemperatures(T)));
		
		LeetCodePlusOne lp1 = new LeetCodePlusOne();
		int[] lpinput = {2,8,9};
		System.out.println(Arrays.toString(lp1.plusOne(lpinput)));
		
		l3.rotateInPlace(rotateArray, 3);
		System.out.println(Arrays.toString(rotateArray));
		
		LeetCodeMoveZeros lmz1 = new LeetCodeMoveZeros();
		int[] lmzinput = {0,1,0,3,12};
		lmz1.moveZeroes(lmzinput );
		
		LeetcodeFindPivotElement lfpvf1 = new LeetcodeFindPivotElement();
		int[] pivotInput = {1, 7, 3, 6, 5, 6};
		System.out.println(lfpvf1.pivotIndex(pivotInput));
		
		LeetCode2DiagonalTraverse l2d = new LeetCode2DiagonalTraverse();
		int[][] l2dinput = {{10,20,30},{40,50,60},{70,80,90}};
		System.out.println(Arrays.toString(l2d.findDiagonalOrder(l2dinput)));	
		
		LeetCodePascalsTriangle lpt = new LeetCodePascalsTriangle();
		System.out.println(lpt.generatePascalsTriangle(5));
		
		LeetCodeAddBinaryString lab = new LeetCodeAddBinaryString();
		System.out.println(lab.addBinary("11", "1"));
		
		String[] s = {"ISHIKA","ISHU","ISHK","ISHI","ISHT"};
		LeetCodeLongestCommonSequence llcs = new LeetCodeLongestCommonSequence();
		System.out.println("Longest Common subsequnce is: " + llcs.recommendedSol(s));
		
    }
}
