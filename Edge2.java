package quesBank3;

import java.util.Objects;

class Edge{
	public final int fromNode;
	public final int toNode;
	private Edge(int fromNode, int toNode) {
		this.fromNode = fromNode;
		this.toNode = toNode;
	}
	@Override
	public int hashCode() {
		return (int)((fromNode * 100000L + toNode)% 1000000007);
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		Edge edge = (Edge)o;
		if (this.fromNode == edge.fromNode && this.toNode == edge.toNode) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "Edge [fromNode=" + this.fromNode + ", toNode=" + this.toNode + "]";
	}
	public static Edge createEdge(int fromNode, int toNode) {
		return new Edge(fromNode, toNode);
	}
	
}
public class Edge2 {

}
