package com.ds.graph;

import java.util.ArrayList;

import com.ds.graph.Undirected_Unweighted_Graph.Edge;

public class Undirected_Weighted_Graph {
	
	static class Edge{
		int src;
		int dest;
		int wight;
		
		public Edge(int src, int dest, int wight) {
			this.src = src;
			this.dest = dest;
			this.wight = wight;
		}
	}

	public static void main(String[] args) {
		int v=4;
		ArrayList<Edge> graph[] = new ArrayList[v] ;
		
		//create graph
		createGraph(graph);
		
		printNaighboursAndWeight(2, graph);
	}
	
	public static void createGraph(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i] = new ArrayList<Edge>();
		}
		
		graph[0].add(new Edge(0,2,2));
		
		graph[1].add(new Edge(1,2,10));
		graph[1].add(new Edge(1,2,0));
		
		graph[2].add(new Edge(2,3,-1));
		graph[2].add(new Edge(2,0,2));
		graph[2].add(new Edge(2,1,10));
		
		graph[3].add(new Edge(3,2,-1));
		graph[3].add(new Edge(3,1,0));
	}
	
	public static void printNaighboursAndWeight(int v, ArrayList<Edge> graph[]) {
		for(int i=0; i<graph[v].size();i++) {
			Edge e = graph[v].get(i);
			System.out.println(e.dest+" "+e.wight);
		}
	}

}
