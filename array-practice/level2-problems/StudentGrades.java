import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);
        
        // Take the number of students
        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();
        
        // Create a 2D array to store marks for Physics, Chemistry, and Maths
        double[][] marks = new double[number][3];  // [][0] - Physics marks, [][1] - Chemistry marks, [][2] - Maths marks
        double[] percentages = new double[number];  // To store percentage of each student
        String[] grades = new String[number];  // To store grade for each student
        
        // Take input for marks and calculate percentage and grade for each student
        for (int i = 0; i < number; i++) {
            double physicsMarks, chemistryMarks, mathsMarks;
            
            // Input marks for each subject, ensure they are valid
            do {
                System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
                physicsMarks = sc.nextDouble();
                if (physicsMarks < 0 || physicsMarks > 100) {
                    System.out.println("Marks should be between 0 and 100. Please enter valid marks.");
                }
            } while (physicsMarks < 0 || physicsMarks > 100);

            do {
                System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
                chemistryMarks = sc.nextDouble();
                if (chemistryMarks < 0 || chemistryMarks > 100) {
                    System.out.println("Marks should be between 0 and 100. Please enter valid marks.");
                }
            } while (chemistryMarks < 0 || chemistryMarks > 100);
            
            do {
                System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
                mathsMarks = sc.nextDouble();
                if (mathsMarks < 0 || mathsMarks > 100) {
                    System.out.println("Marks should be between 0 and 100. Please enter valid marks.");
                }
            } while (mathsMarks < 0 || mathsMarks > 100);

            // Store the marks in the 2D array
            marks[i][0] = physicsMarks;
            marks[i][1] = chemistryMarks;
            marks[i][2] = mathsMarks;
            
            // Calculate the percentage
            double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
            percentages[i] = (totalMarks / 300) * 100;  // Percentage based on total of 300 marks
            
            // Determine the grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 75) {
                grades[i] = "B";
            } else if (percentages[i] >= 50) {
                grades[i] = "C";
            } else {
                grades[i] = "D";
            }
        }
        
        // Display marks, percentage, and grade for each student
        System.out.println("\nStudent Results:");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("Student %d:\n", i + 1);
            System.out.printf("Physics Marks: %.2f\n", marks[i][0]);
            System.out.printf("Chemistry Marks: %.2f\n", marks[i][1]);
            System.out.printf("Maths Marks: %.2f\n", marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println("---------------------------------------------------------");
        }
    }
}
