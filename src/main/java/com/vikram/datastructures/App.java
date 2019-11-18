package com.vikram.datastructures;

import java.util.*;

import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewOnePointStringProblem5;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewPalindromePermutationP4;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewStringPermutationProblem2;
import com.vikram.datastructures.arrays.strings.CrackingTheCodingInterviewURLifyProblem3;
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



    }
}
