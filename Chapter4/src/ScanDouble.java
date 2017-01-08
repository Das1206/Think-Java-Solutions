import java.util.Scanner;

public class ScanDouble {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		if (!in.hasNextDouble()) {
			String word = in.next();
			System.err.println(word + " is not a number.");
			return;
		}
		double x = in.nextDouble();
		printLogarithm(x);
	}
	public static void printLogarithm(double x) {
		if (x <= 0.0) {
			System.err.println("Error: x must be positive.");
			return;
		}
		double result = Math.log(x);
		System.out.println("The log of x is " + result);
	}
}

