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

	private Node head = null; // ����Ʈ�� ù��° ��带 ����Ŵ
	private Node last = null; // ����Ʈ�� ������ ��带 ����Ŵ

	// (1) ù��° ���� item�� �����ϴ� �޼ҵ� - ���� �ð��� O(1) �̾�� ��
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
	
	// (2) ������ ���� item�� �����ϴ� �޼ҵ� - ���� �ð��� O(1) �̾�� ��
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
