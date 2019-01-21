package hw9_1;

/*
 * ���ϸ�: MyBinaryTreeTest.java
 * �ۼ���: 2018.11.13
 * �ۼ���: ���ϱ�
 * ����: int�� Ű���� �����ϴ� ����Ž��Ʈ���� �����ϰ� ������ �����ϴ� ���α׷�
 */

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MyBinarySearchTreeTest {
	public static void main(String[] args) {
		System.out.println("hw9_1 : ���ϱ�");

		// ���� ����Ž��Ʈ�� tree�� ����
		MyBinarySearchTree tree = new MyBinarySearchTree();

		Scanner scan = new Scanner(System.in);
		System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
		int menu = 0;
		int item = 0;

		// ���Ḧ ������ ������ �ݺ��Ͽ� �޴��� �����ϰ� �׿� �´� ����Ž��Ʈ�� ������ ����
		do {
			System.out.print("1:��ͻ��� 2:������ȸ 3:�ִ밪 4:�˻� 5:���� 6:���� 7:���� --->");

			//   System.out.print("1:��ͻ���  2:������ȸ  3:�ִ밪  4:�˻�  5:����  6:����  7:���� --->");  // ���ʽ� ������ ������ ��� �̿��ϼ���.

			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.println("��� �˰����� �̿��� ������ �����մϴ�.");
				System.out.print("������ ���� �Է�:");  
				item = scan.nextInt(); 
				tree.insert(item);
				break;    
			case 2:
				System.out.println("������ȸ ����� �����մϴ�.");
				tree.printInorder();  
				break;
			case 3:
				System.out.println("�ִ밪 ��ȸ�� �����մϴ�.");
				try {
					System.out.println(tree.max());   
				} catch(NoSuchElementException e) {
					System.out.println("�ִ밪 ��ȸ ����");
				}
				break;
			case 4:
				System.out.println("�˻��� �����մϴ�.");
				System.out.print("�˻��� ���� �Է�:");
				item = scan.nextInt();
				if(tree.contains(item))    
					System.out.println("�˻� ����");
				else
					System.out.println("�˻� ����");
				break;
			case 5:
				System.out.println("�ݺ� �˰����� �̿��� ������ �����մϴ�.");
				System.out.print("������ ���� �Է�:");
				item = scan.nextInt();
				if(tree.add(item))    
					System.out.println("���� ����");  
				else
					System.out.println("���� ����");
				break;
			case 6:
				System.out.println("������ �����մϴ�.");
				System.out.print("������ ���� �Է�:");
				item = scan.nextInt();
				if(tree.remove(item))    
					System.out.println("���� ����");
				else
					System.out.println("���� ����");
				break;
			case 7:
				System.out.println("�����մϴ�.");
				break;
			default:
				System.out.println("�޴� ��ȣ ����: �޴��� �ٽ� �����ϼ���.");
			}
		} while(menu != 7);
	}
}