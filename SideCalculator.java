import java.util.Scanner;

public class SideCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();
        // Calculate side length using the formula: Side = Perimeter / 4
        double side = perimeter / 4;
        // Display the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
