package lab1_2;

import java.util.Scanner;

public class Hello2 {

	public static void main(String[] args) {
		System.out.println("lab1_2:오일권");
		System.out.print("정수를 입력하시오: ");

		int array[] = new int[10];
		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		int value = -1;
		System.out.print("검색할 정수값 입력: ");
		value = scan.nextInt();
		
		int index = -1;
		boolean okay = false;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				index = i;
				okay = true;
				System.out.println("인덱스 = "+ index);
				break;
			}
		}
		
		if(!okay) {
			value = -1;
			System.out.println("잘못입력하셨습니다." + value);
		}
	}
}