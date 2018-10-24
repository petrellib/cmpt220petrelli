import java.util.*;

public class TestStackOfIntegers {

	


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive whole number: ");
		int num = input.nextInt();
		
		System.out.print("The prime factors of " + num + " are: ");
		StackOfIntegers stack = new StackOfIntegers();
		
		primeFactors(num, stack);
		
		while (!stack.empty())  {
			System.out.print(stack.pop() + " ");
		}
		
	}
	
	public static void primeFactors(int num, StackOfIntegers stack) {
		int i = 2;
		while (num / i != 1) {
			if (num % i == 0) {
				stack.push(i);
				num /= i;
			} else 
				i++;
		}
		stack.push(num);
	}

}
