import java.util.*;

public class OoBArray {

	public static void main(String[] args) {
		
		int[] bound = new int[100];
        for (int i = 0; i < bound.length; i++) {
            bound[i] = (int) (Math.random() * 100);
        }
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an index value: ");
        
        try {
            	int index = in.nextInt();
            	System.out.println("array[" + index + "] = " + bound[index]);
        	} catch (IndexOutOfBoundsException ex) {
        		System.out.println("The index reference " + ex.getLocalizedMessage() + " is out of bounds.");
        	} catch (Exception ex) {
        		System.out.println("Out of Bounds. Please try a different input.");
        	}

	}

}
