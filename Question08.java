import java.util.Scanner;

// Find the sum of all elements in a matrix.
// Sample input: 2 2 1 2 3 4
// (Rows, columns, then matrix elements.)
// Sample output: Sum: 10
public class Question08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows and columns: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        if (rows <= 0 || columns <= 0) {
            System.out.println("Rows and columns must be positive.");
            return;
        }

        int sum = 0;
        System.out.println("Enter the matrix elements:");
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                sum += input.nextInt();
            }
        }
        System.out.println("Sum: " + sum);
    }
}