import java.util.Scanner;

// Find the second-largest distinct value in an array.
// Sample input: 5 8 3 8 6 2
// (The first number is the array size.)
// Sample output: Second largest: 6
public class Question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        if (size < 2) {
            System.out.println("Enter at least two values.");
            return;
        }

        int largest = 0;
        int secondLargest = 0;
        boolean hasLargest = false;
        boolean hasSecondLargest = false;
        System.out.print("Enter " + size + " integers: ");
        for (int index = 0; index < size; index++) {
            int number = input.nextInt();
            if (!hasLargest || number > largest) {
                if (hasLargest) {
                    secondLargest = largest;
                    hasSecondLargest = true;
                }
                largest = number;
                hasLargest = true;
            } else if (number < largest && (!hasSecondLargest || number > secondLargest)) {
                secondLargest = number;
                hasSecondLargest = true;
            }
        }

        if (hasSecondLargest) {
            System.out.println("Second largest: " + secondLargest);
        } else {
            System.out.println("There is no second-largest distinct value.");
        }
    }
}