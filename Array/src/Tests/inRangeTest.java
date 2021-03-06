package Tests;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Just created this to test my knowledge.. Testing random numbers again and
 * inRange method.
 * 
 * @author Quan Truong Jan 5, 2017 3:30:30 AM
 */

public class inRangeTest {

	public static void main(String[] args) {
		// Create the random array
		int[] array = randomArray(100);

		System.out.println(Arrays.toString(inRangeEfficient(array)));
	}

	/**
	 * Returns an integer array full of random values
	 * 
	 * @param size
	 *            Specifies the size of the array.
	 * @return An array full of random values to the specified size.
	 */
	public static int[] randomArray(int size) {
		// create an array specified to size
		int[] a = new int[size];

		// assign random numbers to elements in the above array
		Random random = new Random();
		for (int i = 0; i < size; i++) {
			// 100 is inclusive
			a[i] = random.nextInt(100);
		}
		// return the array, that is now filled with random numbers
		return a;
	}

	/**
	 * Returns the amount of times an element falls in between low and high in
	 * an array.
	 * 
	 * @param arr
	 *            The array to be searched.
	 * @param low
	 *            Lowest point to be searched, this number will be included.
	 * @param high
	 *            Highest point to be searched, this number will be included.
	 * @return The amount of times an element between low and high shows up in
	 *         arr[].
	 */

	public static int inRange(int[] arr, int low, int high) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= low && arr[i] <= high) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Returns an array that tells
	 * 
	 * @param scores
	 * @return
	 */
	public static int[] inRangeEfficient(int[] scores) {

		// Initialize an array with 100 values (
		int[] counts = new int[100];

		for (int i = 0; i < scores.length; i++) {
			int index = scores[i];
			counts[index]++;
			// This next line shows the value, how many times it shows up, and at what index of counts. 
			//Come back to format this line properly...
			System.out.println(scores[i] + " shows up this many times " + counts[scores[i]] + " at " + "counts[" + index + "]");

		}
		


		return counts;

	}

}
