import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        
        System.out.println("Enter marks obtained (out of 100) in each subject:");
        System.out.print("Subject 1: ");
        int subject1 = sc.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = sc.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = sc.nextInt();

        
        int totalMarks = subject1 + subject2 + subject3;

        
        double averagePercentage = (double) totalMarks / 3;

        
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else if (averagePercentage >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
