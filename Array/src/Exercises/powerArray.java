/**
 * 8.1 in Think Java Book
 */

package Exercises;

import java.util.Arrays;
import java.util.Random;

public class powerArray {

	public static void main(String[] args) {
		
		
		//Create an array with random 100 random values
		double[] newArray = randomArray(99);

		//Square the entire array and print it.
		System.out.println(powArray(newArray, 2));

	}

	/**
	 * Takes an array and powers it to whatever you want.
	 * @param a
	 * 			The array to be squared.
	 * @param power
	 * 				The power to square a to. 
	 * @return a
	 * 			Returns double array.
	 */
	public static String powArray(double[] a, int power) {

		for (int i = 0; i < a.length; i++) {
			a[i] = Math.pow(a[i], power);
			
		}
		return Arrays.toString(a);
	}
	
	/**
	 * Creates an array full of random values to whatever size you want.
	 * @param size
	 * 				The size of the array.
	 * @return a
	 * 			A double array. 
	 */
	public static double[] randomArray(int size) {
		Random random = new Random();
		double[] a = new double[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
		System.out.println("a[2] = " + a[2]);
		return a;
	}

}
