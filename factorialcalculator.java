import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator {

    // Method to calculate the factorial of a BigInteger
    public static BigInteger factorial(BigInteger n) {
        // Base case: if n is 0 or 1, return 1
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        } else {
            // Recursive call of n * (n - 1)!
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }

    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Checking if negative
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate the factorial using the factorial method
            BigInteger result = factorial(BigInteger.valueOf(num));
            System.out.println("Factorial of " + num + "! is " + result); //Result
        }
        
        // Close the scanner
        scanner.close();
    }
}