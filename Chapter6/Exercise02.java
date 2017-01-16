/**
 * Exercise 6-2 of Think Java, 2016.
 * 
 * @author Quan Truong
 *
 */
public class Exercise02 {

	public static void main(String[] args) {
		divisible(9, 2);
	}

	/**
	 * Calculates whether x is perfectly divisible, as in returns no remainder,
	 * by y
	 * 
	 * Returns true if perfectly divisible, as defined by not returning a
	 * remainder. Otherwise returns false.
	 * 
	 * @param x
	 *            Number to be divided
	 * @param y
	 *            The divisor
	 * @return Boolean value.
	 */
	public static boolean divisible(double x, double y) {
		if (x % y == 0) {
			System.out.println(x + " is divisible by " + y);
			return true;
		} else {
			System.out.println(x + " is not divisible by " + y);
			return false;
		}
	}

	/**
	 * Calculates whether three lengths are a triangle.
	 * 
	 * Returns true if the lengths a, b, and c are able to make a triangle.
	 * Otherwise, return false.
	 * 
	 * @param a
	 *            First length of the triangle.
	 * @param b
	 *            Second length of the triangle.
	 * @param c
	 *            Third length of the triangle.
	 * @return Boolean value.
	 */
	public static boolean isTriangle(int a, int b, int c) {
		if ((a > (b + c)) || (b > (a + c)) || (c > (a + b))) {
			System.out.println("This cannot be a triangle.");
			return false;
		} else {
			System.out.println("This can be a triangle.");
			return true;
		}
	}

}
