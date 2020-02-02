/**
 * 
 */
package com.vikram.datastructures.graph;

/**
 * @author Remoz World
 *
 *Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Example 1:

Input:
11110
11010
11000
00000

Output: 1
Example 2:

Input:
11000
11000
00100
00011

Output: 3
 */
public class NoOfIslands200 {
	 public int numIslands(char[][] grid) {
	        if(grid.length == 0)
	            return 0;
	        
	        int rowLen = grid.length;
	        int colLen =  grid[0].length;
	        int count = 0;
	        
	        boolean[][] visited = new boolean[rowLen][colLen];
	        
	        for(int i=0;i<rowLen;i++) {
	            for(int j=0;j<colLen;j++) {
	                if(!visited[i][j] && grid[i][j] == '1') {
	                    dfs(grid, visited, i, j);
	                    visited[i][j] = true;
	                    count++;
	                }
	            }
	        }
	        
	        return count;
	    }
	    
	    public void dfs(char[][] grid, boolean[][] visited, int i, int j) {
	        if(i<grid.length && j<grid[0].length && i>=0 && j>=0 && grid[i][j] == '1' && !visited[i][j]) {
	            visited[i][j] = true;
	            dfs(grid, visited, i+1, j);
	            dfs(grid, visited, i-1, j);
	            dfs(grid, visited, i, j+1);
	            dfs(grid, visited, i, j-1);
	        }
	    }
}
