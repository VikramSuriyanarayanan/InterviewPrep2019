/**
 * 
 */
package com.vikram.datastructures.matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Remoz World
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

Example 1:

Input: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
Output: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
Example 2:

Input: 
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
Output: 
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]
 */
public class LeetCodeSetMatrixZeros73 {
	public void setZeroes(int[][] matrix) {
		int rowLength = matrix.length;
		int columnLength = matrix[0].length;
		List<Integer> rows = new ArrayList<Integer>();
		List<Integer> cols = new ArrayList<Integer>();

		for(int i=0;i<rowLength;i++) {
			for(int j=0;j<columnLength;j++) {
				if (matrix[i][j]==0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}

		for(int i:rows)  {
			for(int j=0;j<columnLength;j++) {
				matrix[i][j]=0;
			}
		}

		for(int i=0;i<rowLength;i++) {
			for(int j:cols) {
				matrix[i][j]=0;
			}
		}
	}
}
