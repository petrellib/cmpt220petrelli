import java.util.*;

public class driver_lab3_5 {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		
		
		System.out.println(average(a,b,c));

	}
	
	public static double average(double a, double b, double c) {
		double avg = (a + b + c)/3.0;
		return avg;
	}
}
