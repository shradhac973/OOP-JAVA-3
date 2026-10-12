import java.util.Scanner;

// Find the sum of all elements in a one-dimensional array.
// Sample input: 5 2 4 6 8 10
// (The first number is the array size.)
// Sample output: Sum: 30
public class Question03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] numbers = new int[size];
        int sum = 0;
        System.out.print("Enter " + size + " integers: ");
        for (int index = 0; index < size; index++) {
            numbers[index] = input.nextInt();
            sum += numbers[index];
        }
        System.out.println("Sum: " + sum);
    }
}