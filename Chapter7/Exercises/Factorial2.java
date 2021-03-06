
package Exercises;
/**
 * Exercise 7-5 of think Java, page 101/ Uses factorial method from page 79
 * Infinite series expansion problem. Except this version is not in the book, I just did it to learn.
 * This method subtracts the sum of the negative exponent terms.
 * Problem can be seen @ 10:20 https://www.youtube.com/watch?v=APVhIIN4zJ8&t=488s&index=4&list=PL1-d6QAReJzTcUUF0HoJ_I-yoX05g1Q2U.
 * 
 * 
 * @author Quan Truong
 *
 */
public class Factorial2 {

	public static void main(String[] args) {
		check(1);
		System.out.println(Math.exp(1));

	}

	public static double myexp(double x, int n) {
		System.out.println("No. of terms to be added in the " + "series e ^ " + x + ": " + n);
		// declarations for the loop
		double ansX = x;
		double ans = (1 + x);
		int i = 2;
		double denom = 1;
		while (i <= n && i % 2 == 0) {
			ansX = ansX * x;
			denom = denom * i;
			ans = ans + ansX / denom;
			i = i + 1;
		} if (i <= n && i % 2 != 0) {
			ansX = ansX * x;
			denom = denom * i;
			ans = ans - ansX / denom;
			i = i + 1;
		}
		return ans;
	}
	
	public static void check(double x) {
		int n = 90;
		System.out.println(x + "\t" + Math.exp(x) + "\t" + myexp(x,n));
	}

	// i counts down starting from (x-1)
	public static double factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);

	}

}
