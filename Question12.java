import java.util.Scanner;

// Add two matrices with the same number of rows and columns.
// Sample input: 2 2 1 2 3 4 5 6 7 8
// (Rows, columns, first matrix, then second matrix.)
// Sample output:
// 6 8
// 10 12
public class Question12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns must be positive.");
            return;
        }

        int[][] first = new int[rows][columns];
        int[][] second = new int[rows][columns];
        System.out.println("Enter the first matrix:");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                first[row][column] = input.nextInt();
            }
        }
        System.out.println("Enter the second matrix:");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                second[row][column] = input.nextInt();
            }
        }

        System.out.println("Sum matrix:");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print((first[row][column] + second[row][column]) + " ");
            }
            System.out.println();
        }
    }
}