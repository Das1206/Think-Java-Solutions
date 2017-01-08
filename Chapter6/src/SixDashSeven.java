import java.util.Scanner;

/**
 * Enter an odd number, then display all odd numbers from 1 through n. 
 * @author Quan Truong
 *
 */
public class SixDashSeven {

	public static void main(String[] args) {
		System.out.println(oddSum(2));
	}
/**
 * 
 * @param n user input number.
 * @return An integer value named oddSum. 
 */
	public static int oddSum(int n) {
		int oddSum = 0;
		// Ask for user's input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an odd number: ");
		n = in.nextInt();
		in.close();

		/*Find out if the number is odd, and if it is print out all the odd numbers up until that number
		and add the values to oddSum
		*/
		if (n % 2 != 0) {
			System.out.println(n + " is odd so I'll tell you the sum of all numbers leading up to it.");
			for (int i = 1; i <= n; i += 2) {
				oddSum += i;
				System.out.println(i);
			}
		}
		System.out.println("The sum of all odd numbers up to " + n + " is " + oddSum);
		return oddSum;
	}

}
