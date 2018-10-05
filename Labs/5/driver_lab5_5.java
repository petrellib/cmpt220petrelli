import java.util.*;

public class driver_lab5_5 {

	/* Write a Java program to transpose a matrix. The transpose of a matrix is a new matrix
whose rows are the columns of the original matrix.
The transpose of matrix:
1 2 3
4 5 6
7 8 9
is
1 4 7
2 5 8
3 6 9
Your program should get the size of the matrix, e.g. 3 is for a 3x3 matrix, and the values
for the matrix and should print out the transpose of the matrix. */
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int size = 0;
        System.out.println("Enter the size of the matrix:");
        size = s.nextInt();
        
        int matrix = size*size;
		
		Scanner s2 = new Scanner(System.in);
        int y[][] = new int[size][size];
        System.out.println("Enter the " +matrix+ " values for the matrix:");
        
        for(int i = 0; i < y.length; i++)
        	{
        		for(int j = 0; j < y.length; j++)
        		{
        		y[i][j] = s2.nextInt();
        		}
        	}
        
        System.out.println("The original matrix is ");
      	for(int i = 0; i < size; i++)
        	{
          	    for(int j = 0; j < size; j++)
                {
              	System.out.print(y[i][j]+" ");
                }
                System.out.println(" ");
            }
      	
      	System.out.println("The matrix after being transposed looks like thus ");
      	for(int i = 0; i < size; i++)
        	{
          	    for(int j = 0; j < size; j++)
                {
                    System.out.print(y[j][i]+" ");
                }
                System.out.println(" ");
            }
		

	}

}
