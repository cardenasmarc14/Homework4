import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicates {

    // Method to remove duplicates
    public static void removeDuplicate(ArrayList<Integer> arrList) {
        // Iterate through the ArrayList
        for (int i = 0; i < arrList.size() - 1; i++) {
            for (int j = i + 1; j < arrList.size(); j++) {
                // Check if element is not unique
                if (arrList.get(i).equals(arrList.get(j))) {
                    arrList.remove(j);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        // Create an ArrayList to store integers
        ArrayList<Integer> lst = new ArrayList<Integer>();
        
        // Prompt the user to enter 10 integers
        System.out.println("Can You Enter 10 integers: ");
        
        // Adding the intergers from user to the ArrayList
        for (int i = 0; i < 10; i++) {
            lst.add(in.nextInt());
        }
        
        // Call the method to remove duplicates
        removeDuplicate(lst);

        // Display the distinct integers
        System.out.print("The distinct integers are: ");
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i) + " ");
        }
        System.out.println();
    }
}