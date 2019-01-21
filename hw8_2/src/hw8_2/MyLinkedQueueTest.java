package hw8_2;

import java.util.Scanner;

public class MyLinkedQueueTest {

	public static void main(String[] args) {
		System.out.println("hw8_2: 오일권");

		MyLinkedQueue queue = new MyLinkedQueue();

		Scanner scan = new Scanner(System.in);

		int menu = 0;
		int item = 0;
		do {
			System.out.print("1:삽입 2:삭제 3:조회 4:크기 5:전체삭제 6:종료--->");
			menu = scan.nextInt();

			switch(menu) {
			case 1:
				System.out.println("enQueue");
				System.out.print("정수값입력:");
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
				System.out.print("deQueue모두 출력:");
				while(!queue.isEmpty()) {
					System.out.print(queue.deQueue());
					if(!queue.isEmpty())
						System.out.print(",");
				}
				System.out.println();
				break;

			case 6:
				System.out.println("종료합니다");
				break;
				
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 6);

	}

}