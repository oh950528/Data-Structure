package hw9_1;

/*
 * ���ϸ�: MyBinarySearchTree.java
 * �ۼ���: 2018.11.13
 * �ۼ���: ���ϱ�
 * ����: int�� Ű�� �����ϴ� ����Ž��Ʈ���� �����ڷᱸ���� ������ Ŭ����
 */

import java.util.NoSuchElementException;

public class MyBinarySearchTree {
	// (1) Ʈ���� ��带 ǥ���ϴ� private Ŭ���� Node - �ʵ�(int�� key, leftChild, rightChild),
	// ������(key���� �Ű������� �޾� �ʱ�ȭ)
	private class Node {
		int key;
		Node leftChild;
		Node rightChild;

		Node(int key) {
			this.key = key;
		}
	}

	// (2) private �ν��Ͻ� ���� Ʈ���� ��Ʈ ��带 ��ų ����(root)�� �����ϰ� null�� �ʱ�ȭ
	private Node root = null;

	// Ʈ���� Ű�� key�� �����ϴ� �޼ҵ�
	public void insert(int key) {
		root = insertKey(root, key);
	}

	// p�� ��Ʈ�� �ϴ� Ʈ���� Ű�� key�� �����ϰ�, ���� �� ��Ʈ�� �����ϴ� �޼ҵ�(��� �˰���)
	private Node insertKey(Node p, int key) {
		if (p == null) {
			Node newNode = new Node(key);
			return newNode;
		} else if (key < p.key) {
			p.leftChild = insertKey(p.leftChild, key);
			return p; // ��Ʈ �Һ�
		} else if (key > p.key) {
			p.rightChild = insertKey(p.rightChild, key);
			return p; // ��Ʈ �Һ�
		} else { // key = p.key �� ��� ���� ����
			System.out.println("���� ����. �ߺ��� Ű���� �����մϴ�: " + key);
			return p; // ��Ʈ �Һ�
		}
	}

	// Ʈ���� ������ȸ�ϸ� ����ϴ� �޼ҵ�
	public void printInorder() {
		inorder(root);
		System.out.println();
	}

	// (3) p�� ��Ʈ�� �ϴ� Ʈ���� ���� ��ȸ�ϸ� Ű���� ����ϴ� �޼ҵ�(��� �˰���)
	private void inorder(Node p) {
		if (p != null) {
			inorder(p.leftChild);
			System.out.print(p.key + " ");
			inorder(p.rightChild);
		}
	}

	// (4) Ʈ���� �ִ� Ű���� �����ϴ� �޼ҵ�(�ݺ� �˰���) - ���� Ʈ���� ��� NoSuchElementException ���� �߻�
	public int max() {
		if (root == null) {
			throw new NoSuchElementException();
		}

		else {
			Node temp = root;
			while (temp.rightChild != null) {
				temp = temp.rightChild;
			}
			return temp.key;
		}
	}

	// Ʈ���� Ű�� key�� �����ϴ��� ���θ� �����ϴ� �޼ҵ�
	public boolean contains(int key) {
		return search(root, key);
	}

	// (5) p�� ��Ʈ�� �ϴ� Ʈ���� Ű�� key�� �����ϴ��� ���θ� �����ϴ� �޼ҵ�(��� �˰���)
	private boolean search(Node p, int key) {
		if(p == null)
			return false;
		if(p.key == key) 
			return true;
		else if(key < p.key)
			return search(p.leftChild, key);
		else
			return search(p.rightChild, key);
	}

	// (6) Ʈ���� Ű�� key�� �����ϴ� �޼ҵ�(�ݺ� �˰���) - ���� ��������(true/false)�� ����
	public boolean add(int key) {
		Node node = new Node(key);
		Node p = root;

		while (true) {
			if (root == null) {
				root = node;
				return true;
			}

			else if (key < p.key) {
				if (p.leftChild == null) {
					p.leftChild = node;
					return true;
				} else
					p = p.leftChild;
			}

			else if (key > p.key) {
				if (p.rightChild == null) {
					p.rightChild = node;
					return true;
				} else
					p = p.rightChild;
			}

			else
				return false;
		}
	}

	public boolean remove(int key) {
		Node temp = root;
		Node parent = null;
		
		if(root == null)
			return false;

		while(temp.key != key) {
			if(temp.key > key) {
				if(temp.leftChild != null) {
					parent = temp;
					temp = temp.leftChild;
				}
				else {
					parent = temp;
					temp = null;
				}
			}

			else {
				if(temp.rightChild != null) {
					parent = temp;
					temp = temp.rightChild;
				}
				else {
					parent = temp;
					temp = null;
				}
			}

			if(temp == null) {
				return false;
			}
		}
		

		if(temp.leftChild == null && temp.rightChild == null) {
			if(parent == null) 
				root = null;
			else if(parent.leftChild == temp)
				parent.leftChild = null;
			else
				parent.rightChild = null;
		}

		else if(temp.leftChild == null || temp.rightChild == null) {
			if(temp.leftChild != null) {
				if(parent == null)
					root = temp.leftChild;
				else if(parent.leftChild == temp) 
					parent.leftChild = temp.leftChild;
				else
					parent.rightChild = temp.leftChild;
			}

			else {
				if(parent == null)
					root = temp.rightChild;
				else if(parent.leftChild == temp)
					parent.leftChild = temp.rightChild;
				else
					parent.rightChild = temp.rightChild;
			}
		}

		else {
			Node q = temp.leftChild;
			while(q.rightChild != null) {
				q = q.rightChild;
			}

			temp.key = q.key;
			remove(q.key);
		}
		return true;
	}
}