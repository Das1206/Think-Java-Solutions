import java.util.Scanner;

public class BooleanMethods {
/**
 * User inputs a number to check whether it is single digit or larger.
 * @param args number is the user's input
 */
	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);
		System.out.println("Insert a number to know whether it is small or big: ");
		number = in.nextInt();
		in.close();

		if (isSingleDigit(number)) {
			System.out.println(number + " is small.");
		} else {
			System.out.println(number + " is big.");
		}
	}
	
/**
 * Tests whether x is a single digit integer.
 * @param x the integer to test
 * @return true if x has one digit, false otherwise
 */
	public static boolean isSingleDigit(int x) {
		return (x > -10 && x < 10);
	}
}
