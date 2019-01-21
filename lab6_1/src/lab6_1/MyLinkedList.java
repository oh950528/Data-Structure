package lab6_1;

public class MyLinkedList {
	private class Node {
		int data;
		Node link;

		Node(int data) {
			this.data = data;
		}
	}

	private Node head;

	public int size() {
		Node node = head;
		int numb = 0;
		do {
			node = node.link;
			numb++;
		} while(node != null);
		return numb;
	}

	public void addFirst(int data) {
		Node node = new Node(data);
		node.link = head;
		head = node;
	}

	public void addLast(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}

		else {
			Node current = head;
			while (current.link != null) {
				current = current.link;
			}
			current.link = node;
		}
	}

	public int removeFirst() {
		int data = head.data;
		head = head.link;
		return data;
	}

	public int removeLast() {
		Node pre, current;
		pre = head;
		current = head.link;
	
		while (current.link != null) {
			pre = current;
			current = current.link;
		}

		pre.link = null;
		return current.data;
	}

	@Override
	public String toString() {
		Node temp = head;
		String result = "";
		while(temp != null) {
			result += " " + temp.data;
			temp = temp.link;
		}
		return "List =" + result;
	}
}
