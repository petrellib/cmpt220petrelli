
public class bond {

	private double coupon;
	private int payments;
	private double interest;
	private double valueMaturity;
	
	public bond() {
		coupon = 20;
		payments = 5;
		interest = .03;
		valueMaturity = 100;
	}
	
	public void setCoupon(double C) {
		coupon = C;
	}
	
	public void setPayments(int N) {
		payments = N;
	}
	
	public void setInterest(double i) {
		interest = i;
	}
	
	public void setValueMaturity(double M) {
		valueMaturity = M;
	}
	
	public double getPrice() {
		
		double x = 1/(Math.pow((1+interest),payments));
		double z = 1-x;
		
		return coupon*z+valueMaturity*x;
		
	}
	
	

}
