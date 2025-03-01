import java.util.Scanner;

public class DoubleOperations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number (a): ");
        double a = input.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = input.nextDouble();

        System.out.print("Enter the third number (c): ");
        double c = input.nextDouble();

        // Perform arithmetic operations with proper precedence
        double result1 = a + b * c;  // Multiplication first, then addition
        double result2 = a * b + c;  // Multiplication first, then addition
        double result3 = c + a / b;  // Division first, then addition
        double result4 = a % b + c;  // Modulus first, then addition

        // Display the results with two decimal
        System.out.printf("The results of Double Operations are: \n");
        System.out.printf("a + b * c = %.2f\n", result1);
        System.out.printf("a * b + c = %.2f\n", result2);
        System.out.printf("c + a / b = %.2f\n", result3);
        System.out.printf("a %% b + c = %.2f\n", result4);
    }
}
