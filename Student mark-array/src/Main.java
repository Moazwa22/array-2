import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int N = number.nextInt();
        int[] marks = new int[N];
        int sum = 0, passed = 0, failed = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("For student number (" + (i + 1) + ") mark is: ");
            marks[i] = number.nextInt();
            sum += marks[i];
        }

        int L_Mark = marks[0];
        int H_Mark = marks[0];

        for (int i = 0; i < N; i++) {
            if (marks[i] > H_Mark) {
                H_Mark = marks[i];
            }
            if (marks[i] < L_Mark) {
                L_Mark = marks[i];
            }
            if (marks[i] >= 50) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = (double) sum / N;

        System.out.println("mark of student with index is  : " );
        for (int i = 0; i < N; i++) {
            System.out.println("Student " + (i + 1) + " at index " + i + " has mark: " + marks[i]);
        }

        System.out.println("Average mark : " + average);
        System.out.println("Highest mark : " + H_Mark);
        System.out.println("Lowest mark : " + L_Mark);
        System.out.println("Number of students that passed : " + passed);
        System.out.println("Number of students that failed : " + failed);
    }
}