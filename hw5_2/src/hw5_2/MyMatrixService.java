package hw5_2;

public class MyMatrixService {
	// (1) 정적 메소드 multiply를 작성하시오.
	// 이차원 정수 배열로 표현된 두개의 행렬을 매개변수로 받아 곱을 구해 결과를 이차원 정수 배열로 표현하여 리턴
	// 매개변수로 받은 두 행렬은 곱을 구하기에 타당한 크기라고 가정해도 됨

	public static int[][] multiply(int[][] number1, int[][] number2) {
		int[][] result = new int[number1.length][number2[0].length];
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[0].length; j++) {
				for(int k = 0; k < number1[0].length; k++) {
					result[i][j] += number1[i][k] * number2[k][j];
				}
			}
		}
		return result;
	}
	
	public static void print(int[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			System.out.println("");
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
		}
	}

	// (2) 정적 메소드 print를 작성하시오.
	// 이차원 정수 배열로 표현된 하나의 행렬을 매개변수로 받아 한 줄에 한 행씩 출력


}
