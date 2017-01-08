/**
 * Create an iterative loop that takes double x and int n and powers x to the power of n.
 * 
 * Used while loop to begin at i = 1, then count upwards until i reaches n.
 */


package Exercises;


public class iterativePower {

	public static void main(String[] args) {
		iterativePower(2, 3);
	}

	public static void iterativePower(double x, int n) {
		double ans = 1;
		int i = 1;

		//ans receives new value each iteration. Beginning with x * 1 = ans. 
		//Then ans * x (exponent two. Then ans * x (exponent three).
		while (i <= n) {
			ans = ans * x;
			i = i + 1;
		}

		System.out.println(ans);
	}

}