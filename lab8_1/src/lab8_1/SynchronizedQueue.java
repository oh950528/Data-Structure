/*
 * ���ϸ� : SynchronizedQueue.java
 * �ۼ���: 2018�� 11�� 1��
 * �ۼ���: ȫ�浿
 * ����: �迭�� ������ ����ȭ�� ���� ť
 */

package lab8_1;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedQueue {
	private final Lock lock = new ReentrantLock();
	private final Condition notFull  = lock.newCondition();
	private final Condition notEmpty = lock.newCondition();
	private int[] array;
	private int arraySize;
	private int front = 0;
	private int rear = 0;

	public SynchronizedQueue(int arraySize) {
		this.arraySize = arraySize;
		array = new int[arraySize];
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return (rear + 1) % arraySize == front;
	}

	public void enQueue(int item) throws InterruptedException {
		lock.lock();
		try {
			while (isFull()) {
				System.out.println(Thread.currentThread().getName() + ": ť�� �������� ��ٸ��ϴ�.");
				notFull.await();    
			}
			rear = (rear + 1) % arraySize;
			array[rear] = item;
			System.out.println(Thread.currentThread().getName() + ": ť ���� " + item);
			notEmpty.signal();
		} finally {
			lock.unlock();
		}
	}

	public int deQueue() throws InterruptedException {
		lock.lock();
		try {
			while (isEmpty()) {
				System.out.println("	" + Thread.currentThread().getName() + ": ť�� �� ��ٸ��ϴ�.");
				notEmpty.await();
			}
			front = (front + 1) % arraySize;
			int item = array[front];
			System.out.println("	" + Thread.currentThread().getName() + ": ť ���� " + item);
			notFull.signal();
			return item;
		} finally {
			lock.unlock();
		}
	}
}