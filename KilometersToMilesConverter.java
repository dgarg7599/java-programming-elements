public class KilometersToMilesConverter {
    public static void main(String[] args) {
        double kilometers = 10.8;
        //1 km = 1.6 miles
        double conversionFactor = 1.6;
        // Convert kilometers to miles
        double miles = kilometers * conversionFactor;
        // Display the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
