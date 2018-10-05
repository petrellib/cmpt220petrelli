import java.util.*;

public class driver_lab5_6 {

	/*Write a Java program that computes the average of the values of a column in a twodimensional
array. You should create a method with the following header:
public static double averageRow(double[][] array, int column)
Write a test program that reads a matrix from the user and a column index to calculate
the average on. Print the result.	 */
	
	public static void main(String[] args) {
		
		int column = 0;
		
		Scanner s = new Scanner(System.in);
        int size = 0;
        System.out.println("Enter the size of the matrix:");
        size = s.nextInt();
        
        int matrix = size*size;
		
		Scanner s2 = new Scanner(System.in);
        double array[][] = new double[size][size];
        System.out.println("Enter the " +matrix+ " values for the matrix:");
        
        for(int i = 0; i < array.length; i++)
        	{
        		for(int j = 0; j < array.length; j++)
        		{
        		array[i][j] = s2.nextInt();
        		}
        	}
        
        System.out.println ("the average of the matrix is "+averageRow(array,column));
        
        
	}
	
	public static double averageRow(double[][] array, int column) {
		
		double avg = 0;
		double sum = 0;
		
		for(int i = 0; i < array.length; i++)
    	{
    		for(int j = 0; j < array.length; j++)
    		{
    		sum += array[i][j];
    		}
    	}
		
		avg = sum / array.length;
		
		return avg;
	}

}
