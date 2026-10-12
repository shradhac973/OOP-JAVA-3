import java.util.Scanner;

// Find the transpose of a matrix.
// Sample input: 2 3 1 2 3 4 5 6
// (Rows, columns, then matrix elements.)
// Sample output:
// 1 4
// 2 5
// 3 6
public class Question11 {
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

        System.out.println("Transpose:");
        for (int column = 0; column < columns; column++) {
            for (int row = 0; row < rows; row++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}