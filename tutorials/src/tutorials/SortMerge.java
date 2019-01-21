package tutorials;

/*
 * ���ϸ�: SortMerge.java
 * �ۼ���: 2018.12.11
 * �ۼ���: ���ϱ�
 * ����: �������İ� ������ �����ϰ� �̿��ϴ� ���α׷�
 */

import java.util.Arrays;
import java.util.Random;

public class SortMerge {

	public static void main(String[] args) {
		System.out.println("course13: ���ϱ�");
		Random generator = new Random();

		// array1, array2�� ���� ����(1~10)�� ���� ���Ұ�(0~99)���� �ʱ�ȭ
		int[] array1 = new int[generator.nextInt(10) + 1];
		for(int i = 0; i < array1.length; i++) {
			array1[i] = generator.nextInt(100);
		}
		int[] array2 = new int[generator.nextInt(10) + 1];
		for(int i = 0; i < array2.length; i++) {
			array2[i] = generator.nextInt(100);
		}

		// array1�� array2�� ����
		insertionSort(array1);     // (2) insertionSort ȣ��    
		insertionSort(array2);      
		System.out.println(" ���� ���:");
		System.out.println("array1 = " + Arrays.toString(array1));
		System.out.println("array2 = " + Arrays.toString(array2));

		// array1�� array2�� ������ ����� array3�� ���� ���
		int[] array3 = mergeArrays(array1, array2);  // (1) mergeArrays ȣ��
		System.out.println(" �� �迭�� ���� ���:");
		System.out.println("array3 = " + Arrays.toString(array3));
	}

	// (1) ���ĵ� �� �迭�� �����Ͽ� ���ο� �迭�� ��� �޼ҵ�
	private static int[] mergeArrays(int[] array1, int[] array2) {
		int a = 0, b = 0, c = 0;
		int[] array3 = new int[array1.length + array2.length];

		while(a < array1.length && b < array2.length) {
			if(array1[a] <= array2[b]) {
				array3[c] = array1[a];
				a++;
				c++;
			}
			else {
				array3[c] = array2[b];
				b++;
				c++;
			}
		}

		while(a < array1.length) {
			array3[c] = array1[a];
			a++;
			c++;
		}

		while(b < array2.length) {
			array3[c] = array2[b];
			b++;
			c++;
		}
		return array3; // �޼ҵ� �ϼ� �� ������ ��
	}

	// (2) ���� ���� �˰����� �̿��Ͽ� �迭�� ���ҵ��� ������������ �����ϴ� �޼ҵ� 
	private static void insertionSort(int[] array) {
		int i, j, item;

		for(i = 1; i < array.length; i++) {
			item = array[i];
			for(j = i; j > 0 && array[j-1] > item; j--) {
				array[j] = array[j-1];
			}
			array[j] = item;
		}
		//		Arrays.sort(array); �޼ҵ� �ϼ� �� ������ ��
	}
}
