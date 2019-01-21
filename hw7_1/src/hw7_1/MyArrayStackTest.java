package hw7_1;

import java.util.Scanner;

public class MyArrayStackTest {

	public static void main(String[] args) {
		System.out.println("hw7_2: ���ϱ�");

		MyArrayStack stack = new MyArrayStack();

		Scanner scan = new Scanner(System.in);

		int menu = 0;
		int number = 0;
		do {
			System.out.print(" 1:���� 2:���� 3:��ȸ 4:�հ� 5:����---> ");
			menu = scan.nextInt();

			switch(menu) {
			case 1:
				System.out.print("�����Է�:");
				number = scan.nextInt();
				stack.push(number);
				break;
			case 2:
				System.out.println("������ ��: " + stack.pop());
				break;
			case 3:
				System.out.println("�� ���� ��: " + stack.peek());
				break;
			case 4:
				int sum = 0;
				while(!stack.isEmpty()) {
					sum += stack.pop();
				}
				System.out.println("�հ�:" + sum);
				break;
			case 5:
				System.out.println("�����մϴ�."); 
				break;

			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 5);
	}
}
