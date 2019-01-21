package hw10_2;

import java.util.LinkedList;
import java.util.Queue;

public class UndirectedListGraph {
	private class Node {
		int vertex;
		Node link;
		Node(int vertex) {
			this.vertex = vertex;
		}
	}

	private Node[] list;
	private int n; //정점 수
	private boolean[] visited;

	public UndirectedListGraph(int n) {
		list = new Node[n];
		this.n = n;
		visited = new boolean[n];
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
			System.out.println("간선 삽입 오류 - 잘못된 정점 번호입니다." + "<" + v1 + ", " + v2 + ">");
		else if(hasEdge(v1, v2))
			System.out.println("간선 삽입 오류 - 이미 존재하는 간선입니다." + "<" + v1 + ", " + v2 + ">");
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

	public void breadFirstSearch(int v) {
		if(v < 0 || v >= n) {
			System.out.println("잘못된 정점 번호 입니다.");
		}
		else {
			for(int i = 0; i < n; i++) {
				visited[i] = false;
			}

			Queue<Integer> q = new LinkedList<Integer>();
			q.offer(v);
			visited[v] = true;
			System.out.print("시작정점 " + v + "의 너비 우선탐색 = " + v);

			while(!q.isEmpty()) {
				v = q.remove();

				Node temp;
				for(temp = list[v]; temp != null; temp = temp.link) {
					if(visited[temp.vertex] == false) {
						visited[temp.vertex] = true;
						System.out.print(" " + temp.vertex);
						q.offer(temp.vertex);
					}
				}
			}
			System.out.println();
		}
	}
}
