package hw4_1;

import java.util.Scanner;

public class Subscription {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw4_1: ���ϱ�");
		int[] money = {5000, 15000, 20000, 20000};
		
		Scanner scan = new Scanner(System.in);
		
		int grade;
		
		do {
			System.out.println("1~4 ������ �г� �Է�:");
			grade = scan.nextInt();
		} while(grade<1 || grade>4);
		
		int result;
		double pay;
		
		if(grade==1) {
			System.out.println("1 + 1 =");
			result = scan.nextInt();
			if(result==2) {
				System.out.println("�����Դϴ�.");
				pay = money[grade-1]*0.9;
				System.out.println("ȸ��� " + (int)pay + "�� �Դϴ�.");
			}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				pay = money[grade-1];
				System.out.println("ȸ��� " + (int)pay + "�� �Դϴ�.");
			}
		}
		else if(grade==2) {
			System.out.println("5-3 =");
			result = scan.nextInt();
			if(result==2) {
				System.out.println("�����Դϴ�.");
				pay = money[grade-1]*0.9;
				System.out.println("ȸ��� " + (int)pay + "�� �Դϴ�.");
				}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				pay = money[grade-1];
				System.out.println("ȸ��� " + (int)pay + "�� �Դϴ�.");
				}
		}
		else if(grade==3) {
			System.out.println("19-16 =");
			result = scan.nextInt();
			if(result==3) {
				System.out.println("�����Դϴ�.");
				pay = money[grade-1]*0.9;
				System.out.println("ȸ��� " + (int)pay + "�� �Դϴ�.");
				}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				pay = money[grade-1];
				System.out.println("ȸ��� " + (int)pay + "�� �Դϴ�.");
				}
		}
		else if(grade==4) {
			System.out.println("4+4 =");
			result = scan.nextInt();
			if(result==8) {
				System.out.println("�����Դϴ�.");
				pay = money[grade-1]*0.9;
				System.out.println("ȸ��� " + (int)pay + "�� �Դϴ�.");
				}
			else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
				pay = money[grade-1];
				System.out.println("ȸ��� " + (int)pay + "�� �Դϴ�.");
				}
		}		
	}
}

