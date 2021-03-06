import java.util.Scanner;

/**
 * This file contains two programs. The first is average, which computes an average of an integer array
 * The second is getNumbers, which collects user-values in an integer array to a specfied size. 
 * 
 * Variable Length Arguments:
 * https://www.youtube.com/watch?v=BFL1oWnEO2k&index=35&list=PLFE2CE09D83EE3E28
 * 
 * 
 * @author Quan Truong
 *
 */
public class VariableLengthArguments35 {

	public static void main(String[] args) {

		// gets average of 12 numbers that you will specify
		System.out.println(average(getNumbers(2)));

		// System.out.println(average(23,423,43,234,324,42,23,234,42,42,34,34,34,34,4,43,34,234,324,4));

	}

	/**
	 * Returns an integer array full of user-input values to a specified size.
	 * @param size
	 * 			  The size of the integer array. Number is not inclusive. 
	 * @return
	 *  		Integer array full of user-input values.
	 */
	public static int[] getNumbers(int size) {
		Scanner in = new Scanner(System.in);
		int[] numbersList = new int[size];

		for (int i = 0; i < numbersList.length; i++) {
			System.out.println("Please enter a number: ");
			numbersList[i] = in.nextInt();
		}

		return numbersList;
	}

	/**
	 * Returns the average of a given array of numbers.
	 * 
	 * @param numbers
	 *               Specify the numbers to average.
	 * @return The average of a given set of number
	 */
	public static int average(int... numbers) {
		int total = 0;

		for (int x : numbers) {
			total += x;
		}

		return total / numbers.length;

	}
}
