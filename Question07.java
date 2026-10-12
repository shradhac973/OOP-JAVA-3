import java.util.Scanner;

// Read and display a 3 by 3 matrix.
// Sample input: 1 2 3 4 5 6 7 8 9
// Sample output:
// 1 2 3
// 4 5 6
// 7 8 9
public class Question07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter nine integers:");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}