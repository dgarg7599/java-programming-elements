public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;
        // Calculate pens per student
        int pensPerStudent = totalPens / totalStudents;
	// Calculate remaining pens
        int remainingPens = totalPens % totalStudents;
        // Display the result
        System.out.println(
            "The Pen Per Student is " + pensPerStudent + 
            " and the remaining pen not distributed is " + remainingPens
        );
    }
}
