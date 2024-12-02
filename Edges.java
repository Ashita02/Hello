package quesBank3;

import java.util.Objects;

public class Edge implements Comparable<Edge>{
	private int fromNode;
	private int toNode;
	
	private Edge(int fromNode, int toNode) {
		this.fromNode = fromNode;
		this.toNode = toNode;
		
		private static Edge createEdge(int fromNode, int toNode) {
			return new Edge(fromNode, toNode);
		}
	}

	@Override
	public int compareTo(Edge edge) {
		if(this.fromNode == edge.fromNode && this.toNode == edge.toNode) {
			return 0;
		}else {
			if(this.fromNode != edge.fromNode) {
				return Integer.compare(this.fromNode, edge.fromNode);
			}else {
				return Integer.compare(this.toNode, edge.toNode);
			}
		}
		
	}

	
	@Override
	public String toString() {
		return "From node: "+ fromNode + "To node :" + toNode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		return fromNode == other.fromNode && toNode == other.toNode;
	}
	
	
}
public class Edges {

}
