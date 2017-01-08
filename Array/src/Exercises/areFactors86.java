package Exercises;

/**
 * Exercise 8-6 from ThinkJava.
 * 
 * 1. Write a method named areFactors that takes an integer n and an array of
 * integers, and that returns true if the nubers in the array are all factors of
 * n (which is to say that n is divisible by all of them).
 * 
 * @author Quan Truong Jan 5, 2017 2:39:32 AM
 */

public class areFactors86 {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 10, 12 };

		System.out.println(areFactors(2, a));
	}

	/**
	 * Checks to see if every element of array[] is divisible by n. If they are
	 * all divisible, return true. Otherwise, return false.
	 * 
	 * @param n
	 *            Divisor.
	 * @param array
	 *            The array whose elements will be checked.
	 * @return True if all elements of array[] are divisible by n, otherwise
	 *         false.
	 */

	public static boolean areFactors(int n, int[] array) {
		boolean divisible = false;

		for (int i = 0; i < array.length; i++) {

			if (array[i] % n == 0) {
				divisible = true;

			} else {
				divisible = false;

			}
		}
		return divisible;
	}

}
