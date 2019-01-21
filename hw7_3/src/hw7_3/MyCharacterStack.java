package hw7_3;

import java.util.EmptyStackException;

public class MyCharacterStack {
	private class Node {
		char data;
		Node link;
		Node(char data) {
			this.data = data;
		}
	}
	
	private Node top;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(char item) {
		Node node = new Node(item);
		node.link = top;
		top = node;
	}
	
	public char pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else {
			char item = top.data;
			top = top.link;
			return item;
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else
			return top.data;
	}
}
