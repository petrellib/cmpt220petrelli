import java.util.*;

public class ArrayListSort {

	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 integers seperated by spaces: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) 
        {
        	list.add(input.nextInt());
        }

        sort(list);
        System.out.println(list);

    }

    public static void sort(ArrayList<Integer> list) {

        // simple solution
        Collections.sort(list);

    

    }

}
