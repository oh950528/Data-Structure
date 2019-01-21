package lab6_2;

import java.util.Scanner;


public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		System.out.println("lab6_2 : ���ϱ�");

		MyDoublyLinkedList list = new MyDoublyLinkedList();

		Scanner input = new Scanner(System.in);

		int menu = 0;
		int element = 0;
		do {
			System.out.print(" 1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:�Է°����� 8:�պ���� 9:����---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("list�� ��ü ������ ���");
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println("list�� ���̸� ���");
				System.out.println("list�� ����: " + list.size());
				break;
			case 3:
				System.out.println("list �� �տ� ����");
				System.out.print("������ �Է�: ");
				element = input.nextInt();
				list.addFirst(element);
				break;
			case 4:
				System.out.println("list �� �ڿ� ����");
				System.out.print("������ �Է�: ");
				element = input.nextInt();  
				list.addLast(element);
				break;
			case 5:
				System.out.println("list �� �տ��� �������� ����");
				System.out.println(list.removeFirst());
				break;

			case 6:
				System.out.println("list �� �ڿ��� �������� ����");
				System.out.println(list.removeLast());
				break;
				
			case 7:
				System.out.println("���ϴ� ������ ����");
				System.out.print("������ �Է�: ");
				element = input.nextInt();
				list.remove(element);
				break;
				
			case 8:
				System.out.println("����� ��ũ ���");
				list.printList();
				break;

			case 9:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
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

