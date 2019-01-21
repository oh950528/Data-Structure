package tutorials;

/*
 * ���ϸ�: DirectedGraphTest.java
 * �ۼ���: 2018.12.3
 * �ۼ���: ���ϱ�
 * ����: ���� �׷����� �����ϰ� �̿��ϴ� ���α׷�
 */

import java.util.Scanner;

public class DirectedGraphTest {
 public static void main(String[] args) {
  System.out.println("course12 : ���ϱ�");

  // ���� �� n �Է�
  Scanner scan = new Scanner(System.in);
  System.out.print("���� �� �Է�: ");
  int n = scan.nextInt();

  // ���� ���� n�� ���� �׷��� graph1�� graph2�� ����
  DirectedMatrixGraph graph1 = new DirectedMatrixGraph(n);
  DirectedListGraph graph2 = new DirectedListGraph(n);

  // ���� �� e �Է�
  System.out.print("���� �� �Է�: ");
  int e = scan.nextInt();

  // e���� ����(���� ��)�� �Է¹޾� graph1�� graph2�� ����
  System.out.println(e + "���� ������ �Է��ϼ���(�� ������ ���� ��ȣ 2���� whitespace�� �����Ͽ� �Է�):");
  for(int i = 0; i < e; i++) {
   int v1 = scan.nextInt();
   int v2 = scan.nextInt();
   graph1.addEdge(v1, v2);
   graph2.addEdge(v1, v2);
  }

  // graph1 �� ������ in-degree�� ���
  System.out.println("graph1");
  for(int i = 0; i < n; i++) {
   System.out.println("���� " + i + "�� �������� = " + graph1.inDegree(i));  
  }
  
  // graph2 �� ������ in-degree�� ���
  System.out.println("graph2");
  for(int i = 0; i < n; i++) {
   System.out.println("���� " + i + "�� �������� = " + graph2.inDegree(i));  
  }
 }
}