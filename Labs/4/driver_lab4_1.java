import java.text.DecimalFormat;
import java.util.*;

public class driver_lab4_1 {

	
	public static void main(String[] args) {
	
		int[] inch1 = new int[50];
		double[] cm1 = new double[50];
		double[] inch2 = new double[50];
		int[] cm2 = new int[50];
		cm2[0] = 1;
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		int i5 = 0;
		int counter1 = 1;
		int counter2 = 1;
		int counter3 = 1;
		int counter4 = 1;
		int counter5 = 1;
		
		
		while (counter1<=50) {
			inch1[i1] = counter1;
			counter1++;
			i1++;
		}
		
		while (counter2<=50) {
			cm1[i2] = inch1[i2] * 2.54;
			counter2++;
			i2++;
		}
		
		while (counter3<=49) {
			cm2[i3+1] = cm2[i3] + 5;
			counter3++;
			i3++;
		}
		
		while (counter4<=50) {
			inch2[i4] = cm2[i4] / 2.54;
			counter4++;
			i4++;
		}
	     
		
		System.out.println("in     cm | cm     in");
		System.out.println("_____________________");
		while (counter5<=50) {
			System.out.println(inch1[i5]+ "     " + cm1[i5] + " | " + cm2[i5] + "     " + inch2[i5]);
			counter5++;
			i5++;
		}
		
		
		
		
	}

}
