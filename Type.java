import java.util.Scanner;

public class Type {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of subjects
        int numSubjects;
        System.out.print("Enter the number of subjects: ");
        numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input marks
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Calculate percentage
        double percentage = (double) totalMarks / (numSubjects * 100) * 100;

        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else if (percentage >= 50) {
            grade = "E";
        } else {
            grade = "F";
        }

        // Display results
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
