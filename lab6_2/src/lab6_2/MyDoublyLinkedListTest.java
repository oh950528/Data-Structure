package lab6_2;

import java.util.Scanner;


public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		System.out.println("lab6_2 : 오일권");

		MyDoublyLinkedList list = new MyDoublyLinkedList();

		Scanner input = new Scanner(System.in);

		int menu = 0;
		int element = 0;
		do {
			System.out.print(" 1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:입력값삭제 8:왕복출력 9:종료---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("list의 전체 내용을 출력");
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println("list의 길이를 출력");
				System.out.println("list의 길이: " + list.size());
				break;
			case 3:
				System.out.println("list 맨 앞에 삽입");
				System.out.print("정수값 입력: ");
				element = input.nextInt();
				list.addFirst(element);
				break;
			case 4:
				System.out.println("list 맨 뒤에 삽입");
				System.out.print("정수값 입력: ");
				element = input.nextInt();  
				list.addLast(element);
				break;
			case 5:
				System.out.println("list 맨 앞에서 정수값을 삭제");
				System.out.println(list.removeFirst());
				break;

			case 6:
				System.out.println("list 맨 뒤에서 정수값을 삭제");
				System.out.println(list.removeLast());
				break;
				
			case 7:
				System.out.println("원하는 정수값 삭제");
				System.out.print("정수값 입력: ");
				element = input.nextInt();
				list.remove(element);
				break;
				
			case 8:
				System.out.println("양방향 링크 출력");
				list.printList();
				break;

			case 9:
				System.out.println("종료합니다.");   
				break;
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 9);

		//		System.out.println(list.toString());
		//		
		//		list.addFirst(2);
		//		list.addFirst(-3);
		//		list.addFirst(0);
		//		
		//		System.out.println(list.toString());
		//		
		//		list.printList();

	}
}

