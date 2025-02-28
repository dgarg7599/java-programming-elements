import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        // Conversion factors
        double cmToInch = 2.54;
        double inchToFeet = 12;
        // Convert cm to inches
        double totalInches = heightCm / cmToInch;
        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / inchToFeet);
        double inches = totalInches % inchToFeet;
        // Display the result
        System.out.println("Your height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}
