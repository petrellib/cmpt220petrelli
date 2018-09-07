import java.util.Scanner;

public class driver_proj1_3 {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for ounces: ");
		double ounces = input.nextDouble();
		double ounce_conversion = 28.3495;
		double grams = ounces*ounce_conversion;
		System.out.println(ounces + " ounces is " +grams+ " grams.");

	}

}
