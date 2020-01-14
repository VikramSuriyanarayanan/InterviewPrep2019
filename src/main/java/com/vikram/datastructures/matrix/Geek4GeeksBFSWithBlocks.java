/**
 * 
 */
package com.vikram.datastructures.matrix;

import java.util.LinkedList;
import java.util.Queue;

import com.vikram.datastructures.matrix.Geek4GeeksBFS.MyTraverseClass;

/**
 * @author Remoz World
 *
 */
public class Geek4GeeksBFSWithBlocks {
	public int useBFSToFindShortestPath(char[][] matrix) {
		
		if(matrix.length < 1)
			return -1;
		
		//Whats the queue's data type? - use my own user defined data type.
		//how to traverse and add to queue. -1,1,-1,1.
		// Got an exception processing visited boolean.i cant access i*j when 0 Rectify it. - Use 2D matrix. 
		Queue<MyTraverseClass> queue = new LinkedList<MyTraverseClass>();
		int rowLength = matrix.length;
		int columnLength = matrix[0].length;
		boolean[][] visited = new boolean[rowLength][columnLength];

		
		//finding the 's' first.
		for(int i=0;i<rowLength;i++) {
			for (int j=0;j<columnLength;j++) {
				if(matrix[i][j]=='s') {
					MyTraverseClass t = new MyTraverseClass(i,j,0);
					visited[i][j]=true;
					queue.offer(t);
					break;
				}
			}
		}
		
		while(!queue.isEmpty()) {
			MyTraverseClass t = queue.poll();
			
			if(matrix[t.row][t.column]=='d')
				return t.distance;
			
			//moving up
			 if(t.row > 0 && !visited[t.row-1][t.column] && matrix[t.row-1][t.column] !='0') {
				 MyTraverseClass up = new MyTraverseClass(t.row-1,t.column,t.distance+1);
				 queue.add(up);
				 visited[t.row-1][t.column] = true;
			 }
			 
			 //moving bottom
			 if(t.row < rowLength-1 && !visited[t.row+1][t.column] && matrix[t.row+1][t.column] !='0') {
				 MyTraverseClass bottom = new MyTraverseClass(t.row+1,t.column,t.distance+1);
				 queue.add(bottom);
				 visited[t.row+1][t.column] = true;
			 }
			 
			 // moving left
			 if(t.column > 0 && !visited[t.row][t.column-1] && matrix[t.row][t.column-1] != '0') {
				 MyTraverseClass left = new MyTraverseClass(t.row,t.column-1,t.distance+1);
				 queue.add(left);
				 visited[t.row][t.column-1] = true;
			 }
			 
			 // moving right
			 if(t.column < columnLength-1 && !visited[t.row][t.column+1] && matrix[t.row][t.column+1] != '0') {
				 MyTraverseClass right = new MyTraverseClass(t.row,t.column+1,t.distance+1);
				 queue.add(right);
				 visited[t.row][t.column+1] = true;
			 }
		}
		
		
		return -1;
	}
	
	class MyTraverseClass {
		int row;
		int column;
		int distance;
		
		MyTraverseClass(int row, int column, int distance) {
			this.row = row;
			this.column = column;
			this.distance = distance;
		}
	}
}
