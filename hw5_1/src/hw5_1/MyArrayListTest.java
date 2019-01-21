

//***************************
// ���ϸ�: MyArrayListTest.java
// �ۼ���: 201432025 ���ϱ�
// �ۼ���: 2019 09 15
// ����:  ���� ����Ʈ�� �����ϴ� MyArrayList Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷�
//**************************

package hw5_1;

import java.util.Scanner;

public class MyArrayListTest {
	public static void main(String[] args) {
		System.out.println("hw5_1: ���ϱ�");

		Scanner input = new Scanner(System.in);

		// (1) Integer�� Ÿ�� �Ű������� �Ͽ� ArrayList ��ü�� ����(list��� �̸��� ������ ����)

//		MyArrayList<String> list = new MyArrayList<String>(); // �ϼ��ϼ���.
		MyArrayList<Integer> list = new MyArrayList<Integer>(); // �ϼ��ϼ���.
		
		// (2) ����ڿ��� �޴��� �ݺ� �����ϰ� 7�� �Է��ϸ� �ݺ� ����
		int menu = 0;
		int index = 0;
		int element = 0;
//		String element = "";
		do {
			System.out.print(" 1:�ε�����ȸ 2:��ü��ȸ 3:������ȸ 4:���� 5:�ε������� 6:�ε������� 7:���� ---> ");
			menu = input.nextInt();

			switch(menu) {
			case 1:
				System.out.println("�ε��� ��ġ�� ���Ұ��� ��ȸ�մϴ�.");
				System.out.print("�ε��� �Է�: ");
				index = input.nextInt();
				element = list.get(index); // �ϼ��ϼ���.
				System.out.println(element);  
				break;
			case 2:
				System.out.println("����Ʈ ��ü�� ��ȸ�մϴ�.");
				System.out.println(list.toString());   // �ϼ��ϼ���.
				break;
			case 3:
				System.out.println("����Ʈ ���̸� ��ȸ�մϴ�.");
				int size = list.size();  // �ϼ��ϼ���.
				System.out.println(size);
				break;
			case 4:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڿ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();  
//				element = input.next();  
				
				list.add(element);  // �ϼ��ϼ���.
				break;
			case 5:
				System.out.println("�ε��� ��ġ�� ���Ҹ� �����մϴ�.");
				System.out.print("�ε��� �Է�: ");
				index = input.nextInt();    
				System.out.print("������ �Է�: ");
				element = input.nextInt();
//				element = input.next(); 
				list.add(index, element); // �ϼ��ϼ���.
				break;
	
			case 6:
				System.out.println("�ε��� ��ġ�� ���Ҹ� �����մϴ�.");
				System.out.print("�ε��� �Է�: ");
				index = input.nextInt(); 
				element = list.remove(index);  // �ϼ��ϼ���.
				System.out.println(element);
				break;
			
			case 7:
				System.out.println("�����մϴ�.");   
				break;
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");
			}
		} while(menu != 7);
	}
}