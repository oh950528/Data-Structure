package tutorials;

import java.util.NoSuchElementException;

public class MyTree {
	// Ʈ�� ��� Ŭ����
	private class Node {
		int data;
		Node leftChild;
		Node rightChild;
	}

	// Ʈ���� ��Ʈ ��带 ����Ű�� �ν��Ͻ� ���� root
	Node root = null;

	// ���� Ʈ���� �ʱ�ȭ �ϴ� ������
	public MyTree() {
		root = null;
	}

	// ��Ʈ ����� �����Ͱ� data�̰�, leftSubtree, rightSubtree�� �¿� ����Ʈ���� �ϵ��� Ʈ���� �ʱ�ȭ �ϴ� ������
	public MyTree(int data, MyTree leftSubtree, MyTree rightSubtree)  {
		root = new Node();           
		root.data = data;

		if (leftSubtree == null)   
			root.leftChild = null;           
		else   
			root.leftChild = leftSubtree.root;

		if (rightSubtree == null)   
			root.rightChild = null;           
		else  
			root.rightChild = rightSubtree.root;
	}

	// ��� ������ �����ϴ� �޼ҵ�
	public int size() {
		return count(root);
	}

	// (1) p�� ��Ʈ�� �ϴ� Ʈ���� ��� ������ �����ϴ� �޼ҵ� **** ��� �˰������� �ۼ��� ��
	private int count(Node p) {
		if(p == null) {
			return 0;
		}
		else {
			return count(p.leftChild) + count(p.rightChild) + 1;
		}
	}

	// (2) ���� ���� ������ �ڽ��� ���� �����ϴ� �޼ҵ� **** �ݺ� �˰������� �ۼ��� ��
	public int getRight() {
		Node temp = root;
		// ���� Ʈ���� ��� ���� �߻�
		if(root == null)
			throw new NoSuchElementException();
		else {
			while(temp.rightChild != null) {
				temp = temp.rightChild;
			}
		}

		return temp.data; // ���α׷� �ϼ� ���� ���α׷��� ������ �� �� �ֵ��� �ӽ÷� �߰��� �����̹Ƿ� ���߿� �����ϸ� ��
	}
}