package tutorials;

public class MyList {
	// �ܼ� ���Ḯ��Ʈ�� ���� ����Ʈ�� ������ Ŭ����

		// ����Ʈ ��� ������ ǥ���ϴ� Ŭ����
		private class Node {
			int data;
			Node link;
			Node(int data) {
				this.data = data;
			}
		}

		// ����Ʈ�� �� �� ���Ҹ� ����Ű�� �ν��Ͻ� ����
		private Node head = null;


		// (4) item�� ����Ʈ�� �� �տ� �����ϴ� �޼ҵ�
		public void addFirst(int item) {
			Node node = new Node(item);
			node.link = head;
			head = node;
		}

		// (5) ����Ʈ�� ���� ���� �����ϴ� �޼ҵ�(�� �޼ҵ� ���� ��¹� ����)
		public int getSum() {
			Node temp = head;
			int sum = 0;
			
			while(temp != null) {
				sum += temp.data;
				temp = temp.link;
			}
			
			return sum;
		}
	}
