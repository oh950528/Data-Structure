package lab10_1;

public class DirectedMatrixGraph {
	private int[][] matrix;
	private int n;

	public DirectedMatrixGraph(int n) {
		matrix = new int[n][n];
		this.n = n;
	}

	public boolean hasEdge(int v1, int v2) {
		if(matrix[v1][v2] == 1)
			return true;
		else
			return false;
	}

	public void addEdge(int v1, int v2) {
		if(v1 < 0 || v1 >= n || v2 < 0 || v2 >= n)
			System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다." + "<" + v1 + "," + v2 + ">");
		else if(hasEdge(v1, v2))
			System.out.println("간섭 삽입 오류 - 이미 존재하는 간선입니다." + "<" + v1 + "," + v2 + ">");
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

}
