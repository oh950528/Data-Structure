package hw8_1;

import java.util.Scanner;

public class MyCircularQueueTest {

	public static void main(String[] args) {
		System.out.println("hw8_1: ���ϱ�");

		MyCircularQueue queue = new MyCircularQueue(5);

		Scanner scan = new Scanner(System.in);

		int menu = 0;
		int item = 0;
		do {
			System.out.print("1:���� 2:���� 3:��ȸ 4:ũ�� 5:��ü���� 6:����--->");
			menu = scan.nextInt();

			switch(menu) {
			case 1:
				System.out.println("enQueue");
				System.out.print("�������Է�:");
				item = scan.nextInt();
				queue.enQueue(item);
				break;
			case 2:
				System.out.println("deQueue:" + queue.deQueue());
				break;
			case 3:
				System.out.println("peek:" + queue.peek());
				break;
			case 4:
				System.out.println("size=" + queue.size());
				break;
			case 5:
				System.out.print("deQueue��� ���:");
				while(!queue.isEmpty()) {
					System.out.print(queue.deQueue());
					if(!queue.isEmpty())
						System.out.print(",");
				}
				System.out.println();
				break;

			case 6:
				System.out.println("�����մϴ�");
				break;
				
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 6);

	}

}
