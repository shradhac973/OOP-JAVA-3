import java.util.Scanner;

// Find both diagonal sums of a square matrix.
// For odd-sized matrices, the center is included in both sums.
// Sample input: 3 1 2 3 4 5 6 7 8 9
// (Size, then matrix elements.)
// Sample output: Main diagonal sum: 15, Secondary diagonal sum: 15
public class Question25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the square matrix size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Size must be positive.");
            return;
        }

        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        System.out.println("Enter the matrix elements:");
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                int value = input.nextInt();
                if (row == column) {
                    mainDiagonalSum += value;
                }
                if (row + column == size - 1) {
                    secondaryDiagonalSum += value;
                }
            }
        }

        System.out.println("Main diagonal sum: " + mainDiagonalSum
                + ", Secondary diagonal sum: " + secondaryDiagonalSum);
    }
}