package com.ds.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Undirected_Unweighted_Graph {

	static class Edge {
		int src;
		int dest;

		public Edge(int src, int dest) {
			this.src = src;
			this.dest = dest;
		}
	}

	public static void main(String[] args) {
		int v = 7;
		ArrayList<Edge> graph[] = new ArrayList[v];

		// create graph
		createGraph(graph);

		// print 4's naighbours
		// printNaighbours(3, graph);

		// bfs
		bfs(v, graph);

	}

	public static void createGraph(ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph.length; i++) {
			graph[i] = new ArrayList<>();
		}

		graph[0].add(new Edge(0, 1));
		graph[0].add(new Edge(0, 2));

		graph[1].add(new Edge(1, 0));
		graph[1].add(new Edge(1, 3));

		graph[2].add(new Edge(2, 0));
		graph[2].add(new Edge(2, 4));

		graph[3].add(new Edge(3, 1));
		graph[3].add(new Edge(3, 4));
		graph[3].add(new Edge(3, 5));

		graph[4].add(new Edge(4, 2));
		graph[4].add(new Edge(4, 3));
		graph[4].add(new Edge(4, 5));

		graph[5].add(new Edge(5, 3));
		graph[5].add(new Edge(5, 4));
		graph[5].add(new Edge(5, 6));

		graph[6].add(new Edge(6, 5));
	}

	public static void printNaighbours(int v, ArrayList<Edge> graph[]) {
		for (int i = 0; i < graph[v].size(); i++) {
			Edge e = graph[v].get(i);
			System.out.print(e.dest + " ");
		}
	}

	public static void bfs(int v, ArrayList<Edge> graph[]) {
		Queue<Integer> q = new LinkedList<>();
		boolean visit[] = new boolean[v];
		q.add(0);
		while (!q.isEmpty()) {
			int curr = q.remove();
			if (visit[curr] == false) {
				System.out.print(curr + " ");
				visit[curr] = true;
				for (int i = 0; i < graph[curr].size(); i++) {
					Edge e = graph[curr].get(i);
					q.add(e.dest);
				}
			}
		}
	}

	public int[] shortestPath(int N, int M, int[][] edges) {

		int dist[] = new int[N];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[0] = 0;

		for (int i = 0; i < M - 1; i++) {
			for (int[] val : edges) {
				int src = val[0];
				int dest = val[1];
				int w = val[2];

				if (dist[src] != Integer.MAX_VALUE && dist[src] + w < dist[dest]) {
					dist[dest] = dist[src] + w;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			if (dist[i] == Integer.MAX_VALUE)
				dist[i] = -1;
		}

		return dist;

	}
}
/*
 * 
 * class Solution {
 * 
 * int shortestDistance(int N, int M, int A[][], int X, int Y) {
 * 
 * if(A[0][0] == 0) return -1;
 * 
 * int res = bfs(X, Y, A);
 * 
 * return res == (int)Math.pow(10,9) ? -1 : res;
 * 
 * 
 * 
 * }
 * 
 * int bfs(int x, int y, int arr[][]) {
 * 
 * Queue<int[]> q = new LinkedList<>();
 * 
 * q.add(new int[]{0,0,0});
 * 
 * arr[0][0] = 0;
 * 
 * while(!q.isEmpty()){
 * 
 * int n = q.size();
 * 
 * for(int p = 0 ; p<n ; p++){
 * 
 * int[] curr = q.poll();
 * 
 * int i = curr[0], j = curr[1], c = curr[2];
 * 
 * if(i == x && j == y) return c;
 * 
 * if(i>0 && arr[i-1][j] == 1){
 * 
 * arr[i-1][j] = 0;
 * 
 * q.add(new int[]{i-1, j, c+1});
 * 
 * }
 * 
 * if(j>0 && arr[i][j-1] == 1){
 * 
 * arr[i][j-1] = 0;
 * 
 * q.add(new int[]{i, j-1, c+1});
 * 
 * }
 * 
 * if(i<arr.length-1 && arr[i+1][j] == 1){
 * 
 * arr[i+1][j] = 0;
 * 
 * q.add(new int[]{i+1, j, c+1});
 * 
 * }
 * 
 * if(j<arr[0].length-1 && arr[i][j+1] == 1){
 * 
 * arr[i][j+1] = 0;
 * 
 * q.add(new int[]{i, j+1, c+1});
 * 
 * }
 * 
 * }
 * 
 * }
 * 
 * return -1;
 * 
 * }
 * 
 * };
 * 
 */
