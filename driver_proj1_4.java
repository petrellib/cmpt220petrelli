import java.util.Scanner;

public class driver_proj1_4 {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a value for mass (in Kilograms): ");
		double m = input.nextDouble();
		double c = 299972458;
		double E = m * (c*c);
		System.out.println("The value of E for this equation is: " +E);

	}

}
