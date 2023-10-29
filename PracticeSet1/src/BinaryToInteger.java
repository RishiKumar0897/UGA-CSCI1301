import java.util.Scanner;

public class BinaryToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary string (1's and 0's): ");
        String binaryString = scanner.nextLine();

        int result = binaryToUnsignedInt(binaryString);

        if (result >= 0) {
            System.out.println("Unsigned integer value: " + result);
        } else {
            System.out.println("Invalid binary string. Please enter a valid binary string.");
        }

        scanner.close();
    }

    public static int binaryToUnsignedInt(String binaryString) {
        int result = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);

            if (c == '0' || c == '1') {
                result = result << 1;
                result |= c - '0'; // Convert character '0' or '1' to integer 0 or 1
            } else {
                return -1; // Invalid binary string
            }
        }

        return result;
    }
}
