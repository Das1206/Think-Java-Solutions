/**
 * Exercise 6-9 of Think Java, 2016.
 * 
 * @author Quan Truong
 */

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		double x;
		int n;
		
		// Ask for user input
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a double number: ");
		x = in.nextDouble();
		System.out.println("Enter an integer number: ");
		n = in.nextInt();
		in.close();
		
		//print the result
		System.out.println(power(x, n));
	}

	/**
	 * Takes base x and powers it to n.
	 * 
	 * Returns the sum of x^(n)
	 * @param x
	 * 			The base.
	 * @param n
	 * 			The power.
	 * @return
	 * 			The sum of x^(n)
	 */
	public static double power(double x, int n) {
		//Base case: If n is equal to 0 return 1. 
		if (n == 0) {
			return 1;
			//if n is greater than 0, perform function
		} else if (n > 0) {
			return x * power(x, n - 1);
			
		} else if (n % 2 == 0){
			//If n is even, then this line is more efficient
			return Math.pow(Math.pow(x, n/2),2);
			
		}
		else {
			//if n is smaller than 0, inverse the function.
			return 1.0 / x * power(1.0 / x, -n - 1);
		}
		
		
	}
}
