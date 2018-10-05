import java.util.*;

public class driver_lab5_1 {

	/* Write a method that finds the largest element in an array of double values with the
	following header:
	public static double max(double[] array)
	Write a program that prompts the user to enter 10 numbers, invokes this method to
	return the maximum value, and displays the maximum value. */
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        double a[] = new double[10];
        System.out.println("Enter 10 numbers:");
        
        for(int i = 0; i < a.length; i++)
        {
        	a[i] = s.nextDouble();
        }
        
        max(a); 
		
		System.out.println(a[9]+ " is the largest value");
		
	}
	
	
	public static double max(double[] a) {		
        
        Arrays.sort(a);
        
        return a[9];
		
	}

}
