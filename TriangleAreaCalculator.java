import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble();
        // Calculate area in square centimeters
        double areaCm2 = 0.5 * base * height;
        // Convert area from square cm to square inches (1 in² = 2.54² cm²)
        double conversionFactor = 2.54 * 2.54; // 1 in² = 6.4516 cm²
        double areaIn2 = areaCm2 / conversionFactor;
        // Display the result
        System.out.println("The area of the triangle in square centimeters is " + areaCm2 + " and in square inches is " + areaIn2);
    }
}
