package hw11_1;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		System.out.println("hw11_1 : 오일권");

		Scanner scan = new Scanner(System.in);
		System.out.print("정수 갯수 입력:");
		int n = scan.nextInt();

		int[] array = new int[n];
		System.out.print(n + "개의 정수 입력:");
		for(int i = 0; i < n; i++)
			array[i] = scan.nextInt();

		System.out.print("정렬 전 배열=");
		for(int i = 0; i < n; i++)
			System.out.print(array[i] + " ");
		System.out.println();

		MyIntegerSort.mergeSort(array);
		System.out.print("정렬 후 배열=");
		for(int i = 0; i < n; i++)
			System.out.print(array[i] + " ");
	}

}
