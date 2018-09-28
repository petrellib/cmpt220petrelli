import java.util.*;


public class driver_lab4_8 {

	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int a[] = new int[100];
        System.out.println("Enter the integers you want sorted smallest to largest:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = s.nextInt();
            
        }
        
        Arrays.sort(a); 
        System.out.println("\nYour numbers in sorted order are:\n");
        System.out.println(Arrays.toString(a));
      
     } 
}
    


