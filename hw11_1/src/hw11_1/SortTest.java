package hw11_1;

import java.util.Scanner;

public class SortTest {

	public static void main(String[] args) {
		System.out.println("hw11_1 : ���ϱ�");

		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���� �Է�:");
		int n = scan.nextInt();

		int[] array = new int[n];
		System.out.print(n + "���� ���� �Է�:");
		for(int i = 0; i < n; i++)
			array[i] = scan.nextInt();

		System.out.print("���� �� �迭=");
		for(int i = 0; i < n; i++)
			System.out.print(array[i] + " ");
		System.out.println();

		MyIntegerSort.mergeSort(array);
		System.out.print("���� �� �迭=");
		for(int i = 0; i < n; i++)
			System.out.print(array[i] + " ");
	}

}
