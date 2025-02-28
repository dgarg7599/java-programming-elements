import java.util.Scanner;

public class StudentFeeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student fee amount: ");
        double fee = input.nextDouble();
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = input.nextDouble();
        // Calculate discount amount
        double discountAmount = (fee * discountPercent) / 100;
        // Calculate final fee after discount
        double finalFee = fee - discountAmount;
        // Display the result
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and the final discounted fee is INR " + finalFee);
    }
}
