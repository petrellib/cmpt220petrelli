import java.util.*;

public class driver_lab4_2 {

	
	public static void main(String[] args) {	
	
		Random r = new Random();
		
			for (int i=0;i<=24;i++) {
				int c = r.nextInt(123-97)+97;
				char a = (char)c;
				System.out.print(a+" ");
				if (i%5 ==0) {
					System.out.println();
				}
				
		}

	}
	

}
