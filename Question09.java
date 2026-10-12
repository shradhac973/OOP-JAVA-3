import java.util.Scanner;

// Find the sum of each row in a matrix.
// Sample input: 2 3 1 2 3 4 5 6
// (Rows, columns, then matrix elements.)
// Sample output:
// Row 1 sum: 6
// Row 2 sum: 15
public class Question09 {
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

        for (int row = 0; row < rows; row++) {
            int sum = 0;
            for (int column = 0; column < columns; column++) {
                sum += matrix[row][column];
            }
            System.out.println("Row " + (row + 1) + " sum: " + sum);
        }
    }
}