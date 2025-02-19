import java.util.*;

public class EmployeeBonusCalculator {
    
    public static int[][] generateEmployeesData(int numEmployees) {
        int[][] data = new int[numEmployees][2];
        Random random = new Random();
        
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + random.nextInt(90000); 
            data[i][1] = random.nextInt(11);
        }
        return data;
    }


    public static int[][] calculateNewSalaries(int[][] data) {
        int[][] newData = new int[data.length][3];
        
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            int bonus = (int) (salary * bonusPercentage);
            newData[i][0] = salary;
            newData[i][1] = salary + bonus;
            newData[i][2] = bonus;
        }
        return newData;
    }
    
    public static void displaySalaryDetails(int[][] newData) {
        int sumOld = 0, sumNew = 0, totalBonus = 0;
        
        System.out.println("Emp# | Old Salary | New Salary | Bonus");
        System.out.println("------------------------------------");
        
        for (int i = 0; i < newData.length; i++) {
            System.out.printf("%4d | %10d | %10d | %5d\n", (i + 1), newData[i][0], newData[i][1], newData[i][2]);
            sumOld += newData[i][0];
            sumNew += newData[i][1];
            totalBonus += newData[i][2];
        }
        
        System.out.println("------------------------------------");
        System.out.printf("TOTAL | %10d | %10d | %5d\n", sumOld, sumNew, totalBonus);
    }

    public static void main(String[] args) {
        
        int[][] employeesData = generateEmployeesData(10);
        int[][] newSalaries = calculateNewSalaries(employeesData);
        displaySalaryDetails(newSalaries);
    }
}
