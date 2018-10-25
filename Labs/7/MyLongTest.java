import java.util.*;

public class MyLongTest {

	
	public static void main(String[] args) {
		
		   Scanner input = new Scanner(System.in);
	       
	        System.out.print("Enter an integer: ");
	        long myInt = input.nextLong();
	       
	        MyLong myInteger1 = new MyLong(myInt);
	        MyLong myInteger2 = new MyLong(2);
	        
	        System.out.printf("%d is even? %s%n:", myInteger1.getValue(), myInteger1.isEven()); //even tes     
	        System.out.printf("%d is odd? %s%n:", myInteger1.getValue(), myInteger1.isOdd()); //odd test	        
	        System.out.printf("%d is prime? %s%n:", myInteger1.getValue(), myInteger1.isPrime()); //prime test
	        
	        System.out.printf("%d is even? %s%n:", myInteger2.getValue(), myInteger2.isEven()); //even test	        
	        System.out.printf("%d is odd? %s%n:", myInteger2.getValue(), myInteger2.isOdd()); //odd test	        
	        System.out.printf("%d is prime? %s%n:", myInteger2.getValue(), myInteger2.isPrime()); //prime test
	        

	        
	        System.out.printf("%d equals %d? %s%n", myInteger1.getValue(), myInteger2.getValue(), myInteger1.equals(myInteger2));

	        System.out.printf("%d%n", MyLong.parseInt(new char[] {'1', '2', '3'}));
	        System.out.printf("%d%n", MyLong.parseInt("01134"));
	        
	       

	}

}
