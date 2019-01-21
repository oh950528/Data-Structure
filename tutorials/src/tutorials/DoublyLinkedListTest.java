//package tutorials;
//
//class Node {
//	int data;  // ����Ʈ ���Ұ�
//	Node llink;  // ���� ��ũ
//	Node rlink;  // ������ ��ũ
//	Node(int data) {
//		this.data = data;
//		this.llink = null;
//		this.rlink = null;
//	}
//}
//
//public class DoublyLinkedListTest {
//
//	public static void main(String[] args) {
//		System.out.println("course5 : ���ϱ� ");
//
//		// ���� ����Ʈ list = (22, 33, 44, 55, 66) �� ���� ���� ����Ʈ�� ǥ��
//		Node n1 = new Node(22);
//		Node n2 = new Node(33);
//		Node n3 = new Node(44);
//		Node n4 = new Node(55);
//		Node n5 = new Node(66);
//		n1.rlink = n2;
//		n2.llink = n1;
//		n2.rlink = n3;
//		n3.llink = n2;
//		n3.rlink = n4;
//		n4.llink = n3;
//		n4.rlink = n5;
//		n5.llink = n4;
//		Node list = n1;
//		n1 = n2 = n3 = n4 = n5 = null;
//
//		// ����Ʈ�� �պ� ���
//		System.out.print("����Ʈ�� �ʱ� ����: ");
//		printList(list);
//
//		// (1) ����Ʈ�� ù��° ���Ҹ� ����
//		list = list.rlink;
//		list.llink = null;
//		
//		// ����Ʈ�� �պ� ���
//		System.out.print("ù��° ���� ���� ��: ");
//		printList(list);
//
//		// (2) ����Ʈ�� �� �տ� 11�� ����
//		Node node = new Node(11);
//		node.rlink = list;
//		list.llink = node;
//		list = node;
//
//
//		// ����Ʈ�� �պ� ���
//		System.out.print("�� �տ� 11 ���� ��: ");
//		printList(list);
//
//		System.out.println("======================"); // 1�ܰ�� ���������
//
//		// (3) ����Ʈ�� ������ ���Ҹ� ����
//		Node pre, current;
//		pre = list;
//		current = list.rlink;
//		
//		while(current.rlink != null) {
//			pre = current;
//			current = current.rlink;
//		}
//		pre.rlink = null;
//
//		// ����Ʈ�� �պ� ���
//		System.out.print("������ ���� ���� ��: ");
//		printList(list);
//
//		// (4) ����Ʈ�� �� �ڿ� 99�� ����
//		Node temp = new Node(99);
//		Node current2 = list;
//		while(current2.rlink != null) {
//			current2 = current2.rlink;
//		}
//		current2.rlink = temp;
//		temp.llink = current2;
//
//		// ����Ʈ�� �պ� ���
//		System.out.print("�� �ڿ� 99 ���� ��: ");
//		printList(list);
//
//		// (5) ��ü ���� ���� ���Ͽ� ���
//		int sum = 0;
//		Node p = list;
//		while(p != null) {
//			sum += p.data;
//			p = p.rlink;
//		}
//		System.out.println("�� = " + sum);
//
//		// ����Ʈ�� �պ� ���
//		System.out.print("��ü ���� �� ��� ��: ");
//		printList(list);
//	}
//
//	// list�� ����Ű�� ���� ���� ����Ʈ�� �պ��ϸ� ���ҵ��� ������, ������ ����ϴ� �޼ҵ�
//	private static void printList(Node list) {
//		if(list == null) {
//			System.out.println("( ) ( )");
//		}
//		else {
//			System.out.print("( ");
//			Node temp = list;
//			while(temp.rlink != null) {
//				System.out.print(temp.data + " ");
//				temp = temp.rlink;
//			}
//			System.out.print(temp.data + " ) ( ");
//			while(temp != null) {
//				System.out.print(temp.data + " ");
//				temp = temp.llink;
//			}
//		}
//		System.out.println(")");
//	}
//}
