import java.util.*;


public class driver_project1 {

	
	public static void main(String[] args) {
		
		
		Scanner wallScan = new Scanner(System.in);
        int h = 0; //height of wall
        int w = 0; //width of wall
        int n = 0; //# of bricks provided
        System.out.println("Please enter the height, width, and number of bricks provided for the wall");
        h = wallScan.nextInt();
        w = wallScan.nextInt();
        n = wallScan.nextInt();
        
       
        
        Scanner bScan = new Scanner(System.in);
        int brick[] = new int[n];
        System.out.println("Enter the lengths of the " +n+ " bricks");
        
        for(int i = 0; i < brick.length; i++)
        {
        	brick[i] = bScan.nextInt();
        }
        
        
        boolean bCheck = true;
		int sum = 0;
		int bookmark = 0;
		int i = 0;
		
		for (int hCounter = 0; hCounter < h;) {
			i = bookmark;
			
			while (i<brick.length) {
				sum += brick[i];
			
				if (sum == w) {
					i++;
					bookmark = i;
					hCounter++;
					sum = 0;
					break;
				} 
				i++;
				
				if (sum > w) {
					bCheck = false;
					hCounter++;
					break;
				}
			}
			
			
		}
		
        if(bCheck == true) {
        	System.out.println("YES");
        } else {
        	System.out.println("NO");
        }
        
	}
}
	
	