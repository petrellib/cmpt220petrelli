import java.util.Scanner; 

public class driver_lab2_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String num1 = s1.nextLine();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter second String: ");
		String num2 = s2.nextLine();
        
		
  if (s1>s2) {
        System.out.println(" Comparing strings with compareto:"); 
        System.out.println(+(int)s1+(int)s2+); 
  } else {
	  System.out.println(s1.compareTo(s2));
  }

	}

}
