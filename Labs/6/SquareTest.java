
public class SquareTest {


		public static void main(String[] args){
			
			square s1 = new square();
			
			square s2 = new square();
			s2.setWidth(40.0);
			
			square s3 = new square();
			s3.setWidth(35.9);
			
			System.out.println("The perimeter of the first box is : " +s1.getPerimeter() + "\n");
			System.out.println("The perimeter of the second box is : " +s2.getPerimeter() + "\n");
			System.out.println("The perimeter of the third box is : " +s3.getPerimeter() + "\n");
			
			System.out.println("The area of the first box is: " + s1.getArea() + "\n");
			System.out.println("The area of the second box is: " + s2.getArea() + "\n");
			System.out.println("The area of the third box is: " + s3.getArea() + "\n");
		}
	}


