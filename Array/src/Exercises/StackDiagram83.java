package Exercises;

import java.util.Arrays;

public class StackDiagram83 {

	
	
	/**
	 * Create an array of a specified size with the value beginning from 1 starting from index 0.
	 * @param n The size of the array
	 * @return Return the array
	 */
	public static int[] make(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}
		
		return a;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] bob = make(5);
		dub(bob);
		System.out.println(mus(bob));

	}
	
	/** Returns the sum of all elements of the array.
	 * Adds all the elements of zoo together.
	 * @param zoo The array to be added together.
	 * @return The sum of all elements of the array.
	 */
	public static int mus(int[] zoo) {
		int fus = 0;
		for (int i = 0; i< zoo.length; i++) {
			fus += zoo[i];
		}
		return fus;
	}
	
	//Multiply every indice's value by 2 and assign that value to the same index
	public static void dub(int[] jub) {
		for (int i = 0; i < jub.length; i++) {
			jub[i] *= 2;
		}
	}
	


}
