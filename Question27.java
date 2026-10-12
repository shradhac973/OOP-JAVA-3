import java.util.Scanner;

// Print only the boundary values of a matrix, in row-major order.
// Sample input: 3 3 1 2 3 4 5 6 7 8 9
// (Rows, columns, then matrix elements.)
// Sample output: Boundary: 1 2 3 4 6 7 8 9
public class Question27 {
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

        System.out.print("Boundary: ");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (row == 0 || row == rows - 1 || column == 0 || column == columns - 1) {
                    System.out.print(matrix[row][column] + " ");
                }
            }
        }
        System.out.println();
    }
}