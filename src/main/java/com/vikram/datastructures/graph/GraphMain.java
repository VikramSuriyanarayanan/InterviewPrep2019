/**
 * 
 */
package com.vikram.datastructures.graph;

/**
 * @author Remoz World
 *
 */
public class GraphMain {
	public static void main(String[] args) {
		CityWithSmallestNeighbours5321 c5421 = new CityWithSmallestNeighbours5321();
		//[[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]]
		int[][] c5421in = {{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}};
		c5421.findTheCity(5, c5421in, 2);
	}
}
