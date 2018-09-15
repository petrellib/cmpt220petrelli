import java.util.Scanner;

public class driver_lab2_1 {

	
	public static void main(String[] args) {
	
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		double num1 = input1.nextDouble();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter number 2: ");
		double num2 = input2.nextDouble();
		
		if(num1<num2) {
			System.out.println(num1+ " is LESS THAN " +num2+ " ? true");
		} else {
			System.out.println(num1+ " is LESS THAN " +num2+ " ? false");
		}
		
		if(num1<=num2) {
			System.out.println(num1+ " is LESS THAN OR EQUAL TO " +num2+ " ? true");
		} else {
			System.out.println(num1+ " is LESS THAN OR EQUAL TO " +num2+ " ? false");
		}
		
		if(num1==num2) {
			System.out.println(num1+ " is EQUAL TO " +num2+ " ? true");
		} else {
			System.out.println(num1+ " is EQUAL TO " +num2+ " ? false");
		}
		
		if(num1!=num2) {
			System.out.println(num1+ " is NOT EQUAL TO " +num2+ " ? true");
		} else {
			System.out.println(num1+ " is NOT EQUAL TO " +num2+ " ? false");
		}

		if(num1>num2) {
			System.out.println(num1+ " is GREATER THAN " +num2+ " ? true");
		} else {
			System.out.println(num1+ " is GREATER THAN " +num2+ " ? false");
		}
		
		if(num1>=num2) {
			System.out.println(num1+ " is GREATER THAN OR EQUAL TO " +num2+ " ? true");
		} else {
			System.out.println(num1+ " is GREATER THAN OR EQUAL TO " +num2+ " ? false");
		}
	}

	
}
