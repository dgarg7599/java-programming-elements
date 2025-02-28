import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in cm): ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle (in cm): ");
        double height = input.nextDouble();
        // Calculate area in square centimeters
        double areaCm2 = 0.5 * base * height;
        // Convert area from square cm to square inches (1 cm² = 0.155 sq in)
        double areaInches2 = areaCm2 * 0.155;
        // Display the result
        System.out.println("The area of the triangle is " + areaCm2 + " cm2 and " + areaInches2 + " square inches.");
    }
}
