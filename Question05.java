import java.util.Scanner;

// Count even and odd values in an array.
// Sample input: 6 2 5 8 1 4 7
// (The first number is the array size.)
// Sample output: Even: 3, Odd: 3
public class Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;
        System.out.print("Enter " + size + " integers: ");
        for (int index = 0; index < size; index++) {
            int number = input.nextInt();
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even: " + evenCount + ", Odd: " + oddCount);
    }
}