import java.util.*;

public class driver_lab5_4 {

	/*Write a Java program that takes two arrays of integers and says if the arrays are
identical. The two arrays are identical if they have the same elements, even if they are
not in the same order. It should use the following method:
public static boolean equal(int[] x, int[] y)
Ask the user to enter two sets of values and print the result. The first value indicates the
number of elements for each array.
An example run might look like this:
Enter the first array: 5 3 4 2 5 6
Enter the second array: 5 2 5 6 4 3
The two arrays are identical */
	
	public static void main(String[] args) {
	

		int n = 0;
		
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the first array");
        n = s.nextInt();
        int x[] = new int[n];
        x[0] = n;
        for(int i = 1; i < x.length; i++)
        {
        	x[i] = s.nextInt();
        }
        
        Scanner s2 = new Scanner(System.in);
        int y[] = new int[x.length];
        System.out.println("Enter the second array:");
        
        for(int i = 0; i < y.length; i++)
        {
        	y[i] = s2.nextInt();
        }
        
        if (equals(x, y) == true) {
        	System.out.println("The two arrays are identical");
        }
        if (equals(x, y) == false) {
        	System.out.println("The two arrays are not identical");
        }
        
	}
	
	public static boolean equals(int[] x, int[] y) {
		
		Arrays.sort(x);
		Arrays.sort(y);
		boolean equal;
		//System.out.println(Arrays.equals(x, y));
		equal = Arrays.equals(x, y);
		
		return equal;
	}

}
