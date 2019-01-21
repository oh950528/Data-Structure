package hw7_4;

import java.util.Scanner;
import java.util.Stack;

public class MyDoubleStack {

	public static void main(String[] args) {
		System.out.println("hw7_4: ���ϱ�");
		
		Stack<Double> stack = new Stack<Double>();
		
		String str ="";
		System.out.print("����ǥ����� �Է�:");
		Scanner scan = new Scanner(System.in);
		str = scan.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if(ch != '+' && ch != '-' && ch != '*' && ch != '/') {
				double value = ch - '0';
				stack.push(value);
			}
			else {
				double numb2 = stack.pop();
				double numb1 = stack.pop();
				
				switch(ch) {
				case '+':
					stack.push(numb1 + numb2);
					break;
				case '-':
					stack.push(numb1 - numb2);
					break;
				case '*':
					stack.push(numb1 * numb2);
					break;
				case '/':
					stack.push(numb1 / numb2);
					break;
				default:
					System.out.println("�߸��� �����Դϴ�.");
					break;
				}
			}
		}
		
		double result = stack.pop();
		if(!stack.isEmpty())
			System.out.println("�߸��� �����Դϴ�.");
		else
			System.out.println("����� = " + result);
	}

}
