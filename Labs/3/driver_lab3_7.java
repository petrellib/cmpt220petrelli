
public class driver_lab3_7 {

	
	public static void main(String[] args) {
	
		int n = 0;
		double P = 0;
				
		for (int i = 1;i < 50;i++) {
			P = (3*(n*n)-n)/2;
			n++;
			if(i%10==0) {
				System.out.println(P+",");
				
			}
			System.out.print(P+", ");
		}
		
		
	}

}

