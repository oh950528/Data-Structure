package tutorials;

public class MyListTest {

	public static void main(String[] args) {
		System.out.println("mid : ���ϱ� ");

		// (1) ����ִ� ����Ʈ�� MyList ��ü�� ����
		MyList list = new MyList();

		// (2) 1���� 100���� ���ʴ�� ����Ʈ�� �� �տ� ����(addFirst ȣ��)
		for(int i = 1; i <= 100; i++ ) {
			list.addFirst(i);
		}

		// (3) ����Ʈ�� ���� ���� ���Ͽ�(getSum ȣ��) ���
		System.out.println("����Ʈ ���� �� = " + list.getSum());

	}
}

