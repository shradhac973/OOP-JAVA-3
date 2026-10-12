import java.util.Scanner;

// Search a 2 by 2 by 2 array and report every matching position (1-based).
// Sample input: 1 2 3 4 5 6 7 8 6
// (Eight array values followed by the value to search for.)
// Sample output: Found at layer 2, row 1, column 2
public class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][][] numbers = new int[2][2][2];

        System.out.println("Enter eight integers:");
        for (int layer = 0; layer < 2; layer++) {
            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 2; column++) {
                    numbers[layer][row][column] = input.nextInt();
                }
            }
        }

        System.out.print("Enter the value to search for: ");
        int target = input.nextInt();
        boolean found = false;
        for (int layer = 0; layer < 2; layer++) {
            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 2; column++) {
                    if (numbers[layer][row][column] == target) {
                        System.out.println("Found at layer " + (layer + 1) + ", row "
                                + (row + 1) + ", column " + (column + 1));
                        found = true;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("Value not found.");
        }
    }
}