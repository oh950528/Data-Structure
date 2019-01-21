package tutorials;

/*
 * ���ϸ�: DirectedMatrixGraph.java
 * �ۼ���: 2018.12.3
 * �ۼ���: ���ϱ�
 * ����: ��������� �̿��Ͽ� ���� �׷����� ������ Ŭ����
 */

class DirectedMatrixGraph {
	private int[][] matrix;  // ���� ���
	private int n;    // ���� ��

	// ���� 0, 1, 2, ..., n-1 �� �׷����� ����
	public DirectedMatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
	}

	// ���� v�� ���������� ���Ͽ� �����ϴ� �޼ҵ� ************* (1)
	public int inDegree(int v) {
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(matrix[i][v] == 1)
				count++;
		}
		return count;    // �޼ҵ� �ϼ� �� ������ ��
	}

	// ���� (v1, v2) ���� ���θ� �˻� - ���� ��ȣ�� �߸��� ���� ���� �߻�
	public boolean hasEdge(int v1, int v2) {
		return matrix[v1][v2] == 1;
	}

	// ���� (v1, v2) �� ����
	public void addEdge(int v1, int v2) {
		if(!isValid(v1) || !isValid(v2)) {
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�. <" + v1 + ", " + v2 + ">");
		}
		else if(hasEdge(v1, v2)) {
			System.out.println("���� ���� ���� - �̹� �����ϴ� �����Դϴ�. <" + v1 + ", " + v2 + ">");
		}
		else {
			matrix[v1][v2] = 1;
		}
	}

	// ���� ��ȣ�� ��ȿ���� �˻�
	private boolean isValid(int v) {
		return v >= 0 && v < n;
	}
}


