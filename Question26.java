import java.util.Scanner;

// Display the upper and lower triangular parts of a square matrix.
// Values outside each triangle are displayed as zero.
// Sample input: 3 1 2 3 4 5 6 7 8 9
// (Size, then matrix elements.)
// Sample output:
// Upper: 1 2 3 / 0 5 6 / 0 0 9
// Lower: 1 0 0 / 4 5 0 / 7 8 9
public class Question26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the square matrix size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Size must be positive.");
            return;
        }

        int[][] matrix = new int[size][size];
        System.out.println("Enter the matrix elements:");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        System.out.println("Upper triangular matrix:");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print((column >= row ? matrix[row][column] : 0) + " ");
            }
            System.out.println();
        }

        System.out.println("Lower triangular matrix:");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print((column <= row ? matrix[row][column] : 0) + " ");
            }
            System.out.println();
        }
    }
}