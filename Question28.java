import java.util.Scanner;

// Search a matrix and print every matching position using 1-based row and column numbers.
// Sample input: 2 3 1 2 3 4 5 6 5
// (Rows, columns, matrix values, then target.)
// Sample output: Found at row 2, column 2
public class Question28 {
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

        System.out.print("Enter the value to search for: ");
        int target = input.nextInt();
        boolean found = false;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (matrix[row][column] == target) {
                    System.out.println("Found at row " + (row + 1) + ", column " + (column + 1));
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Value not found.");
        }
    }
}