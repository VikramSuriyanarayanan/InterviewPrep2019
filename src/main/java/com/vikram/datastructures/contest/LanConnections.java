/**
 * 
 */
package com.vikram.datastructures.contest;

import java.util.Arrays;

/**
 * @author Remoz World
 *
 *	Connect all the computers. 
 */
public class LanConnections {
	int [] parent;
    boolean [] isRoot;
    int CC = 0;
    public int makeConnected(int n, int[][] connections) {
        CC = n;
        parent = new int[n];
        isRoot = new boolean[n];
        Arrays.fill(parent, -1);
        int m = connections.length;
        if(m < n - 1)
            return -1;
        for(int [] c : connections)
            union(c[0], c[1]);
        return CC - 1;
    }
    void union(int i, int j)
    {
        int pi = find(i), pj = find(j);
        if(pi != pj)
        {
            parent[pi] = pj;
            CC--;
        }
    }
    int find(int i)
    {
        while(parent[i] != -1)
            i = parent[i];
        return i;
    }
}	
