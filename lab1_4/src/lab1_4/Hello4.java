 //***************************
 // ���ϸ�: Hello3.java
 // �ۼ���: 201432025 ���ϱ�
 // �ۼ���: 2018. 08. 31
 // ����: ���� �迭 ������ ���
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
		System.out.println("lab1_4: ���ϱ�");
		System.out.print("���� ���� �Է�: ");
		int inputedNum = scan.nextInt();
		
		System.out.print(inputedNum + "���� ���� �Է�: ");
		int[] array = new int[inputedNum];
		
		for(int i = 0; i < inputedNum; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("��� = " + getAverage(array));	
	}
}
