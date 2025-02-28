import java.util.Scanner;

public class ConversionOfDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        // Conversion factors
        double feetToYard = 3;    // 1 yard = 3 feet
        double yardToMile = 1760; // 1 mile = 1760 yards
        // Convert feet to yards
        double distanceInYards = distanceInFeet / feetToYard;
        // Convert yards to miles
        double distanceInMiles = distanceInYards / yardToMile;
        // Display the result
        System.out.println("The distance of " + distanceInFeet + " feet is " + distanceInYards + " yards and " + distanceInMiles + " miles.");
    }
}
