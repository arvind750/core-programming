import java.util.Scanner;  

public class StudentGrades1 {  

    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  

        // Taking input for the number of students  
        System.out.print("Enter the number of students: ");  
        int numStudents = scanner.nextInt();  

        // Arrays to store marks, percentages, and grades  
        int[] physicsMarks = new int[numStudents];  
        int[] chemistryMarks = new int[numStudents];  
        int[] mathsMarks = new int[numStudents];  
        double[] percentages = new double[numStudents];  
        String[] grades = new String[numStudents];  

        // Taking input for marks  
        for (int i = 0; i < numStudents; i++) {  
            System.out.println("Enter marks for student " + (i + 1) + ":");  

            // Input for Physics  
            System.out.print("Physics: ");  
            physicsMarks[i] = getValidMarks(scanner);  

            // Input for Chemistry  
            System.out.print("Chemistry: ");  
            chemistryMarks[i] = getValidMarks(scanner);  

            // Input for Maths  
            System.out.print("Maths: ");  
            mathsMarks[i] = getValidMarks(scanner);  

            // Calculate percentage  
            percentages[i] = (physicsMarks[i] + chemistryMarks[i] + mathsMarks[i]) / 3.0;  

            // Determine grade  
            grades[i] = calculateGrade(percentages[i]);  
        }  

        // Displaying the results  
        System.out.println("\nMarks, Percentages, and Grades:");  
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Maths", "Grade");  
        for (int i = 0; i < numStudents; i++) {  
            System.out.printf("%-10d %-10d %-10d %-10d %-10s\n",   
                (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], grades[i]);  
        }  
 
    }  

    private static int getValidMarks(Scanner scanner) {  
        int marks;  
        while (true) {  
            marks = scanner.nextInt();  
            if (marks < 0) {   
                System.out.print("Please enter a positive value: ");   
            } else {  
                break;  
            }  
        }  
        return marks;  
    }  

    private static String calculateGrade(double percentage) {  
        if (percentage >= 80) return "A";  
        else if (percentage >= 70) return "B";  
        else if (percentage >= 60) return "C";  
        else if (percentage >= 50) return "D";  
        else if (percentage >= 40) return "E";  
        else return "R";  
    }  
}