import java.util.Scanner; 

public class driver_lab2_4 {

	
	public static void main(String[] args) {
	
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter first character: ");
		String num1 = input1.nextLine();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter second character: ");
		String num2 = input2.nextLine();

		//int char1 = num1;
		//int char2 = num2;
		
		double result = (num1 + num2);
		
		System.out.println(result);
		
	}

}
