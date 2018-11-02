
public class TriangleTest {

	
	public static void main(String[] args) {
		
        Triangle my = new Triangle(3,5,4,"Cyan", true);
        
        System.out.println("Area of the Triangle: " +my.getArea());
        System.out.println("Perimeter of the triangle: " +my.getPerimeter());
        System.out.println("The color of the Triangle is: " +my.getColor());
        System.out.println("Is the triangle filled?: " +my.isFilled());
	}

}
