
public class driver_proj1_2 {


	public static void main(String[] args) {
		
		double a1 = 1.0;
		double a2 = (1.0/3.0);
		double a3 = (1.0/5.0);
		double a4 = (1.0/7.0);
		double a5 = (1.0/9.0);
		double a6 = (1.0/11.0);
		double a7 = (1.0/13.0);
		
		double pi1 = 4.0*(a1-a2+a3-a4+a5-a6); //calculate Pi using a1-a6
		double pi2 = 4.0*(a1-a2+a3-a4+a5-a6+a7); //calculate Pi using a1-a7
	
		
		System.out.println("Pi could be calculated as: " + pi1); //print the result of the pi1
		System.out.println("Pi could also be calculated as: " + pi2); //print the result of the pi2

	}

}
