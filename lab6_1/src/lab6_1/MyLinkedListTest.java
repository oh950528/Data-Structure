//***************************
// ���ϸ�: hw6_1.java
// �ۼ���: 201432025 ���ϱ�
// �ۼ���: 2018.10.01
// ����: �ܼ� ���Ḯ��Ʈ ������ �����Ѵ�.
//***************************

package lab6_1;

import java.util.Scanner;

public class MyLinkedListTest {

	public static void main(String[] args) {
		System.out.println("lab6_1: ���ϱ�");

		MyLinkedList list = new MyLinkedList();
		Scanner input = new Scanner(System.in);

		int menu = 0;
		int element = 0;
		do {
			System.out.print(" 1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���� ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("list�� ��ü ������ ���");
				System.out.println(list.toString());
				break;
			case 2:
				System.out.println("list�� ���̸� ���");
				System.out.println(list.size());   
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
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 7);
	}
}
