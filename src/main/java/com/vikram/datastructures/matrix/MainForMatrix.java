package com.vikram.datastructures.matrix;

public class MainForMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {
		                  {1,   3,  5,  7},
		                  {10, 11, 16, 20},
		                  {23, 30, 34, 50}
		};
			
		LeetCodeSearch2D74 l74 = new LeetCodeSearch2D74();
		System.out.println(l74.searchMatrix(matrix, 11));
		
		Geek4GeeksBFS matrixbfs = new Geek4GeeksBFS();
		char[][] shortPathinp = {
                {'d',   'a',  'a',  's'},
                {'a', 'a', 'a', 'a'},
                {'a', 'a', 'a', 'a'}
};
		System.out.println("SHORTEST PATH: " +matrixbfs.useBFSToFindShortestPath(shortPathinp));
	
		Geek4GeeksBFSWithBlocks matrixbfsWithBlocks = new Geek4GeeksBFSWithBlocks();
		char[][] shortPathinpWithBlocks = {
                {'a',   'a',  '0',  's'},
                {'0', 'a', 'a', 'a'},
                {'d', 'a', 'a', '0'}
};
		char[][] geekinput = { { '0', '*', '0', 's' }, 
                { '*', '0', '*', '*' }, 
                { '0', '*', '*', '*' }, 
                { 'd', '*', '*', '*' } }; 
		System.out.println("SHORTEST PATH WITH BLOCKS: " +matrixbfsWithBlocks.useBFSToFindShortestPath(geekinput));
	}

}
