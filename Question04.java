import java.util.Scanner;

// Find the maximum element in an array.
// Sample input: 5 3 12 7 2 9
// (The first number is the array size.)
// Sample output: Maximum: 12
public class Question04 {
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

        int maximum = numbers[0];
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
        }
        System.out.println("Maximum: " + maximum);
    }
}