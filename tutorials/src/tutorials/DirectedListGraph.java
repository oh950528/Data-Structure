package tutorials;

/*
 * ���ϸ�: DirectedListGraph.java
 * �ۼ���: 2018.12.3
 * �ۼ���: ���ϱ�
 * ����: ��������Ʈ�� �̿��Ͽ� ���� �׷����� ������ Ŭ����
 */

class DirectedListGraph {
	private class Node {
		int vertex;
		Node link;
		Node(int vertex) {
			this.vertex = vertex;
		}
	}
	private Node[] list; // ���� ����Ʈ
	private int n; // ���� ��
	private int[] inDeg;

	// ���� 0, 1, 2, ..., n-1 �� �׷����� ����
	public DirectedListGraph(int n) {
		list = new Node[n];
		this.n = n;
		inDeg = new int[n];
	}

	// ���� v�� ���������� ���Ͽ� �����ϴ� �޼ҵ� ************* (2)
	public int inDegree(int v) {
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			Node temp = list[i];
			while(temp != null) {
				if(temp.vertex == v)
					count++;
				temp = temp.link;
			}
		}
		return count;    // �޼ҵ� �ϼ� �� ������ ��
	}


	// ���� (v1, v2) ���� ���θ� �˻� - ���� ��ȣ�� �߸��� ���� ���� �߻�
	public boolean hasEdge(int v1, int v2) {
		Node p = list[v1];
		while(p != null) {
			if(p.vertex == v2)
				return true;
			p = p.link;
		}
		return false;
	}

	// ���� (v1, v2)�� ����
	public void addEdge(int v1, int v2) {
		if(!isValid(v1) || !isValid(v2)) {
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�. (" + v1 + ", " + v2 + ")");
		}
		else if(hasEdge(v1, v2)) {
			System.out.println("���� ���� ���� - �̹� �����ϴ� �����Դϴ�. (" + v1 + ", " + v2 + ")");
		}
		else {
			Node newNode = new Node(v2);
//			inDeg[v2] += 1;
			newNode.link = list[v1];
			list[v1] = newNode;
		}
	}

	// ���� ��ȣ�� ��ȿ���� �˻�
	private boolean isValid(int v) {
		return v >= 0 && v < n;
	}
}