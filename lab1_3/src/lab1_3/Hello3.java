
 //***************************
 // 파일명: Hello3.java
 // 작성자: 201432025 오일권
 // 작성일: 18.08.31
 // 설명: 랜덤 숫자 세기
 //***************************

package lab1_3;

import java.util.Random;

public class Hello3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("lab1_3: 오일권");
		Random random = new Random();
		int sumOne=0, sumTwo=0, sumThree=0, sumFour=0;
			
		System.out.print("랜넘 넘버 = ");
		for (int i = 0; i < 10; i++) {
			int ranNum = random.nextInt(4)+1;
			System.out.print(ranNum+" ");
			if (ranNum == 1) {
				sumOne++;
			} else if (ranNum == 2) {
				sumTwo++;
			} else if (ranNum == 3) {
				sumThree++;
			} else if (ranNum == 4) {
				sumFour++;
			}
		}
		
		System.out.println();
		System.out.println("1의 갯수 = " + sumOne);
		System.out.println("2의 갯수 = " + sumTwo);
		System.out.println("3의 갯수 = " + sumThree);
		System.out.println("4의 갯수 = " + sumFour);
	}
}
	
	
	
	
	
	
	
	
	
	
	

