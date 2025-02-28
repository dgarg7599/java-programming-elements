public class AverageCalculator {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        // Calculate average percentage
        int totalSubjects = 3;
        int totalMarks = maths + physics + chemistry;
        double averagePercentage = (double) totalMarks / totalSubjects;
        // Display the result
        System.out.println("Sam's average mark in PCM is " + averagePercentage + "%");
    }
}
