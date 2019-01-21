package hw4_1;

import java.util.Scanner;

public class Subscription {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw4_1: 오일권");
		int[] money = {5000, 15000, 20000, 20000};
		
		Scanner scan = new Scanner(System.in);
		
		int grade;
		
		do {
			System.out.println("1~4 범위의 학년 입력:");
			grade = scan.nextInt();
		} while(grade<1 || grade>4);
		
		int result;
		double pay;
		
		if(grade==1) {
			System.out.println("1 + 1 =");
			result = scan.nextInt();
			if(result==2) {
				System.out.println("정답입니다.");
				pay = money[grade-1]*0.9;
				System.out.println("회비는 " + (int)pay + "원 입니다.");
			}
			else {
				System.out.println("틀렸습니다.");
				pay = money[grade-1];
				System.out.println("회비는 " + (int)pay + "원 입니다.");
			}
		}
		else if(grade==2) {
			System.out.println("5-3 =");
			result = scan.nextInt();
			if(result==2) {
				System.out.println("정답입니다.");
				pay = money[grade-1]*0.9;
				System.out.println("회비는 " + (int)pay + "원 입니다.");
				}
			else {
				System.out.println("틀렸습니다.");
				pay = money[grade-1];
				System.out.println("회비는 " + (int)pay + "원 입니다.");
				}
		}
		else if(grade==3) {
			System.out.println("19-16 =");
			result = scan.nextInt();
			if(result==3) {
				System.out.println("정답입니다.");
				pay = money[grade-1]*0.9;
				System.out.println("회비는 " + (int)pay + "원 입니다.");
				}
			else {
				System.out.println("틀렸습니다.");
				pay = money[grade-1];
				System.out.println("회비는 " + (int)pay + "원 입니다.");
				}
		}
		else if(grade==4) {
			System.out.println("4+4 =");
			result = scan.nextInt();
			if(result==8) {
				System.out.println("정답입니다.");
				pay = money[grade-1]*0.9;
				System.out.println("회비는 " + (int)pay + "원 입니다.");
				}
			else {
				System.out.println("틀렸습니다.");
				pay = money[grade-1];
				System.out.println("회비는 " + (int)pay + "원 입니다.");
				}
		}		
	}
}

