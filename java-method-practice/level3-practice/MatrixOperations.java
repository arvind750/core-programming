import java.util.Random;
import java.util.Scanner;

class MatrixOperations {

    public static double[][] generateMatrix(int rows, int cols) {
        Random random = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10) + 1;
            }
        }
        return matrix;
    }


    public static double[][] addMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    public static double[][] subtractMatrices(double[][] A, double[][] B) {
        int rows = A.length, cols = A[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    public static double[][] multiplyMatrices(double[][] A, double[][] B) {
        int rowsA = A.length, colsA = A[0].length, colsB = B[0].length;
        double[][] result = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }


    public static double[][] transposeMatrix(double[][] A) {
        int rows = A.length, cols = A[0].length;
        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = A[i][j];
            }
        }
        return transpose;
    }


    public static double determinant2x2(double[][] A) {
        return (A[0][0] * A[1][1]) - (A[0][1] * A[1][0]);
    }

    public static double determinant3x3(double[][] A) {
        return A[0][0] * (A[1][1] * A[2][2] - A[1][2] * A[2][1])
             - A[0][1] * (A[1][0] * A[2][2] - A[1][2] * A[2][0])
             + A[0][2] * (A[1][0] * A[2][1] - A[1][1] * A[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] A) {
        double det = determinant2x2(A);
        if (det == 0) throw new ArithmeticException("Matrix is not invertible");

        double[][] inverse = {
            { A[1][1] / det, -A[0][1] / det },
            { -A[1][0] / det, A[0][0] / det }
        };
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] A) {
        double det = determinant3x3(A);
        if (det == 0) throw new ArithmeticException("Matrix is not invertible");

        double[][] adjoint = new double[3][3];

        adjoint[0][0] = (A[1][1] * A[2][2] - A[1][2] * A[2][1]) / det;
        adjoint[0][1] = -(A[0][1] * A[2][2] - A[0][2] * A[2][1]) / det;
        adjoint[0][2] = (A[0][1] * A[1][2] - A[0][2] * A[1][1]) / det;

        adjoint[1][0] = -(A[1][0] * A[2][2] - A[1][2] * A[2][0]) / det;
        adjoint[1][1] = (A[0][0] * A[2][2] - A[0][2] * A[2][0]) / det;
        adjoint[1][2] = -(A[0][0] * A[1][2] - A[0][2] * A[1][0]) / det;

        adjoint[2][0] = (A[1][0] * A[2][1] - A[1][1] * A[2][0]) / det;
        adjoint[2][1] = -(A[0][0] * A[2][1] - A[0][1] * A[2][0]) / det;
        adjoint[2][2] = (A[0][0] * A[1][1] - A[0][1] * A[1][0]) / det;

        return adjoint;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f ", val);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] A = generateMatrix(3, 3);
        double[][] B = generateMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nMatrix Addition:");
        displayMatrix(addMatrices(A, B));

        System.out.println("\nMatrix Subtraction:");
        displayMatrix(subtractMatrices(A, B));

        System.out.println("\nMatrix Multiplication:");
        displayMatrix(multiplyMatrices(A, B));

        System.out.println("\nTranspose of Matrix A:");
        displayMatrix(transposeMatrix(A));

        System.out.println("\nDeterminant of A: " + determinant3x3(A));

        System.out.println("\nInverse of Matrix A:");
        displayMatrix(inverse3x3(A));

    }
}
