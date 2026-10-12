import java.util.Scanner;

// Read and display five integers in a one-dimensional array.
// Sample input: 4 8 2 9 1
// Sample output: 4 8 2 9 1
public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.print("Enter five integers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Array elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}