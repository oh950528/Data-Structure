 //***************************
 // 파일명: hw7_1.java
 // 작성자: 오일권
 // 작성일: 2018-10-18
 // 설명:스택을 순차 자료구조로 구현한다.
 //***************************

package hw7_1;

import java.util.EmptyStackException;

public class MyArrayStack {
	
	private int top;
	private int stackSize;
	private int[] itemArray;
	
	public MyArrayStack() {
		top = -1;
		stackSize = 5;
		itemArray = new int[5];
	}
	
	public MyArrayStack(int size) {
		top = -1;
		stackSize = 5;
		itemArray = new int[size];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == stackSize-1);
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("isFull!!");
		}
		else
			itemArray[++top] = item;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else
			return itemArray[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		else
			return itemArray[top];
	}
}
