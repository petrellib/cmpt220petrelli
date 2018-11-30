import java.util.Scanner;

public class problem_18_15 {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.print("please input a string and a character: ");
			String[] str = in.nextLine().split("[ ]");
			System.out.println("The character \'" + str[1] + "\' appears " +count(str[0], str[1].charAt(0)) + " times in the string \"" + str[0] + "\".");
			}

		public static int count(String str, char a) {
			return count(str, a, str.length() - 1);
			}

		private static int count(String str, char a, int high) {
			if (high < 0) {
				return 0;
				}
			else if (str.charAt(high) ==  a) {
				return 1 + count(str, a, high - 1);
				}
			else {
				return count(str, a, high - 1); 
				}
		}
	}