import java.util.Scanner;

// Create and display a jagged array with three rows of different lengths.
// Sample input: 2 10 20 3 30 40 50 1 60
// (For each row: its length, followed by that row's values.)
// Sample output:
// Row 1: 10 20
// Row 2: 30 40 50
// Row 3: 60
public class Question19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] numbers = new int[3][];

        for (int row = 0; row < numbers.length; row++) {
            System.out.print("Enter the number of values in row " + (row + 1) + ": ");
            int length = input.nextInt();
            if (length < 0) {
                System.out.println("Row length cannot be negative.");
                return;
            }
            numbers[row] = new int[length];
            System.out.print("Enter " + length + " values: ");
            for (int column = 0; column < length; column++) {
                numbers[row][column] = input.nextInt();
            }
        }

        for (int row = 0; row < numbers.length; row++) {
            System.out.print("Row " + (row + 1) + ": ");
            for (int number : numbers[row]) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}