import java.util.Scanner;

// Check whether a matrix has more zero elements than non-zero elements.
// Sample input: 3 3 1 0 0 0 0 0 2 0 3
// (Rows, columns, then matrix elements.)
// Sample output: The matrix is sparse.
public class Question30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns must be positive.");
            return;
        }

        int zeroCount = 0;
        int nonZeroCount = 0;
        System.out.println("Enter the matrix elements:");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                int value = input.nextInt();
                if (value == 0) {
                    zeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }

        if (zeroCount > nonZeroCount) {
            System.out.println("The matrix is sparse.");
        } else {
            System.out.println("The matrix is not sparse.");
        }
    }
}