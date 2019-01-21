package tutorials;

public class MyTreeMap2 {
	// Ʈ���� ��带 ǥ���ϴ� private Ŭ���� Node
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


	// Ű�� key�� �ش��ϴ� value�� �����ϰ�, key ���� ã�� ���ϸ� null�� �����ϴ� �޼ҵ�(�ݺ� �˰���)
	//	public String get(String key) {
	//		Node p = root;
	//		while(p != null) {
	//			if(key.compareTo(p.key) < 0)
	//				p = p.leftChild;
	//			else if(key.compareTo(p.key) > 0)
	//				p = p.rightChild;
	//			else
	//				return p.value;
	//		}
	//		return null;
	//	}

	// (1) ���� get �޼ҵ� ���, ��� �˰����� �̿��� get �޼ҵ带 �ۼ��Ͻÿ�.(���� get �޼ҵ�� ������ ��)
	public String get(String key) {
		return getValue(root, key);
	}

	public String getValue(Node p, String key) {
		if(p == null)
			return null;
		else if(key.compareTo(p.key) < 0)
			return getValue(p.leftChild, key);
		else if(key.compareTo(p.key) > 0)
			return getValue(p.rightChild, key);
		else
			return p.value;
	}

	// Ʈ����  key-value ���� �����ϴ� �޼ҵ�
//	public void put(String key, String value) {
//		root = insertKey(root, key, value);
//	}
//
//	// p�� ��Ʈ�� �ϴ� Ʈ���� key-value ���� ���� �� ��Ʈ�� �����ϴ� �޼ҵ�(��� �˰���)
//	private Node insertKey(Node p, String key, String value) {
//		if(p == null) {  
//			Node newNode = new Node(key, value);
//			return newNode; 
//		}
//		else if(key.compareTo(p.key) < 0) {   // Ű ���� p�� Ű������ ���� ���
//			p.leftChild = insertKey(p.leftChild, key, value);
//			return p;  // ��Ʈ �Һ�
//		}
//		else if(key.compareTo(p.key) > 0) { // Ű ���� p�� Ű������ ū ���
//			p.rightChild = insertKey(p.rightChild, key, value);
//			return p;  // ��Ʈ �Һ�       
//		}
//		else {  // Ű ���� p�� Ű���� ���� ���, ���� ������ ���� ���� ��� p�� value�� ���ο� ������ ����
//			p.value = value;
//			return p;   // ��Ʈ �Һ�
//		}
//	}  

	// (2) (�ɼ�) ���� �� �޼ҵ� put, insertKey ���, �ݺ� �˰����� �̿��� put �޼ҵ带 �ۼ��Ͻÿ�.(���� put, insertKey �޼ҵ�� ������ ��)

	public void put(String key, String value) {
		Node p = root;
		Node r = null;

		while(p != null) {
			if(key.compareTo(p.key) == 0) {
				p.value = value;
				break;
			}

			r = p;
			if(key.compareTo(p.key) < 0)
				p = p.leftChild;
			else
				p = p.rightChild;
		}

		Node node = new Node(key, value);
		if(root == null)
			root = node;
		else if(p == null) {
			if(key.compareTo(r.key) < 0)
				r.leftChild = node;
			else
				r.rightChild = node;
		}
	}
}
