package umi.nonlinear;
import java.util.LinkedList;

public class WeightedGraph
{
	private int vertex;
	private LinkedList<Edge> [] adjList;
	
	public WeightedGraph(int vertex) 
	{
		super();
		this.vertex = vertex;
		
		adjList = new LinkedList[this.vertex];
		
		for(int i = 0 ; i < vertex ; i++)
		{
			adjList[i] = new LinkedList<>();
		}
	}
	
	public boolean addEdge(int source, int destination, int weight)
	{
		if(adjList.length > 0)
		{
			adjList[source].add(new Edge(destination, weight));
			
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
				
				for(Edge crawler : adjList[i])
				{
					System.out.print("---" + crawler.weight + "--->" + crawler.destination);
				}
				
				System.out.println();
				
			}
		}
	}
	
	class Edge
	{
		private int destination;
		private int weight;
		
		public Edge(int destination, int weight)
		{
			super();
			this.destination = destination;
			this.weight = weight;
		}
		
		
	}

}
