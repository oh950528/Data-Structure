package tutorials;

//MyArrayQueue Ŭ������ �׽�Ʈ�ϴ� Ŭ����
public class MyArrayQueueTest {
	public static void main(String[] args) {
		System.out.println("course7: ���ϱ�");

		// MyArrayQueue ��ü�� �����ϰ�, ����, ���� ������ ����
		MyArrayQueue queue = new MyArrayQueue();

		queue.enQueue(1);
		queue.enQueue(2);

		System.out.println(queue.deQueue()); // ���: 1
		System.out.println(queue.deQueue()); // ���: 2

		queue.enQueue(3);
		queue.enQueue(4);

		System.out.println(queue.deQueue()); // ���: 3
		System.out.println(queue.deQueue()); // ���: 4

		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(8);
		queue.enQueue(9); // ���� �����Ͽ� ���� �޽��� ����� ����
		queue.enQueue(10); // ���� �����Ͽ� ���� �޽��� ����� ����

		while(!queue.isEmpty())
			System.out.print(queue.deQueue() + " "); // ���: 5 6 7 8
		System.out.println();

		System.out.println(queue.deQueue()); // ���� �����Ͽ� ���ܹ߻��� ����

		System.out.println("�������� ���� ������");
	}
}
