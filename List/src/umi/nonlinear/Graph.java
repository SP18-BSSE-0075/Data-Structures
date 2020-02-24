package umi.nonlinear;

import java.util.LinkedList;

public class Graph
{
	private int vertex;
	private LinkedList<Integer>[] adjList;
	
	public Graph(int vertex) 
	{
		super();
		this.vertex = vertex;
		adjList = new LinkedList[this.vertex];
		
		for(int i = 0 ; i < vertex ; i++)
		{
			adjList[i] = new LinkedList<Integer>();
		}
	}
	
	public boolean addEdge(int source, int destination)
	{
		if(adjList.length > 0)
		{
			adjList[source].add(destination);
			
			adjList[destination].add(source);   //for undirected graphs
			
			return true;
		}
		
		return true;
	}
	
	
	public void revealGraph()
	{
		if(adjList.length > 0)
		{
			for(int i = 0 ; i < vertex ; i++)
			{
				System.out.print("\n Adjancey List of Vertex " + i);
				
				for(Integer gcrawl : adjList[i])
				{
					System.out.print("-->" + gcrawl);
				}
				System.out.println();
			}
		}
	}
	

}
