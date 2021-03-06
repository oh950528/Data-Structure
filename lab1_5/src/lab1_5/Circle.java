/* 
----------------------------------------------------------
두 개의 클래스로 이루어진 프로그램이다.
반지름 속성을 갖는 Circle 클래스를 작성하고 사용하는 프로그램을 다음과 같이 작성하시오.

- Circle 클래스
  필드(private 인스턴스 변수):
  반지름(radius) - 정수형

  메소드(public 메소드):
   매개변수가 없는 생성자(constuctor) - 반지름을 1로 초기화
  반지름을 매개변수로 받아 초기화 하는 생성자(consturctor)
                   Q: 위의 두 constructor 의 이름은 무엇인가?  Circle
  반지름 getter/setter
     Q: 위의 두 메소드의 이름을 자바 관례에 맞게 정하면?    getRadius  setRadius
  면적을 계산하여 리턴하는 메소드 - 원주율은 3.14 또는 Math 클래스의 상수 이용
                매개변수 없음
 equals/hashCode 오버라이드 - 반지름이 동일하면 동일한 객체로 간주하도록
  toString 오버라이드 - 반지름 정보를 문자열로 리턴

   *** 주의: 위 메소드들에는 출력문이 없도록 할 것
   *** 이클립스의 Source 명령을 이용해도 좋습니다.

- 드라이버 클래스(예를 들어 CircleTest 클래스)의 main 메소드는 다음을 수행

   (1) 원 객체를 생성(circle1)
    (2) circle1의 반지름을 2로 수정

   (3) 원 객체를 생성하되, 1~4 범위의 랜덤 정수값으로 반지름을 초기화하도록 생성(circle2)

   (4) circle1를 출력 - toString 호출
   (5) circle2를 출력 - toString 호출

   (6) circle1과 circle2가 동일한지를 알아보아 결과를 출력 - equals 호출

   (7) circle1의 hashCode를 출력 - hashCode 호출
   (8) circle2의 hashCode를 출력 - hashCode 호출

   (9) circle1의 면적을 출력 - 면적계산 메소드 호출
   (10) circle2의 면적을 출력 - 면적계산 메소드 호출

- 입력: 없음
- 출력: 두 원이 동일한지 여부와 기타 정보

- 실행 예 1
 lab1_5: 홍길동
Circle [radius=2]
 Circle [radius=2]
 true
 33
 33
 12.56
 12.56

- 실행 예 2
 lab1_5: 홍길동
Circle [radius=2]
 Circle [radius=4]
 false
 33
 35
 12.56
 50.24

----------------------------------------------------------
목적
- 클래스 작성, 객체 생성과 사용을 연습한다.
*/
 //***************************
 // 파일명: Hello5.java
 // 작성자: 201432025오일권
 // 작성일: 2018.09.06
 // 설명: 반지름 속성을 갖는 Circle 클래스를 작성하고 사용하는 프로그램만들기.
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
