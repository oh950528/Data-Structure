package hw10_1;

public class DirectedMatrixGraph {
	private int[][] matrix;
	private int n;
	private boolean[] visited;

	public DirectedMatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
		visited = new boolean[n];
	}

	public boolean hasEdge(int v1, int v2) {
		if(matrix[v1][v2] == 1)
			return true;
		else
			return false;
	}

	public void addEdge(int v1, int v2) {
		if(v1 < 0 || v1 >= n || v2 < 0 || v2 >= n)
			System.out.println("���� ���� ���� - �߸��� ���� ��ȣ�Դϴ�." + "<" + v1 + "," + v2 + ">");
		else if(hasEdge(v1, v2))
			System.out.println("���� ���� ���� - �̹� �����ϴ� �����Դϴ�." + "<" + v1 + "," + v2 + ">");
		else
			matrix[v1][v2] = 1;
	}

	public void printAdjacentVertices(int v) {
		for(int i = 0; i < n; i++) {
			if(matrix[v][i] == 1)
				System.out.print(" " + i);
		}
		System.out.println();
	}
	
	public void depthFirstSearch(int v) {
		if(v < 0 || v >= n) {
			System.out.println("�߸��� ���� ��ȣ �Դϴ�.");
		}
		else {
			for(int i = 0; i < n; i++) {
				visited[i] = false;
			}
			System.out.print("�������� " + v + "�� ���� �켱Ž�� = " + v);
			DFS(v);
			System.out.println();
		}
			
	}
	
	private void DFS(int v) {
		visited[v] = true;
		
		for(int i = 0; i < n; i++) {
			if(matrix[v][i] == 1 && visited[i] == false) {
				System.out.print(" " + i);
				DFS(i);
			}
		}
	}
}
