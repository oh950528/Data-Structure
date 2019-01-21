package tutorials;

/*
 * ���ϸ�: MyTreeMap.java
 * �ۼ���: 2018.11.20
 * �ۼ���: ���ϱ�
 * ����: <String, String> ���� �����ϴ� �����ϴ� ����Ž��Ʈ���� �����ڷᱸ���� ������ Ŭ����
 */

public class MyTreeMap {
	// Ʈ���� ��带 ǥ���ϴ� private Ŭ���� Node - �ʵ�(String�� key, String�� value, leftChild, rightChild), ������(key, value�� �Ű������� �޾� �ʱ�ȭ)
	private class Node {
		String key;
		String value;
		Node leftChild = null;
		Node rightChild = null;
		Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	// private �ν��Ͻ� ���� Ʈ���� ��Ʈ ��带 ��ų ����(root)�� �����ϰ� null�� �ʱ�ȭ
	private Node root = null;

	// Ʈ���� <key, value> ���� �����ϴ� �޼ҵ�
	public void put(String key, String value) {
		root = insertKey(root, key, value);
	}

	// (3) p�� ��Ʈ�� �ϴ� Ʈ���� <key, value> ���� ���� �� ��Ʈ�� �����ϴ� �޼ҵ�(recursive algorithm)
	private Node insertKey(Node p, String key, String value) {
		if(p == null) {  
			Node newNode = new Node(key, value);
			return newNode; 
		}
		else if(key.compareTo(p.key) < 0) {   // Ű ���� p�� Ű������ ���� ���
			p.leftChild = insertKey(p.leftChild, key, value);
			return p;  // ��Ʈ �Һ�
		}
		else if(key.compareTo(p.key) > 0) { // Ű ���� p�� Ű������ ū ���
			p.rightChild = insertKey(p.rightChild, key, value);
			return p;  // ��Ʈ �Һ�       
		}
		else {  // Ű ���� p�� Ű���� ���� ���, ���� ������ ���� �ʰ� ��� p�� value�� ���ο� ������ ����
			p.value = value;
			return p;   // ��Ʈ �Һ�
		}
	}  

	// (4) Ʈ������ Ű�� key�� ã�� �׿� �ش��ϴ� value�� �����ϴ� �޼ҵ�
	//     key ���� ã�� ���ϸ� null�� ������ ��
	//     ******* �ݵ�� iterative method�� �ۼ��� ��.  ��, recursive algorithm ������� �� ��
	public String get(String key) {
		Node temp = root;

		while(temp != null) {
			if(key.compareTo(temp.key) > 0) {
				temp = temp.rightChild;
			}
			else if(key.compareTo(temp.key) < 0) {
				temp = temp.leftChild;
			}
			else {
				return temp.value;
			}
		}		
		
		return null;
	}
}
