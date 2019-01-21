package tutorials;

public class MyNewLinkedList {
	private class Node {
		int data;
		Node link;
		Node(int item) {
			data = item;
			link = null;
		}
	}

	private Node head = null; // 리스트의 첫번째 노드를 가리킴
	private Node last = null; // 리스트의 마지막 노드를 가리킴

	// (1) 첫번째 원소 item을 삽입하는 메소드 - 수행 시간은 O(1) 이어야 함
	public void addFirst(int item) {
		Node firstNode = new Node(item);
		if(head == null) {
			head=firstNode;
			last=firstNode;
		}
		else {
			firstNode.link = head;
			head = firstNode;
		}
	}
	
	// (2) 마지막 원소 item을 삽입하는 메소드 - 수행 시간은 O(1) 이어야 함
	public void addLast(int item) {
		Node lastNode = new Node(item);
		if(head == null) {
			last = lastNode;
			head = lastNode;
			
		}
		else {
			last.link = lastNode;
			last = lastNode;
		}
	}

	@Override
	public String toString() {
		String result = "";
		Node tmp = head;
		while(tmp != null) {
			result += tmp.data + " ";
			tmp = tmp.link;
		}
		return result;
	}

}
