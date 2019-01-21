package hw8_2;

import java.util.NoSuchElementException;

public class MyLinkedQueue {
	private class Node {
		int data;
		Node link;
		Node(int data) {
			this.data = data;
		}
	}
	
	private Node front;
	private Node rear;
	private int count;
	
	public boolean isEmpty() {
		return (front == null);
	}
	
	public void enQueue(int item) {
		Node node = new Node(item);
		node.link = null;
		if(isEmpty()) {
			front = node;
			rear = node;
			count++;
		}
		else {
			rear.link = node;
			rear = node;
			count++;
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		else {
			int item = front.data;
			front = front.link;
			count--;
			return item;
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		else {
			return front.data;
		}
	}
	
	public int size() {
		return count;
	}
}
