import java.util.Scanner;

// Find the maximum value in a 2 by 2 by 2 array.
// Sample input: 1 9 3 4 5 6 7 8
// Sample output: Maximum: 9
public class Question17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;

        System.out.println("Enter eight integers:");
        for (int layer = 0; layer < 2; layer++) {
            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 2; column++) {
                    int number = input.nextInt();
                    if (number > maximum) {
                        maximum = number;
                    }
                }
            }
        }
        System.out.println("Maximum: " + maximum);
    }
}