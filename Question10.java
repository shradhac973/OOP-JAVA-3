import java.util.Scanner;

// Find the sum of each column in a matrix.
// Sample input: 2 3 1 2 3 4 5 6
// (Rows, columns, then matrix elements.)
// Sample output:
// Column 1 sum: 5
// Column 2 sum: 7
// Column 3 sum: 9
public class Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns must be positive.");
            return;
        }

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the matrix elements:");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        for (int column = 0; column < columns; column++) {
            int sum = 0;
            for (int row = 0; row < rows; row++) {
                sum += matrix[row][column];
            }
            System.out.println("Column " + (column + 1) + " sum: " + sum);
        }
    }
}