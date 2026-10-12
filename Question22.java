import java.util.Scanner;

// Count how many times each distinct value appears in an array.
// Sample input: 6 2 3 2 4 3 2
// (The first number is the array size.)
// Sample output:
// 2 appears 3 time(s)
// 3 appears 2 time(s)
// 4 appears 1 time(s)
public class Question22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = input.nextInt();

        if (size <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] numbers = new int[size];
        boolean[] counted = new boolean[size];
        System.out.print("Enter " + size + " integers: ");
        for (int index = 0; index < size; index++) {
            numbers[index] = input.nextInt();
        }

        for (int index = 0; index < size; index++) {
            if (counted[index]) {
                continue;
            }
            int count = 1;
            for (int next = index + 1; next < size; next++) {
                if (numbers[next] == numbers[index]) {
                    count++;
                    counted[next] = true;
                }
            }
            System.out.println(numbers[index] + " appears " + count + " time(s)");
        }
    }
}