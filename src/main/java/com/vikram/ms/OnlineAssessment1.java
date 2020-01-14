/**
 * 
 */
package com.vikram.ms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * @author Remoz World
 * Given an array of size n, rearrange the numbers of the array in such
 * a way that even and odd numbers are arranged alternatively
 * in increasing order.
 * 
 * https://www.geeksforgeeks.org/rearrange-odd-and-even-values-in-alternate-fashion-in-ascending-order/
 */
public class OnlineAssessment1 {

	public void sortOddAndEven(int[] arr, int n) {
		 Arrays.sort(arr) ; 
         
	        Vector v1 = new Vector(); // to insert even values  
	        Vector v2 = new Vector(); // to insert odd values  
	      
	        for (int i = 0; i < n; i++)  
	            if (arr[i] % 2 == 0)  
	                v1.add(arr[i]);  
	            else
	                v2.add(arr[i]);  
	      
	        int index = 0, i = 0, j = 0;  
	      
	        boolean flag = false;  
	      
	        // Set flag to true if first element is even  
	        if (arr[0] % 2 == 0)  
	            flag = true;  
	      
	        // Start rearranging array  
	        while (index < n)  
	        {  
	      
	            // If first element is even  
	            if (flag == true)  
	            {  
	                arr[index] = (int)v1.get(i);  
	                i += 1 ; 
	                index += 1 ; 
	                flag = !flag;  
	            }  
	      
	            // Else, first element is Odd  
	            else
	            {  
	                arr[index] = (int)v2.get(j) ;  
	                j += 1 ; 
	                index += 1 ; 
	                flag = !flag;  
	            }  
	        }  
	      
	        // Print the rearranged array  
	        for (i = 0; i < n; i++)  
	            System.out.print(arr[i] + " ");
	}
}
