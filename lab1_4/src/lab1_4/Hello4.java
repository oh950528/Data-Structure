 //***************************
 // 파일명: Hello3.java
 // 작성자: 201432025 오일권
 // 작성일: 2018. 08. 31
 // 설명: 정수 배열 원소의 평균
 //***************************

package lab1_4;

import java.util.Scanner;

public class Hello4 {
	
    static double getAverage(int[] numArray) {
    	int sum = 0;
    	for(int i = 0; i < numArray.length; i++) {
    		sum += numArray[i];  
    	}
    	return (sum/(double)numArray.length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("lab1_4: 오일권");
		System.out.print("정수 개수 입력: ");
		int inputedNum = scan.nextInt();
		
		System.out.print(inputedNum + "개의 정수 입력: ");
		int[] array = new int[inputedNum];
		
		for(int i = 0; i < inputedNum; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("평균 = " + getAverage(array));	
	}
}
