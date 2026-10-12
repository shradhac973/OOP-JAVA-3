import java.util.Scanner;

// Find the sum of all values in a 2 by 2 by 2 array.
// Sample input: 1 2 3 4 5 6 7 8
// Sample output: Sum: 36
public class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][][] numbers = new int[2][2][2];
        int sum = 0;

        System.out.println("Enter eight integers:");
        for (int layer = 0; layer < 2; layer++) {
            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 2; column++) {
                    numbers[layer][row][column] = input.nextInt();
                    sum += numbers[layer][row][column];
                }
            }
        }
        System.out.println("Sum: " + sum);
    }
}