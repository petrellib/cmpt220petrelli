import java.util.*; 


public class driver_lab3_1 {

	
	public static void main(String[] args) {
		double evenNum = -1;
		double sum = 0;
		double length = -1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive integer, the input ends with a 0: ");
		int input = 10;
		while (input !=0) {
			
			input = in.nextInt();
			length++;
			sum += input;
			
			if (input%2 ==0) {
				evenNum++;
			}
		
		}
	System.out.println("The number of even numbers: "+ evenNum);
	System.out.println("The total sum: "+ sum);
	System.out.println("The average is: "+sum/length);
		
		
		

	}

}
