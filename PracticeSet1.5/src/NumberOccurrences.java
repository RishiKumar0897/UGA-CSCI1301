import java.util.Scanner;

public class NumberOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the value of n from the user
        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();

        // Create an array to store the occurrences
        int[] occurrences = new int[n + 1];

        // Prompt the user for input and count occurrences
        System.out.println("Enter numbers between 0 and n (inclusive). Enter a number outside this range to stop.");
        while (true) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();

            // Check if the input is within the range [0, n]
            if (input < 0 || input > n) {
                break;
            }

            // Increment the count for the entered number
            occurrences[input]++;
        }

        // Display the occurrences
        System.out.println("Occurrences:");
        for (int i = 0; i <= n; i++) {
            System.out.println("occurrences[" + i + "] = " + occurrences[i]);
        }
    }
}
