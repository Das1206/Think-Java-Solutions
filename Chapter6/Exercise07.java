import java.util.Scanner;

/**
 * Exercise 6-7 of Think Java, 2016.
 * 
 * This program checks to see if a number is odd, and prints the sum of all odd numbers leading up to n.
 * 
 * @author Quan Truong
 */

public class Exercise07 {

	public static void main(String[] args) {
		oddSum(4);
	}

	/**
	 * Check if a number is odd. If the number is odd, print the sum of all odd
	 * numbers leading up to n.
	 * 
	 * @param n
	 *            Integer. Check if this value is odd.
	 * @return The sum of all negative integer values leading up to n.
	 */
	public static int oddSum(int n) {
		int oddSum = 0;
		// if the number is odd, print all odd numbers leading up to n and
		// assign sum to oddSum
		if (n % 2 != 0) {
			System.out.println(n + " is odd");
			for (int i = 1; i <= n; i += 2) {
				oddSum += i;
				System.out.print(i + " ");
				System.out.println();
			}
			System.out.println("The sum of all odd numbers up to " + n + " is " + oddSum);
			return oddSum;
		} else {
			System.out.println(n + " is not odd! Keep trying!");
			return oddSum;
		}
		// print sum of odd numbers up to n

	}

}
