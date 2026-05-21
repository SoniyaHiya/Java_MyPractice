package array_2D;

public class CGPACalculation {

    public static void main(String[] args) {

        double[][] gradePoint = {
                {3.5, 4.0, 3.0, 3.7, 4.0},
                {2.5, 3.0, 3.5, 2.0, 3.0},
                {4.0, 3.8, 3.6, 3.9, 4.0},
                {3.0, 2.5, 3.2, 3.0, 2.8},
                {3.9, 4.0, 3.8, 3.7, 3.6}
        };

        double[] credits = {3, 3, 3, 3, 3};

        for (int i = 0; i < 5; i++) {

            double totalPoints = 0;
            double totalCredits = 0;

            for (int j = 0; j < 5; j++) {
                totalPoints += gradePoint[i][j] * credits[j];
                totalCredits += credits[j];
            }

            double cgpa = totalPoints / totalCredits;

            System.out.println("Student " + (i + 1) + " CGPA: " + cgpa);
        }
    }
}