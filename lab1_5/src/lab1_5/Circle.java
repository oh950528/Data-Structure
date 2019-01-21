/* 
----------------------------------------------------------
�� ���� Ŭ������ �̷���� ���α׷��̴�.
������ �Ӽ��� ���� Circle Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷��� ������ ���� �ۼ��Ͻÿ�.

- Circle Ŭ����
  �ʵ�(private �ν��Ͻ� ����):
  ������(radius) - ������

  �޼ҵ�(public �޼ҵ�):
   �Ű������� ���� ������(constuctor) - �������� 1�� �ʱ�ȭ
  �������� �Ű������� �޾� �ʱ�ȭ �ϴ� ������(consturctor)
                   Q: ���� �� constructor �� �̸��� �����ΰ�?  Circle
  ������ getter/setter
     Q: ���� �� �޼ҵ��� �̸��� �ڹ� ���ʿ� �°� ���ϸ�?    getRadius  setRadius
  ������ ����Ͽ� �����ϴ� �޼ҵ� - �������� 3.14 �Ǵ� Math Ŭ������ ��� �̿�
                �Ű����� ����
 equals/hashCode �������̵� - �������� �����ϸ� ������ ��ü�� �����ϵ���
  toString �������̵� - ������ ������ ���ڿ��� ����

   *** ����: �� �޼ҵ�鿡�� ��¹��� ������ �� ��
   *** ��Ŭ������ Source ����� �̿��ص� �����ϴ�.

- ����̹� Ŭ����(���� ��� CircleTest Ŭ����)�� main �޼ҵ�� ������ ����

   (1) �� ��ü�� ����(circle1)
    (2) circle1�� �������� 2�� ����

   (3) �� ��ü�� �����ϵ�, 1~4 ������ ���� ���������� �������� �ʱ�ȭ�ϵ��� ����(circle2)

   (4) circle1�� ��� - toString ȣ��
   (5) circle2�� ��� - toString ȣ��

   (6) circle1�� circle2�� ���������� �˾ƺ��� ����� ��� - equals ȣ��

   (7) circle1�� hashCode�� ��� - hashCode ȣ��
   (8) circle2�� hashCode�� ��� - hashCode ȣ��

   (9) circle1�� ������ ��� - ������� �޼ҵ� ȣ��
   (10) circle2�� ������ ��� - ������� �޼ҵ� ȣ��

- �Է�: ����
- ���: �� ���� �������� ���ο� ��Ÿ ����

- ���� �� 1
 lab1_5: ȫ�浿
Circle [radius=2]
 Circle [radius=2]
 true
 33
 33
 12.56
 12.56

- ���� �� 2
 lab1_5: ȫ�浿
Circle [radius=2]
 Circle [radius=4]
 false
 33
 35
 12.56
 50.24

----------------------------------------------------------
����
- Ŭ���� �ۼ�, ��ü ������ ����� �����Ѵ�.
*/
 //***************************
 // ���ϸ�: Hello5.java
 // �ۼ���: 201432025���ϱ�
 // �ۼ���: 2018.09.06
 // ����: ������ �Ӽ��� ���� Circle Ŭ������ �ۼ��ϰ� ����ϴ� ���α׷������.
 //***************************



package lab1_5;

public class Circle {
	
	private int radius;

	public Circle() {
		this.radius = 1;
	}
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double extent() {
		return radius*radius*Math.PI;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
}
