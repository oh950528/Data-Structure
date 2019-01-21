package lab7_1;

import java.util.Scanner;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		System.out.println("lab7_1: 오일권");

		Stack<Integer> stack = new Stack<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		int number = 0;
		do {
			System.out.print(" 1:삽입 2:삭제 3:조회 4:합계 5:종료---> ");
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
				System.out.println("합계:" + sum);
				break;
			case 5:
				System.out.println("종료합니다.");
				break;

			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");
			}
		} while(menu != 5);
	}
}