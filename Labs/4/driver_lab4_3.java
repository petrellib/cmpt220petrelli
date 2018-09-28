import java.util.*;

public class driver_lab4_3 {

	
	public static boolean isPalindrome(String s)
    {
        if(s.length() == 0 || s.length() == 1) {
        	return true; 
        }
            
        if(s.charAt(0) == s.charAt(s.length()-1)) {
        	return isPalindrome(s.substring(1, s.length()-1));
        }

        return false;
    }

    public static void main(String[]args)
    {
   
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String to check for palinfromes:");
        String input = in.nextLine();
       
        if(isPalindrome(input))
            System.out.println(input + " is a palindrome");
        else
            System.out.println(input + " is not a palindrome");
	}

}
