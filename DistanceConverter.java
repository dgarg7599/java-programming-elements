import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();
        // Conversion factor (1 mile = 1.6 km)
        double miles = km / 1.6;
        // Display the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
