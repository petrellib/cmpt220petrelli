import java.util.*;

public class driver_lab4_4 {

	static final int MAX_CHAR = 256; 
	  
    static void getOccuringChar(String str) 
    { 

        int count[] = new int[MAX_CHAR]; 
  
        int length = str.length(); 
  
  
        for (int i = 0; i < length; i++) 
            count[str.charAt(i)]++; 
  
        
        char ch[] = new char[str.length()]; 
        for (int i = 0; i < length; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
               
                if (str.charAt(i) == ch[j])  
                    find++;                 
            } 
  
            if (find == 1)  
                System.out.println("Number of " +str.charAt(i)+ "'s: "  + count[str.charAt(i)]);             
        } 
    } 
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter the word(s) to check for duplicates:");
        String str = in.nextLine(); 
        getOccuringChar(str); 
    } 

}
