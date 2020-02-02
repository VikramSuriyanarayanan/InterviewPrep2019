/**
 * 
 */
package com.vikram.datastructures.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Remoz World
 *
 *There are n cities numbered from 0 to n-1. Given the array edges where edges[i] = [fromi, toi, weighti] represents a bidirectional and weighted edge between cities fromi and toi, and given the integer distanceThreshold.

Return the city with the smallest number of cities that are reachable through some path and whose distance is at most distanceThreshold, If there are multiple such cities, return the city with the greatest number.

Notice that the distance of a path connecting cities i and j is equal to the sum of the edges' weights along that path.



Example 1:



Input: n = 4, edges = [[0,1,3],[1,2,1],[1,3,4],[2,3,1]], distanceThreshold = 4
Output: 3
Explanation: The figure above describes the graph. 
The neighboring cities at a distanceThreshold = 4 for each city are:
City 0 -> [City 1, City 2] 
City 1 -> [City 0, City 2, City 3] 
City 2 -> [City 0, City 1, City 3] 
City 3 -> [City 1, City 2] 
Cities 0 and 3 have 2 neighboring cities at a distanceThreshold = 4, but we have to return city 3 since it has the greatest number.
Example 2:



Input: n = 5, edges = [[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]], distanceThreshold = 2
Output: 0
Explanation: The figure above describes the graph. 
The neighboring cities at a distanceThreshold = 2 for each city are:
City 0 -> [City 1] 
City 1 -> [City 0, City 4] 
City 2 -> [City 3, City 4] 
City 3 -> [City 2, City 4]
City 4 -> [City 1, City 2, City 3] 
The city 0 has 1 neighboring city at a distanceThreshold = 2.
 */
public class CityWithSmallestNeighbours5321 {
	public int findTheCity(int n, int[][] edges, int distanceThreshold) {
		if(edges.length==0) {
			return 0;
		}

		List<List<City>> adjMatrix = new ArrayList<List<City>>();

		for(int i=0;i<n;i++) {
			adjMatrix.add(new ArrayList<City>());
		}

		for(int[] edge:edges) {
			adjMatrix.get(edge[0]).add(new City(edge[1],edge[2]));
			adjMatrix.get(edge[1]).add(new City(edge[0],edge[2]));
		}

		boolean[] visited = new boolean[n];
		int finalCityId = 0;

		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				Queue<Integer> queue = new LinkedList<Integer>();
				queue.offer(i);
				visited[i] = true;
				int threshold = 0;
				int minCityCount = Integer.MAX_VALUE;
				int cityCount = 0;

				while(!queue.isEmpty()) {
					
					int cityIndex = queue.poll();
					for(City c:adjMatrix.get(cityIndex)) {
						if(!visited[c.id] && (threshold<=distanceThreshold)) {
							queue.offer(c.id);
							visited[c.id]=true;
							threshold += c.weight;
							cityCount++;
						}
					}
				}

				if(cityCount<=minCityCount) {
					finalCityId = i;
				}
			}
		}

		return finalCityId;
	}

	public class City {
		public int weight;
		public int id;

		public City(int id, int weight) {
			this.id = id;
			this.weight = weight;
		}
	}
}
