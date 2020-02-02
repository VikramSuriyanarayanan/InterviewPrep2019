/**
 * 
 */
package com.vikram.datastructures.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Remoz World
 *
 *There are N students in a class. Some of them are friends, while some are not. Their friendship is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C. And we defined a friend circle is a group of students who are direct or indirect friends.

Given a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not. And you have to output the total number of friend circles among all the students.

Example 1:
Input: 
[[1,1,0],
 [1,1,0],
 [0,0,1]]
Output: 2
Explanation:The 0th and 1st students are direct friends, so they are in a friend circle. 
The 2nd student himself is in a friend circle. So return 2.
Example 2:
Input: 
[[1,1,0],
 [1,1,1],
 [0,1,1]]
Output: 1
Explanation:The 0th and 1st students are direct friends, the 1st and 2nd students are direct friends, 
so the 0th and 2nd students are indirect friends. All of them are in the same friend circle, so return 1.
Note:
N is in range [1,200].
M[i][i] = 1 for all students.
If M[i][j] = 1, then M[j][i] = 1.
 */
public class FindingFriendsCircle547 {
	 public int findCircleNum(int[][] M) {
	        if (M.length == 0)
	            return 0;
	        
	        int rowLen = M.length;
	        int colLen = M[0].length;
	        boolean[] visited = new boolean[rowLen];
	        int friendsCount = 0;
	        
	        List<List<Integer>> adjMatrix = new ArrayList<List<Integer>>();
	        
	        for(int i=0;i<rowLen;i++) {
	            List<Integer> list = new ArrayList<Integer>();
	            adjMatrix.add(list);
	        }
	        
	        for(int i=0;i<rowLen;i++) {
	            for(int j=0;j<colLen;j++) {
	                if(M[i][j]==1) {
	                    adjMatrix.get(i).add(j);
	                    adjMatrix.get(j).add(i);
	                }
	            }
	        }
	        
	        
	        for(int i=0;i<rowLen;i++) {
	            if(!visited[i]) {
	                dfs(adjMatrix, i, visited);
	                visited[i]=true;
	                friendsCount++;
	            }
	        }
	        
	        return friendsCount;
	    }
	    
	    public void dfs(List<List<Integer>> adjMatrix, int index, boolean[] visited) {
	        List<Integer> tempList = adjMatrix.get(index);
	        for(int i=0;i<tempList.size();i++) {
	            if(!visited[tempList.get(i)]) {
	                visited[tempList.get(i)] = true;
	                dfs(adjMatrix, tempList.get(i), visited);
	            }
	        }
	    }
	    
	    /**
	    FIRST ATTEMPT:
	    public int findCircleNum(int[][] M) {
	        if(M.length == 0)
	            return 0;
	        
	        int rowLen = M.length;
	        int colLen = M[0].length;
	        
	        boolean[][] visited = new boolean[rowLen][rowLen];
	        int friendsCount = 0;
	        
	        for(int i=0;i<rowLen;i++) {
	            for(int j=0;j<colLen;j++) {
	                if(!visited[i][j] && (M[i][j]==1)) {
	                    friendsCount++;
	                    dfs(M,i,j,visited);
	                    visited[i][j] = true;
	                    visited[j][i] = true;
	                }
	            }
	        }
	        
	        return friendsCount;
	    }
	    
	    public void dfs(int[][] M, int i, int j, boolean[][] visited) {
	        if(i>=0 && i<M.length && j>=0 && j<M.length && !visited[i][j] && M[i][j]==1) {
	            visited[i][j] = true;
	            visited[j][i] = true;
	            dfs(M,i+1,j,visited);
	            dfs(M,i-1,j,visited);
	            dfs(M,i,j+1,visited);
	            dfs(M,i,j-1,visited);
	        }
	    } **/
}
