import java.util.Scanner;

// Copy all elements from one array into another array.
// Sample input: 4 5 10 15 20
// (The first number is the array size.)
// Sample output: Copied array: 5 10 15 20
public class Question06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] original = new int[size];
        int[] copy = new int[size];
        System.out.print("Enter " + size + " integers: ");
        for (int index = 0; index < size; index++) {
            original[index] = input.nextInt();
            copy[index] = original[index];
        }

        System.out.print("Copied array: ");
        for (int number : copy) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}