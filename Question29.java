import java.util.Scanner;

// Sort each row of a jagged array in ascending order.
// Sample input: 2 4 9 4 8 3 3 3 1 2
// (Two rows; row lengths and values: 4 values, then 3 values.)
// Sample output:
// Row 1: 3 4 8 9
// Row 2: 1 2 3
public class Question29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rowCount = input.nextInt();

        if (rowCount <= 0) {
            System.out.println("Row count must be positive.");
            return;
        }

        int[][] numbers = new int[rowCount][];
        for (int row = 0; row < rowCount; row++) {
            System.out.print("Enter the length of row " + (row + 1) + ": ");
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

            for (int pass = 0; pass < length - 1; pass++) {
                for (int column = 0; column < length - 1 - pass; column++) {
                    if (numbers[row][column] > numbers[row][column + 1]) {
                        int temporary = numbers[row][column];
                        numbers[row][column] = numbers[row][column + 1];
                        numbers[row][column + 1] = temporary;
                    }
                }
            }
        }

        for (int row = 0; row < rowCount; row++) {
            System.out.print("Row " + (row + 1) + ": ");
            for (int number : numbers[row]) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}