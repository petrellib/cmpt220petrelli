import java.util.Random;


public class driver_lab2_6 {

	
	public static void main(String[] args) {

		Random rand1 = new Random();
		Random rand2 = new Random();
		Random rand3 = new Random();
		Random rand4 = new Random();
		Random rand5 = new Random();
		Random rand6 = new Random();
		Random rand7 = new Random();
		Random rand8 = new Random();
		Random rand9 = new Random();
		Random rand10 = new Random();
		
		int r1 = rand1.nextInt(9)+1;
		int r2 = rand2.nextInt(9)+0;
		int r3 = rand3.nextInt(9)+0;
		int r4 = rand4.nextInt(9+0);
		int r5 = rand5.nextInt(9)+0;
		int r6 = rand6.nextInt(9)+0;
		int r7 = rand7.nextInt(9)+0;
		int r8 = rand8.nextInt(9)+0;
		int r9 = rand9.nextInt(9)+0;
		int r10 = rand10.nextInt(9)+0;
		
		System.out.println("("+r1+r2+r3+") "+r4+r5+r6+ " - "+r7+r8+r9+r10);
		

	}

}
