/**
 * 
 */
package com.vikram.datastructures.matrix;

/**
 * @author Remoz World
 *
 *Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
Example 1:

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
Output: true
Example 2:

Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 13
Output: false
 */
public class LeetCodeSearch2D74 {
	   public boolean searchMatrix(int[][] matrix, int target) {
		   
	        int rowIndex = getRowIndex(matrix,target);
	        System.out.println("ROWINDEX: "+ rowIndex);
	        int low = 0;
	        int hi = matrix[0].length-1;
	        int mid = 0;
	        
	        while(low <= hi)  {
	            mid = low + (hi-low)/2;
	            if (matrix[rowIndex][mid] < target)
	                low = mid+1;
	            else if (matrix[rowIndex][mid] > target)
	                hi = mid-1;
	            else if (matrix[rowIndex][mid] == target)
	                return true;
	        }
	        
	        return false;
	    }
	    
	    public int getRowIndex(int[][] matrix, int target) {
	        int low = 0, hi= matrix.length-1, mid = 0;
	        while(low <= hi) {
	            mid = low + (hi-low)/2;
	            if (matrix[mid][0] < target)
	                low = mid+1;
	            else if (matrix[mid][0] > target)
	                hi = mid-1;
	            else if (matrix[mid][0] == target)
	                return mid;
	        }
	        
	        return hi;
	    }
}
