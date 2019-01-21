package hw5_2;

public class MyMatrixService {
	// (1) ���� �޼ҵ� multiply�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ΰ��� ����� �Ű������� �޾� ���� ���� ����� ������ ���� �迭�� ǥ���Ͽ� ����
	// �Ű������� ���� �� ����� ���� ���ϱ⿡ Ÿ���� ũ���� �����ص� ��

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

	// (2) ���� �޼ҵ� print�� �ۼ��Ͻÿ�.
	// ������ ���� �迭�� ǥ���� �ϳ��� ����� �Ű������� �޾� �� �ٿ� �� �྿ ���


}
