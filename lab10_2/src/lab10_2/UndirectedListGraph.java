package lab10_2;

public class UndirectedListGraph {
	private class Node {
		int vertex;
		Node link;
		Node(int vertex) {
			this.vertex = vertex;
		}
	}

	private Node[] list;
	private int n; //���� ��

	public UndirectedListGraph(int n) {
		list = new Node[n];
		this.n = n;
	}

	public boolean hasEdge(int v1, int v2) {
		Node temp = list[v1];
		if(temp == null) {
			return false;
		}
		
		while(temp != null) {
			if(temp.vertex == v2) {
				return true;
			}
			temp = temp.link;
		}
		return false;
	}

	public void addEdge(int v1, int v2) {
		if(v1 < 0 || v1 >= n || v2 < 0 || v2 >= n)
			System.out.println("�߸��� ���� ��ȣ�Դϴ�.");
		else if(hasEdge(v1, v2))
			System.out.println("���� ���� ���� - �̹� �����ϴ� �����Դϴ�. " + "(" + v1 + ", " + v2 + ")");
		else {
			Node node1 = new Node(v2);
			node1.link = list[v1];
			list[v1] = node1;

			Node node2 = new Node(v1);
			node2.link = list[v2];
			list[v2] = node2;
		}
	}

	public void printAdjacentVertices(int v) {
		Node temp = list[v];
		while(temp != null) {
			System.out.print(" " + temp.vertex);
			temp = temp.link;
		}
		System.out.println();
	}
}
