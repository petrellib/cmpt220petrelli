import java.util.*;

public class driver_lab5_2 {

	/*Write a Java program to calculate the mean and the standard deviation of a set of
numbers. The equations for the mean and the standard deviation of n numbers is:

To compute the standard deviation with this formula, you must store the individual
numbers using an array, so they can be used after the mean is obtained.
Your program should contain the following methods:
public static double deviation(double[] x)
public static double mean(double[] x)
Write a test program that prompts the user to enter 10 numbers and displays the mean
and standard deviation.
	 */
	
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
        double x[] = new double[10];
        System.out.println("Enter 10 numbers:");
        
        for(int i = 0; i < x.length; i++)
        {
        	x[i] = s.nextDouble();
        }
        
        System.out.println("The standard deviation of the numbers is: "+ deviation(x));

	}
	
	public static double deviation(double[] x) {
		
		double stdDev1 = 0;
		
		for (double n : x ) {	
			stdDev1 +=  Math.pow(n - mean(x),2);
		}
		
		return Math.sqrt(stdDev1/x.length);
	}
	
	public static double mean(double[] x) {
		
		double sum = 0;
		
		for (double value : x) {
			sum += value;
		}
		
		double average = sum / x.length;
		return average;
		
	}

}
