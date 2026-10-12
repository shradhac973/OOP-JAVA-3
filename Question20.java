import java.util.Scanner;

// Store and display marks when each student takes a different number of subjects.
// Sample input: 2 2 80 90 3 70 75 85
// (Student count, then each student's subject count and marks.)
// Sample output:
// Student 1 marks: 80 90
// Student 2 marks: 70 75 85
public class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentCount = input.nextInt();

        if (studentCount <= 0) {
            System.out.println("Student count must be positive.");
            return;
        }

        int[][] marks = new int[studentCount][];
        for (int student = 0; student < studentCount; student++) {
            System.out.print("Enter subject count for student " + (student + 1) + ": ");
            int subjectCount = input.nextInt();
            if (subjectCount < 0) {
                System.out.println("Subject count cannot be negative.");
                return;
            }
            marks[student] = new int[subjectCount];
            System.out.print("Enter the marks: ");
            for (int subject = 0; subject < subjectCount; subject++) {
                marks[student][subject] = input.nextInt();
            }
        }

        for (int student = 0; student < marks.length; student++) {
            System.out.print("Student " + (student + 1) + " marks: ");
            for (int mark : marks[student]) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
    }
}