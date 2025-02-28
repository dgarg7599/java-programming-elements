public class FeeCalculator {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        // Calculate discount amount
        double discount = (fee * discountPercent) / 100.0;
        // Calculate final amount to pay
        double finalAmount = fee - discount;
        // Display the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalAmount);
    }
}
