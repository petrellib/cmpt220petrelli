
public class CircleTest {

	
	public static void main(String[] args) {
	
		Circle c1 = new Circle(2,2,5.5);
		
		System.out.println("Area: " +c1.getArea());
		
		System.out.println("Perimeter: " +c1.getPerimeter());
		
		System.out.println("Does the cicle contain the point: " +c1.contains(3.0,3.0));
		
		System.out.println("Does the cicle contain the circle: " +c1.contains(new Circle(4,5,10.5)));
		
		System.out.println("Does the cicle overlap with the circle: " +c1.overlaps(new Circle(3,5,2.3)));
	}

}
