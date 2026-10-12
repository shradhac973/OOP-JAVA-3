import java.util.Scanner;

// Remove duplicate values without using collections; keep the first occurrence.
// Sample input: 7 4 2 4 3 2 1 3
// (The first number is the array size.)
// Sample output: 4 2 3 1
public class Question24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] numbers = new int[size];
        int[] uniqueNumbers = new int[size];
        int uniqueCount = 0;
        System.out.print("Enter " + size + " integers: ");
        for (int index = 0; index < size; index++) {
            numbers[index] = input.nextInt();
        }

        for (int number : numbers) {
            boolean alreadyAdded = false;
            for (int index = 0; index < uniqueCount; index++) {
                if (uniqueNumbers[index] == number) {
                    alreadyAdded = true;
                    break;
                }
            }
            if (!alreadyAdded) {
                uniqueNumbers[uniqueCount] = number;
                uniqueCount++;
            }
        }

        System.out.print("Without duplicates: ");
        for (int index = 0; index < uniqueCount; index++) {
            System.out.print(uniqueNumbers[index] + " ");
        }
        System.out.println();
    }
}