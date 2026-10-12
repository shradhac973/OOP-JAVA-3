import java.util.Scanner;

// Multiply two 3 by 3 matrices.
// Sample input: 1 0 0 0 1 0 0 0 1 1 2 3 4 5 6 7 8 9
// (First matrix, then second matrix.)
// Sample output:
// 1 2 3
// 4 5 6
// 7 8 9
public class Question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] first = new int[3][3];
        int[][] second = new int[3][3];
        int[][] product = new int[3][3];

        System.out.println("Enter the first 3 by 3 matrix:");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                first[row][column] = input.nextInt();
            }
        }
        System.out.println("Enter the second 3 by 3 matrix:");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                second[row][column] = input.nextInt();
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                for (int index = 0; index < 3; index++) {
                    product[row][column] += first[row][index] * second[index][column];
                }
            }
        }

        System.out.println("Product matrix:");
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(product[row][column] + " ");
            }
            System.out.println();
        }
    }
}