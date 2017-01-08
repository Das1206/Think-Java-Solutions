package Traversals;

/**
 * Reduce the array to a single value. 
 * @author Quan Truong
 *
 */
public class Reduction {

	public static void main(String[] args) {
		
		double[] a = {3,2,4,5};
		
		 
		
		System.out.println(reduce(a));

	}
	
	
	/**
	 * Search how many times an element shows up.
	 * @param a
	 * 			The integer array to search.
	 * @param target
	 * 				The target number to search for.
	 * @return integer value.
	 * 				
	 */
	public static int searchForTarget(double[]a, double target) {
		for (int i=0; i< a.length; i++) {
			int count = 0;
			if (a[i] == target) {
				count++;
				return count;
			}
		}
		return -1;
	}
	
	/**
	 * Add all the elements of an array.
	 * @param a The array of elements to be added together.
	 * @return Sum of all elements in the array, double value.
	 */
	public static double reduce(double[] a) {
		double total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		return total;
		
	}

}
