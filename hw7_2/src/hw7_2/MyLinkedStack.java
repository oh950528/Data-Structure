package hw7_2;

import java.util.EmptyStackException;

public class MyLinkedStack {
	private class Node {
		int data;
		Node link;
		Node(int data) {
			this.data = data;
		}
	}

	private Node top;

	public boolean isEmpty() {
		return (top == null);
	}

	public void push(int item) {
		Node node = new Node(item);
		node.link = top;
		top = node;
	}

	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			int item = top.data;
			top = top.link;
			return item;
		}
	}

	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else
			return top.data;
	}

}
