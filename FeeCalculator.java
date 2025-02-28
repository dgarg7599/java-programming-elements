public class FeeCalculator {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;
        // Calculate discount amount
        double discount = (fee * discountPercent) / 100.0;
        // Calculate final amount to pay
        double finalAmount = fee - discount;
        // Display the result
        System.out.println(
            "The original course fee is INR " + fee + "\n" +
            "The discount offered is INR " + discount + "\n" +
            "The final amount to be paid is INR " + finalAmount
        );
    }
}
