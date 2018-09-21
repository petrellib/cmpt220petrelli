
public class driver_lab3_2 {

	
	public static void main(String[] args) {
double i = 100;
double counter = 1;
		
		while (i<=500) { //repeats loop while i is between 100 and 500
			
			if (i%5 == 0 && !(i%7 == 0)) { //checks if i is divisible by 5 and not by 7
				
				System.out.print(+i+", "); //prints i
				i++; //adds 1 to i
			
			} else {
				if (i%7 == 0 && !(i%5 == 0)) { //checks if i is divisible by 7 and not by 5
					
					System.out.print(+i+", "); //prints i
					i++; //adds 1 to i
				
				} else {
						i++; //adds 1 to i
				}
				
				i++; //adds 1 to i
				
			}
		if (counter%10.0 == 0) {
			System.out.println();
		}
		counter++;
	}

}
}
