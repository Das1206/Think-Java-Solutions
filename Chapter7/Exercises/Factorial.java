package Exercises;
/**
 * Exercise 7-5 of Think Java, 2016.
 * 
 * Infinite series expansion problem.
 * 
 * DENOM: The book begins using factorial as the denominator of the terms, but it is changed to (denom*i)
 * which accomplishes the same thing. AFAIK, it's also less memory intensive.
 * 
 * Math.pow: The use of Math.pow is replaced by x multiplied by itself (using ansX as x), 
 * which accomplishes the same thing.
 *
 * 
 * First 2 terms of equation: The first two terms of the equation added together is simply (1 + x/1), 
 * which can be simplified to (1 + x). This is why the loop begins at 2, i.e. int i is initialized at 2.
 * 
 * @author Quan Truong
 *
 */
public class Factorial {

	public static void main(String[] args) {
		
		/*System.out.println(gaussian(3,2));
		
		System.out.println("Gauss(3,7) equals " + gaussian(3,7) + " but does it equal " + (1 - (3*3) + (-1*(387420489/153400)))      );

		System.out.println(myexp(3,4));*/
		
		check(1.0);
		
		//check myexp with values: -0.1, -1.0, -10.0, -100.0
		for (double i = -1.0; i >= -100.0; i = i * 10.0) {
			System.out.println(myexp(i, 4));
		}
	}

	/**
	 * 
	 * @param x Double value. The exponent of Euler's number (which is Math.exp).
	 * @param accuracy Integer value. The higher this goes, the higher the accuracy of myexp(x)
	 * to Math.exp(x)
	 * @return Returns variable 'ans'. Double value.
	 */
	
	public static double myexp(double x, int accuracy) {
		System.out.println("No. of terms to be added in the " + "series e ^ " + x + ": " + accuracy);
		// declarations for the loop
		double ansX = x;
		double ans = (1 + x); //accounts for first 2 terms
		int i = 2; //since we skipped first 2 terms we start at 2nd index
		double denom = 1;
		while (i <= accuracy) {
			ansX = ansX * x;
			denom = denom * i; //starts at 2.. as this increases it will match factorial of n
			ans = ans + ansX / denom; 
			i = i + 1;
		}
		return ans;
	}
	
	/**
	 * Checks the accuracy of Math.exp(x) and myexp(x).
	 * 
	 * Insert x to check for Math.exp(x) against your myexp(x,90). Once again, accuracy is set to 90.
	 * The numbers will be the same up to .10^14 (which is pretty accurate)
	 * @param x Double value. The exponent of Euler's number to be checked.
	 */
	public static void check(double x) {
		int accuracy = 4;
		System.out.println(x + "\t" + myexp(x,accuracy) + Math.exp(x) + "\t");
	}

	
	/**
	 * This method would have taken erased the 'denom' variable completely, and fact(i) would have
	 * taken its place in the 'ans' variable. 
	 * @param n Integer value. Factorial of n will be returned. 
	 * @return Returns value of 1 if n is 0. Returns factorial of n if n is not equal to 0.
	 */
	public static double factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);

	}
	
	/**
	 * 
	 * @param x Number to be checked
	 * @param accuracy Amount of accuracy
	 * @return double value.
	 */
	public static double gaussian(double x, int accuracy) {
		
			System.out.println("No. of terms to be added in the " + "series e ^ " + x + ": " + accuracy);
			// declarations for the loop
			double ansX = x*x;
			double ans = 0;
			double sign = -1;
			int i = 2;
			double denom = 1;
			while (i <= accuracy) {
				sign = sign * -1;
				ansX = ansX * x * x; //x^2...x^4...x^6
				denom = denom * i; //factorial
				ans = ans + sign * ansX / denom;
				i = i + 1;
			}
			//1 - x^2 + ans
			return (1 - (x*x) + ans);
	}

}
