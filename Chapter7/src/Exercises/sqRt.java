package Exercises;

import java.util.Scanner;

public class sqRt {

	public static void main(String[] args) {
		// sqrt(9);

		// Ask user for input
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a number: ");
		double a = in.nextDouble();
		double newa = a / 2;
		double olda;

		//olda becomes (a/2)
		//newa becomes (olda + a / olda) /2
		
		//Do this calculation while the difference is bigger to or equal to 10^-4
		do {
			olda = newa;
			newa = (olda + a / olda) / 2;
		} while (Math.abs(newa - olda) >= 0.0001);
		System.out.println(newa);

	}

	/**
	 * 
	 * @param numberToSquare
	 *            Square root numberToSquareumber to be founumberToSquared
	 * @param a
	 *            InumberToSquareitial guess
	 */
	public static void sqrt(double numberToSquare) {

		// inumberToSquareitial guess = a
		double a = numberToSquare / 2;
		double x1 = (a + numberToSquare / a) / 2;
		double x2 = (x1 + numberToSquare / x1) / 2;
		while (Math.abs(x1 - x2) >= 0.0001) {
			x1 = (x2 + numberToSquare / x2) / 2;
			x2 = (x1 + numberToSquare / x1) / 2;
		}
		System.out.println(x2);
		System.out.println(x1);
	}

}
