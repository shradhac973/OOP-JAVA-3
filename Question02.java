import java.util.Scanner;

// Read ten integers and display them in reverse order.
// Sample input: 1 2 3 4 5 6 7 8 9 10
// Sample output: 10 9 8 7 6 5 4 3 2 1
public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten integers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        System.out.print("Reverse order: ");
        for (int index = numbers.length - 1; index >= 0; index--) {
            System.out.print(numbers[index] + " ");
        }
        System.out.println();
    }
}