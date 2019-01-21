package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {
	private int front;
	private int rear;
	private int queueSize;
	private int count;
	private int[] itemArray;
	
	public MyCircularQueue(int queueSize) {
		front = 0;
		rear = 0;
		count = 0;
		this.queueSize = queueSize;
		itemArray = new int[queueSize];
	}
	
	public boolean isEmpty() {
		return (count == 0);
	}
	
	public boolean isFull() {
		return (count == queueSize);
	}
	
	public void enQueue(int item) {
		if(isFull()) 
			System.out.println("큐가 가득차서 삽입할 수 없습니다.");
		else {
			rear = (rear+1) % queueSize;
			itemArray[rear] = item;
			count++;
		}
	}
	
	public int deQueue() {
		if(isEmpty()) 
			throw new NoSuchElementException();
		else {
			front = (front+1) % queueSize;
			count--;
			return itemArray[front];
		}
	}
	
	public int peek() {
		if(isEmpty()) 
			throw new NoSuchElementException();
		else 
			return itemArray[(front+1) % queueSize];
	}
	
	public int size() {
		return count;
	}

}
