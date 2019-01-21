package lab6_2;
//***************************
// ���ϸ�: MyDoublyLinkedList.java
// �ۼ���: ���ϱ�
// �ۼ���: 2018-10-09
// ����: ���� ���Ḯ��Ʈ ������ �غ��Ѵ�
//***************************

public class MyDoublyLinkedList {
	private class Node {
		int data;
		Node llink, rlink;

		Node(int data) {
			this.data = data;
		}
	}

	private Node head;

	public int size() {
		Node node = head;
		int count = 0;
		while (node != null) {
			node = node.rlink;
			count++;
		};
		return count;
	}

	public void addFirst(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		}
		else {
			node.rlink = head;
			head.llink = node;
			head = node;
		}
	}

	public void addLast(int data) {
		Node node = new Node(data);

		if(head == null) {
			head = node;
		}

		else {
			Node current = head;
			while (current.rlink != null) {
				current = current.rlink;
			}
			current.rlink = node;
			node.llink = current;
		}
	}

	public int removeFirst() {
		int data = head.data;
		head = head.rlink;
		return data;
	}

	public int removeLast() {
		Node pre, current;
		pre = head;
		current = head.rlink;

		while (current.rlink != null) {
			pre = current;
			current = current.rlink;
		}
		pre.rlink = null;

		return current.data;
	}

	public boolean remove(int element) {
		
		if(head == null) {
			System.out.println("�� ����Ʈ�Դϴ�.");
			return false;
		}
		
		else if(head.data == element) {
			head = head.rlink;
			System.out.println("��������");
			return true;
		}
		
		else {
			Node pre, current;
			pre = null;
			current = head;
			while(current != null) {
				if(current.rlink == null) {
					if(current.data == element) {
						System.out.println("��������");
						pre.rlink = null;
						break;
					}
					
					else {
						System.out.println("��������");
						return false;
					}
				}
				
				else if(current.data == element) {
					pre.rlink = current.rlink;
					current.rlink.llink = pre;
					System.out.println("��������");
					break;
				}
				
				pre = current;
				current = current.rlink;
			}
			
			return true;
		}
	}

	public void printList() {
		if(head == null) {
			System.out.println("()()");
		}
		else {
			System.out.print("(");
			Node temp = head;

			while(temp.rlink != null) {
				System.out.print(" " + temp.data);
				temp = temp.rlink;
			}
			System.out.print(" " + temp.data);
			System.out.print(" )");

			System.out.print("(");
			while(temp != null) {
				System.out.print(" " + temp.data);
				temp = temp.llink;
			}
			System.out.print(" )");
			System.out.println();
		}
	}

	@Override
	public String toString() {
		Node temp = head;
		String result = "";
		while(temp != null) {
			result += " " + temp.data;
			temp = temp.rlink;
		}

		return "List =" + result;
	}
}
