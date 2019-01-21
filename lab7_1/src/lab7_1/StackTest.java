package lab7_1;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		System.out.println("lab7_1: ���ϱ�");

		Stack<Integer> stack = new Stack<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		int number = 0;
		do {
			System.out.print(" 1:���� 2:���� 3:��ȸ 4:�հ� 5:����---> ");
			menu = scan.nextInt();

			switch(menu) {
			case 1:
				number = scan.nextInt();
				stack.push(number);
				break;
			case 2:
				System.out.println(stack.pop());
				break;
			case 3:
				System.out.println(stack.peek());
				break;
			case 4:
				int sum = 0;
				while(!stack.empty()) {
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