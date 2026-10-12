import java.util.Scanner;

// Rotate an array one position to the left.
// Sample input: 5 1 2 3 4 5
// (The first number is the array size.)
// Sample output: 2 3 4 5 1
public class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] numbers = new int[size];
        System.out.print("Enter " + size + " integers: ");
        for (int index = 0; index < size; index++) {
            numbers[index] = input.nextInt();
        }

        int first = numbers[0];
        for (int index = 0; index < size - 1; index++) {
            numbers[index] = numbers[index + 1];
        }
        numbers[size - 1] = first;

        System.out.print("Rotated array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}