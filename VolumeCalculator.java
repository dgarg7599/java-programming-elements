public class VolumeCalculator {
    public static void main(String[] args) {
        double radiusKm = 6378;  // Radius of Earth in kilometers
        double kmToMileFactor = 0.239913; // Conversion factor from km³ to mi³
        double pi = Math.PI;

        // Calculate volume in cubic kilometers using the formula: (4/3) * π * r³
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // Convert volume to cubic miles
        double volumeMi3 = volumeKm3 * kmToMileFactor;

        // Display the result
        System.out.println(
            "The volume of Earth in cubic kilometers is " + volumeKm3 +
            " and in cubic miles is " + volumeMi3
        );
    }
}
