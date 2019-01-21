package hw4_2;

import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw4_2: 오일권");
		Scanner scan = new Scanner(System.in);
		
		int num;
		System.out.println("정수 갯수 입력: ");
		num = scan.nextInt();
		
		int[] array = new int[num];
		System.out.println(num + "개의 정수 입력: ");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		
		int max;
		max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max)
				max = array[i];
		}
		
		int maxIndex;
		maxIndex = maximumIndex(array);
		
		System.out.println("최대값 인덱스: " + maxIndex);
		System.out.println("최대값: " + max);
	}
	public static int maximumIndex(int indexArray[]) {
		int index = 0;
		int maximum = indexArray[0];
		for(int i = 0; i < indexArray.length; i++) {
			if(indexArray[i] > maximum) {
				//maximum = indexArray[i];
				index = i;
			}
		}
		
		return index;
	}
}
