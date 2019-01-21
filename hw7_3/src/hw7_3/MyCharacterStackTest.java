package hw7_3;

import java.util.Scanner;

public class MyCharacterStackTest {

	public static void main(String[] args) {

		System.out.println("hw7_3: ���ϱ�");

		MyCharacterStack stack = new MyCharacterStack();
		Scanner scan = new Scanner(System.in);

		System.out.print("�����Է�:");
		String str = ""; 
		str = scan.nextLine();
		
		boolean yesOrNo  = false;

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			yesOrNo = true;

			switch (ch) {
			case '(':
				stack.push(ch);
				break;
			case '<':
				stack.push(ch);
			case ')':
				if(stack.isEmpty() || stack.peek() != '(') {
					yesOrNo = false;
					break;
				}
				else {
					stack.pop();
					break;
				}
			case '>':
				if(stack.isEmpty() || stack.peek() != '<') {
					yesOrNo = false;
					break;
				}
				else {
					stack.pop();
					break;
				}
			
			default:
				yesOrNo = true;
				break;
			}
		}
		
		
		if(stack.isEmpty() && yesOrNo == true) {
			System.out.println("�ùٸ� ��ȣ ���� �Դϴ�.");
		}
		else {
			System.out.println("�߸��� ��ȣ ���� �Դϴ�.");
		}
	}
}


