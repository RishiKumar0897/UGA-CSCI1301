import java.util.Scanner;
public class Factorial1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer. Enter a negative integer to exit");
		int n = scan.nextInt();
		if (n < 0) {
			System.exit(1);
		}
		long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
		
		System.out.println(result);
	}
}
