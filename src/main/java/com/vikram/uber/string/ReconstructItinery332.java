package com.vikram.uber.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * Given a list of airline tickets represented by pairs of departure and arrival airports [from, to], reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.

Note:

If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string. For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
All airports are represented by three capital letters (IATA code).
You may assume all tickets form at least one valid itinerary.
Example 1:

Input: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
Output: ["JFK", "MUC", "LHR", "SFO", "SJC"]
Example 2:

Input: [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"].
             But it is larger in lexical order.

 * @author Remoz World
 *
 */
public class ReconstructItinery332 {
	public List<String> findItinerary(List<List<String>> tickets) {
		List<String> output = new ArrayList<String>();
		Map<String,List<String>> hm = new HashMap<String,List<String>>();
		String searchTerm = "JFK";
		output.add(searchTerm);
		for(List<String> list:tickets ) {
			List<String> arr = new ArrayList<String>();

			if(hm.containsKey(list.get(0))) {
				arr = hm.get(list.get(0));
			}

			arr.add(list.get(1));
			Collections.sort(arr);
			hm.put(list.get(0),arr);
		}

		Queue<String> queue = new LinkedList<String>();
		boolean flag = true;

		while(!queue.isEmpty() || flag) {
			if (hm.containsKey(searchTerm)) {
				for (String s:hm.get(searchTerm))
					queue.offer(s);
			}

			searchTerm = queue.poll();
			output.add(searchTerm);
			flag = false;
		}

		//		int size = tickets.size();
		//		int i=0;
		//		while(i<size) {
		//			List<String> arr = new ArrayList<String>();
		//			if (hm.containsKey(searchTerm)) {
		//				arr = hm.get(searchTerm);
		//				searchTerm = arr.get(0);
		//				output.add(searchTerm);
		//				arr.remove(searchTerm);
		//			}
		//
		//			i++;
		//		}

		return output;
	}
}
