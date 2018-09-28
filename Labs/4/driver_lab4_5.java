import java.util.*;


public class driver_lab4_5 {


	public static void main(String[] args) {

		int below = 0;
		int above = 0;
		int average;
		Random r = new Random();
		int counter = 0;
		
		int sum = 0;
		
		int[] numbers;
		numbers = new int[1000];
		
		while (counter<999) {
			numbers[counter] = r.nextInt(1000-1) + 1;
			counter++;
		}
		
		for (int i : numbers) {
			sum += i;
		}
		
		average = sum / numbers.length;
		
		System.out.println("The average is " + average);
		
		for (int counter2 = 0; counter2 < numbers.length; counter2++) {
			
			if (numbers[counter2] < average) {
				below ++;
			}
			if (numbers[counter2] > average) {
				above ++;
			}
			
			
		}
		
		System.out.println("There are " + below + " numbers below the average");
		System.out.println("There are " + above + " numbers above the average");

	}

}
