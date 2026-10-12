import java.util.Scanner;

// Count positive and negative values in a 2 by 2 by 2 array. Zero is not counted.
// Sample input: 1 -2 0 4 -5 6 -7 8
// Sample output: Positive: 4, Negative: 3, Zero: 1
public class Question16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        System.out.println("Enter eight integers:");
        for (int layer = 0; layer < 2; layer++) {
            for (int row = 0; row < 2; row++) {
                for (int column = 0; column < 2; column++) {
                    int number = input.nextInt();
                    if (number > 0) {
                        positiveCount++;
                    } else if (number < 0) {
                        negativeCount++;
                    } else {
                        zeroCount++;
                    }
                }
            }
        }

        System.out.println("Positive: " + positiveCount + ", Negative: " + negativeCount
                + ", Zero: " + zeroCount);
    }
}