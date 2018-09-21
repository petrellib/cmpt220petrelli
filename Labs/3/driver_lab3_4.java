
public class driver_lab3_4 {


	public static void main(String[] args) {
		
		int n = 0;
		int m = 15000;
		while (n < 1) {
			boolean isPrime = true;
			for(int i = 2; i < m; i++)
				if (m%i == 0) {
					isPrime = false;
					break;
				}
			if (isPrime) {
				n++;
				System.out.println(" " +m);
				if (n%10 ==0)
					System.out.println();
			}
			m--;
			
		}
				
	}

}
