
public class BondTest {

	
	public static void main(String[] args) {
		
		bond b1 = new bond();
		
		bond b2 = new bond();
		b2.setCoupon(500);
		b2.setPayments(100);
		b2.setInterest(.05);
		b2.setValueMaturity(10000);
		
		System.out.println("The prce of the first bond is : $" +b1.getPrice());
		System.out.println("The prce of the second bond is : $" +b2.getPrice());

	}

}
