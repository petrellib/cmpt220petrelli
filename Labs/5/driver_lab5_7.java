import java.util.*;

public class driver_lab5_7 {

	/*A square matrix is said to be an upper triangular matrix if the value of the cell is 0 when
row > column. For example,
2 1 4
0 3 −1
0 0 −2
is an upper triangular matrix. Write a method that will check if a matrix is an upper
triangular matrix:
public static boolean isUpperTriangular(double[][] array)
Write a test program to test your method.	 */
	
	public static void main(String[] args) {
		
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
        
        System.out.println("Is the matrix an upper triangular matrix? " +isUpperTriangular(array));

	}
	
	public static boolean isUpperTriangular(double[][] array) {
		boolean triangle = true;
		
		for(int i = 0; i < array.length; i++)
    	{
    		for(int j = 0; j < array.length; j++)
    		{
    			if (j>i && array[i][j] != 0) {
    				triangle = false;
    			}
    			
    		}
    	}
		
		return triangle;
	}

}
