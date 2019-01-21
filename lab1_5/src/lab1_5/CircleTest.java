package lab1_5;

public class CircleTest {

	public static void main(String[] args) {
		System.out.println("lab1_5: ø¿¿œ±«");
		
		Circle circle1 = new Circle();
		circle1.setRadius(2);
		
		Circle circle2 = new Circle();
		circle2.setRadius((int) (Math.random() * 4) + 1);
		
		System.out.println(circle1.toString());
		System.out.println(circle2.toString());
		
		System.out.println(circle1.equals(circle2));
		
		System.out.println(circle1.hashCode());
		System.out.println(circle2.hashCode());
		
		System.out.println(String.format("%.2f", circle1.extent()));
		System.out.println(String.format("%.2f", circle2.extent()));
	}
}
