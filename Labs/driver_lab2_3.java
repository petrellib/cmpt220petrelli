import java.util.Scanner; 
import java.util.Random; 

public class driver_lab2_3 {


	public static void main(String[] args) {
		
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter lower limit number: ");
		int num1 = input1.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter upper limit number: ");
		int num2 = input2.nextInt();

		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();
		
		int r1 = rand1.nextInt(num2)+num1;
		int r2 = rand2.nextInt(num2)+num1;
		int r3 = rand3.nextInt(num2)+num1;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
	}

}
