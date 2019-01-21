package tutorials;

public class MyListTest {

	public static void main(String[] args) {
		System.out.println("mid : 오일권 ");

		// (1) 비어있는 리스트인 MyList 객체를 생성
		MyList list = new MyList();

		// (2) 1부터 100까지 차례대로 리스트의 맨 앞에 삽입(addFirst 호출)
		for(int i = 1; i <= 100; i++ ) {
			list.addFirst(i);
		}

		// (3) 리스트의 원소 합을 구하여(getSum 호출) 출력
		System.out.println("리스트 원소 합 = " + list.getSum());

	}
}

