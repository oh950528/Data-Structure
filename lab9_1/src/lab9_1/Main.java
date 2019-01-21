package lab9_1;

public class Main {

	public static void main(String[] args) {
		System.out.println("lab9_1: ���ϱ�");

		// �����ڷᱸ���� ������ ��� 7�� ���� Ʈ���� ����� �޼ҵ� ȣ��
		System.out.println(" �����ڷᱸ�� ���� Ʈ��1");
		MyLinkedTree tree7 = new  MyLinkedTree(7, null, null);
		MyLinkedTree tree6 = new  MyLinkedTree(6, null, null);
		MyLinkedTree tree5 = new  MyLinkedTree(5, null, null);
		MyLinkedTree tree4 = new  MyLinkedTree(4, null, null);
		MyLinkedTree tree3 = new  MyLinkedTree(3, tree6, tree7);
		MyLinkedTree tree2 = new  MyLinkedTree(2, tree4, tree5);
		MyLinkedTree linkedTree1 = new  MyLinkedTree(1, tree2, tree3);

		System.out.print("preorder:");
		linkedTree1.printPreorder(); // ������ȸ�ϸ� ���
		System.out.print("inorder:");
		linkedTree1.printInorder();  // ������ȸ�ϸ� ���
		System.out.print("left:");
		linkedTree1.printLeft(); // ���� �ڽĵ��� ���

		// �����ڷᱸ���� ������ ���� ���� Ʈ���� ����� �޼ҵ� ȣ��
		System.out.println(" �����ڷᱸ�� ���� Ʈ��2");
		MyLinkedTree linkedTree2 = new  MyLinkedTree();

		System.out.print("preorder:");
		linkedTree2.printPreorder(); // ������ȸ�ϸ� ���
		System.out.print("inorder:");
		linkedTree2.printInorder();  // ������ȸ�ϸ� ���
		System.out.print("left:");
		linkedTree2.printLeft(); // ���� �ڽĵ��� ���

		// �迭�� ������ ��� 8�� ���� Ʈ���� ����� �޼ҵ� ȣ��
		System.out.println(" �迭 ���� Ʈ��1");
		MyArrayTree arrayTree1 = new MyArrayTree(new int[] {1, 2, 3, 4, 5, 6, 7, 8});
		System.out.print("preorder:");
		arrayTree1.printPreorder(); // ������ȸ�ϸ� ���
		System.out.print("inorder:");
		arrayTree1.printInorder(); // ������ȸ�ϸ� ���
		System.out.print("left:");
		arrayTree1.printLeft();  // ���� �ڽĵ��� ���

		// �迭�� ������ ���� ���� Ʈ���� ����� �޼ҵ� ȣ��
		System.out.println(" �迭 ���� Ʈ��2");
		MyArrayTree arrayTree2 = new MyArrayTree();
		System.out.print("preorder:");
		arrayTree2.printPreorder(); // ������ȸ�ϸ� ���
		System.out.print("inorder:");
		arrayTree2.printInorder(); // ������ȸ�ϸ� ���
		System.out.print("left:");
		arrayTree2.printLeft();  // ���� �ڽĵ��� ���
	}
}
