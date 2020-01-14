/**
 * 
 */
package com.vikram.datastructures.matrix;

/**
 * @author Remoz World
 *
 */
public class LeetCodeRotateMatrix48 {
	 /**
    Simple approach:
    1. Transpose the matrix
    2. Rotate each row
    **/
    public void rotate(int[][] matrix) {
        int len = matrix.length;
              
        //Transpose the matrix
        for(int i=0;i<len;i++) {
            for(int j=i;j<len;j++) {
                 swap(matrix,i,j);      
            }
        }
        
        //reverse the rows in matrix
        for(int i=0;i<len;i++) {
          for(int j=0;j<len/2;j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][len-j-1];
            matrix[i][len-j-1] = temp;
          }
        }              
    }
    
    public void swap(int[][] matrix, int start, int end) {
        int temp = matrix[start][end];
        matrix[start][end] = matrix[end][start];
        matrix[end][start] = temp;
    }        
}
