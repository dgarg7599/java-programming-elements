import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        int a = input.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = input.nextInt();

        System.out.print("Enter the third number (c): ");
        int c = input.nextInt();

        // Perform integer operations
        int result1 = a + b * c;  // Multiplication first, then addition
        int result2 = a * b + c;  // Multiplication first, then addition
        int result3 = c + a / b;  // Division first, then addition
        int result4 = a % b + c;  // Modulus first, then addition

        // Display the results
        System.out.println("The results of Int Operations are: ");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
