package com.vikram.datastructures;

import java.util.*;

import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewArrayRotateProblem6;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewOnePointStringProblem5;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewPalindromePermutationP4;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewStringCompressionProblem6;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewStringPermutationProblem2;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewStringRotationProblem8;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewURLifyProblem3;
import com.vikram.datastructures.arrays.strings.LeetCode151ReverseStringMicrosoft;
import com.vikram.datastructures.arrays.strings.LeetCode2DiagonalTraverse;
import com.vikram.datastructures.arrays.strings.LeetCodeAddBinaryString;
import com.vikram.datastructures.arrays.strings.LeetCodeAddStrings415;
import com.vikram.datastructures.arrays.strings.LeetCodeArrayIntersection;
import com.vikram.datastructures.arrays.strings.LeetCodeContainseWithMostWater11;
import com.vikram.datastructures.arrays.strings.LeetCodeDailyTemperatures;
import com.vikram.datastructures.arrays.strings.LeetCodeEasyDuplicatesFromSortedArray;
import com.vikram.datastructures.arrays.strings.LeetCodeFindAllAnagrams438;
import com.vikram.datastructures.arrays.strings.LeetCodeFlipGame293;
import com.vikram.datastructures.arrays.strings.LeetCodeGroupAnagrams49;
import com.vikram.datastructures.arrays.strings.LeetCodeLongestCommonSequence;
import com.vikram.datastructures.arrays.strings.LeetCodeLongestConsecutiveOnes3;
import com.vikram.datastructures.arrays.strings.LeetCodeLongestPalindromeSubstring5;
import com.vikram.datastructures.arrays.strings.LeetCodeLongestRepeatingCharacterReplacement424;
import com.vikram.datastructures.arrays.strings.LeetCodeLongestSubstringTwoDistinct159;
import com.vikram.datastructures.arrays.strings.LeetCodeMaxConsecutiveIII1004;
import com.vikram.datastructures.arrays.strings.LeetCodeMicrosoft;
import com.vikram.datastructures.arrays.strings.LeetCodeMicrosoftFindTime;
import com.vikram.datastructures.arrays.strings.LeetCodeMinimumWindowSubstring76;
import com.vikram.datastructures.arrays.strings.LeetCodeMoveZeros;
import com.vikram.datastructures.arrays.strings.LeetCodePalindrome125;
import com.vikram.datastructures.arrays.strings.LeetCodePascalsTriangle;
import com.vikram.datastructures.arrays.strings.LeetCodePlusOne;
import com.vikram.datastructures.arrays.strings.LeetCodeRansomNote;
import com.vikram.datastructures.arrays.strings.LeetCodeRemoveKdigits402;
import com.vikram.datastructures.arrays.strings.LeetCodeReverseInteger127;
import com.vikram.datastructures.arrays.strings.LeetCodeReverseStringII186;
import com.vikram.datastructures.arrays.strings.LeetCodeRomanToInteger13;
import com.vikram.datastructures.arrays.strings.LeetCodeRotateArray;
import com.vikram.datastructures.arrays.strings.LeetCodeSingleNumber;
import com.vikram.datastructures.arrays.strings.LeetCodeSmallestDivisor1283;
import com.vikram.datastructures.arrays.strings.LeetCodeSnakeAndLadder909;
import com.vikram.datastructures.arrays.strings.LeetCodeSquareSorted977;
import com.vikram.datastructures.arrays.strings.LeetCodeStockBuyMaxProfit;
import com.vikram.datastructures.arrays.strings.LeetCodeStringAtoI8;
import com.vikram.datastructures.arrays.strings.LeetCodeTripletSum15;
import com.vikram.datastructures.arrays.strings.LeetCodeTwoSum;
import com.vikram.datastructures.arrays.strings.LeetcodeCountAndSay38;
import com.vikram.datastructures.arrays.strings.LeetcodeFindPivotElement;
import com.vikram.datastructures.arrays.strings.PrintStringPermutations;
import com.vikram.datastructures.arrays.strings.Testapp;
import com.vikram.datastructures.binary.search.LeetCodeFindRotatedIndex33;
import com.vikram.datastructures.binary.search.LeetCodeSortColors75;
import com.vikram.datastructures.stacks.leetcode.Leetcode227BasicCalculator2;
import com.vikram.ms.MicrosoftOnlineAssessmentPositiveNegative;
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

		LeetCode151ReverseStringMicrosoft l151 = new LeetCode151ReverseStringMicrosoft();
		System.out.println(l151.reverseWords("a good   example"));

		LeetCodeReverseInteger127 lri = new LeetCodeReverseInteger127();
		System.out.println(lri.reverse(123));

		LeetCodePalindrome125 lrp125 = new LeetCodePalindrome125();
		lrp125.isPalindrome("A man, a plan, a canal: Panama");


		MicrosoftOnlineAssessmentPositiveNegative moapn = new MicrosoftOnlineAssessmentPositiveNegative();
		int[] moapnInput = {3, 2, -2, 5, -3};

		System.out.println(moapn.findPositiveNegIndex(moapnInput)); 

		LeetCodeSortColors75 lsc75 = new LeetCodeSortColors75();
		int[] lsc75input = {1,0,2,1,1,0};
		lsc75.sortColors(lsc75input);
		System.out.println(Arrays.toString(lsc75input));
		Testapp t = new Testapp();
		t.testMethod("vikram");

		Leetcode227BasicCalculator2 lbc = new Leetcode227BasicCalculator2();
		String lbcInput = "4-3";
		System.out.println(lbc.calculate(lbcInput));
		
		LeetCodeStringAtoI8 latoi = new LeetCodeStringAtoI8();
		//System.out.println(latoi.myAtoi("4193"));
		
		LeetcodeCountAndSay38 lcs38 = new LeetcodeCountAndSay38();
		System.out.println(lcs38.countAndSay(10));
		
		LeetCodeFlipGame293 l293 = new LeetCodeFlipGame293();
		l293.generatePossibleNextMoves("++++");
		
		LeetCodeRansomNote lcrnote = new LeetCodeRansomNote();
		System.out.println(lcrnote.canConstruct("bg", "efggeb"));
		
		LeetCodeSmallestDivisor1283 lcrdivisor = new LeetCodeSmallestDivisor1283();
		int[] lcrdivisorInput = {1,2,5,9};
		
		System.out.println(lcrdivisor.smallestDivisor(lcrdivisorInput, 6));
		
		LeetCodeAddStrings415 l415 = new LeetCodeAddStrings415();
		System.out.println(l415.addStrings("98", "9"));
		
		int[] numsinp = {4,1,5,4};
		LeetCodeMicrosoft lcmic  = new LeetCodeMicrosoft();
		System.out.println(lcmic.findMaxDistance(numsinp));
		
		int[] A1 = {4,-1,0,3}, B1 = {-2, 5, 0 ,3};
		int[] A2 = {2,-2,-3,3}, B2 = {0,0,4,-4};
		int[] A3 = {4,-1,0,3}, B3 = {-2,6,0,4};
		int[] A4 = {3,2,6}, B4 = {4,1,6};
		int[] A5 = {1,4,2,-2,5}, B5 = {7,-2,-2,2,5};
		System.out.println("*******");
		LeetCodeTwoSum lct2 = new LeetCodeTwoSum();
		System.out.println(lct2.findFairIndex(A1, B1));
		System.out.println(lct2.findFairIndex(A2, B2));
		System.out.println(lct2.findFairIndex(A3, B3));
		System.out.println(lct2.findFairIndex(A4, B4));
		System.out.println(lct2.findFairIndex(A5, B5));
		
		LeetCodeLongestConsecutiveOnes3 lco3 = new LeetCodeLongestConsecutiveOnes3();
		System.out.println("LENGTH CONSECUTIVE: "+lco3.lengthOfLongestSubstring("pwwkew"));
		
		LeetCodeLongestSubstringTwoDistinct159 l159 = new LeetCodeLongestSubstringTwoDistinct159();
		System.out.println("LENGTH CONSECUTIVE AT 2 chars : "+l159.lengthOfLongestSubstringTwoDistinct("abaccc"));
		
		LeetCodeMinimumWindowSubstring76 l76 = new LeetCodeMinimumWindowSubstring76();
		System.out.println(l76.findMin("ADOBECODEBANC", "ABC"));
		
		LeetCodeLongestRepeatingCharacterReplacement424 l424 = new LeetCodeLongestRepeatingCharacterReplacement424();
		System.out.println("MAX REPEATING CHAR: "+ l424.findReplacement("AABABBA", 2));

		LeetCodeMaxConsecutiveIII1004 l1004 = new LeetCodeMaxConsecutiveIII1004();
		int[] l1004inp = {1,1,1,0,0,0,1,1,1,1,0};
		System.out.println("MAX CONSECUTIVE III is " + l1004.longestConsecutive(l1004inp, 2));
		
		LeetCodeMicrosoftFindTime lfindTime = new LeetCodeMicrosoftFindTime();
		System.out.println("TIME IS: "+lfindTime.findTime(8, true, -19));
		
		String[] anagramInput = {"eat","tea","tan","ate","nat","bat"};
		LeetCodeGroupAnagrams49 lga = new LeetCodeGroupAnagrams49();
		System.out.println("GROUP ANAGRAM OUTPUT: "+lga.groupAnagrams(anagramInput));
		
		LeetCodeFindAllAnagrams438 l438 = new LeetCodeFindAllAnagrams438();
		System.out.println(l438.findAnagrams("cbaebabacd", "abc").toString());
		
		LeetCodeLongestPalindromeSubstring5 l5 = new LeetCodeLongestPalindromeSubstring5();
		System.out.println("LongestPalindrome Substring: " + l5.longestPalindrome("babad"));
		
		LeetCodeSquareSorted977 l977 = new LeetCodeSquareSorted977();
		int[] lin977 = {-4,-1,0,3,10};
		System.out.println("SortedSquares" + Arrays.toString(l977.sortedSquares(lin977)));
		
		LeetCodeRomanToInteger13 leet13 = new LeetCodeRomanToInteger13();
		System.out.println("Converting ROMAN TO INT: "+String.valueOf(leet13.romanToInt("IX")));
		
		LeetCodeRemoveKdigits402 l402 = new LeetCodeRemoveKdigits402();
		System.out.println("Remove K digits"+l402.removeKdigits("1432219", 3));
		
		LeetCodeTripletSum15 l15 = new LeetCodeTripletSum15();
		int[] l15in = {-4,-1,-1,0,1,2};
		System.out.println("TRIPLET SUM: "+(l15.threeSum(l15in)).toString());
		
		LeetCodeContainseWithMostWater11 l11 = new LeetCodeContainseWithMostWater11();
		int[] l11input = {1,8,6,2,5,4,8,3,7};
		System.out.println("MAXAREA: "+ l11.maxArea(l11input));		
		
		LeetCodeSnakeAndLadder909 l909 = new LeetCodeSnakeAndLadder909();
		int[][] l909input = {{1,1,1,1},
				{2,2,1,22,33},{1,2,5,4,1}};
		l909.playGame(l909input);
		
		LeetCodeReverseStringII186 l186 = new LeetCodeReverseStringII186();
		char[] l186inp = {'t','h','e',' ','s','k','y',' ','i','s',' ','b','l','u','e'};
		char[] c = "hello world!".toCharArray();
		l186.reverseWords(c);
		System.out.println("MAYILANJI: " +Arrays.toString(c));
	}
}

