package lab9_1;

//���� �����͸� �����ϱ� ���� �����ڷᱸ���� ������ ���� Ʈ�� Ŭ����
public class MyLinkedTree {
	// Ʈ�� ��� Ŭ���� -- data, leftChild, rightChild �ʵ带 ����
	private class Node {
		int data;
		Node leftChild;
		Node rightChild;
	}

	// Ʈ���� ��Ʈ ��带 ����Ű�� �ν��Ͻ� ���� root
	private Node root;

	// ���� Ʈ���� �ʱ�ȭ �ϴ� ������
	public MyLinkedTree() {
		root = null;
	}


	// ��Ʈ ����� �����Ͱ� data�̰�, leftSubtree, rightSubtree�� �¿� ����Ʈ���� �ϵ��� Ʈ���� �ʱ�ȭ �ϴ� ������
	public MyLinkedTree(int data, MyLinkedTree leftSubtree, MyLinkedTree rightSubtree)  {
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

	// Ʈ�� ��ü�� ���� ��ȸ�ϸ� ����� �����͸� ���
	public void printPreorder()  {   
		preorder(root);
		System.out.println();
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϴ� �޼ҵ�
	private void preorder(Node p)  { 
		if(p != null) {
			System.out.print(p.data + " ");
			preorder(p.leftChild);
			preorder(p.rightChild);
		}
	}  

	// Ʈ�� ��ü�� ���� ��ȸ�ϸ� ����� �����͸� ���
	public void printInorder()  {  
		inorder(root);
		System.out.println();
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϴ� �޼ҵ�
	private void inorder(Node p)  { 
		if(p != null) {
			inorder(p.leftChild);
			System.out.print(p.data + " ");
			inorder(p.rightChild);
		}
	}  

	// ��Ʈ������ ������忡 �̸������ ���� �ڽĵ��� ����ϴ� �޼ҵ�(��� �޼ҵ� �ƴ�. �ݺ��� �̿��� ��)
	public void printLeft() {
		Node temp = root;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.leftChild;
		}
		System.out.println();
	}
}
