package Exercises;

/**
 * Exercise 8-8 from Think Java 2016.
 * 
 * Many of the patterns we have seenf or traversing arrays can also be written recursively. It is not common, but it is a useful exercise.
 * 
 * 1. Wrute a method called maxInRange that takes an array of integers and two indexes, lowIndex and highIndex, 
 * and finds the maximum value in the array, but only considering the elements between lowIndex and highIndex, 
 * including both.
 * 
 * The method should be recursive. If the length of the range is 1, that is, if lowIndex == highIndex, 
 * we know immediately that the sole element in the range must be the maximum. So that's the bad case.
 * 
 * If there is more than one element in the range, we can break the array into two pieces, 
 * find the maximum in each of the pieces, and then find the maximum of the maxima.
 * 
 * 2. Methods like maxInRange can be awkward to use. To find the largest element in an array, we have to provide the range for the entire array.
 * 
 * double max = maxInRange(a, 0, a.length-1);
 * 
 * Write a method called max that takes an array and uses maxInRange to find and return the largest element.
 * 
 * @author Quan Truong
 * Jan 5, 2017 2:46:12 AM
 */

public class maxInRange {
	
	public static void main(String[] args) {
		int[] a = {2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
		
		System.out.println("findInRange: " + findInRange(a, 12, 5, 6));
//		System.out.println("max in range: " + maxInRange(a,4,7));
//		System.out.println(max(a));
		
		
		//maxInRange
//		System.out.println(maxInRange(a, 9, 8));
	
	}

	/**
	 * Returns the maximum value of an array in between a lowIndex and a highIndex.
	 * @param arr The array to be searched.
	 * @param lowIndex Low index.
	 * @param highIndex High index.
	 * @return The value of the highest index between lowIndex and highIndex.
	 */
	public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
		//base case
		if (lowIndex == highIndex) {
			return arr[lowIndex];
		} 
//			else {
//			return -1;
//		}
		//break the array into two pieces.
		int midIndex = (lowIndex + highIndex) / 2;
		
		//lower half of index.
		//will reduce until lowIndex == highIndex. int value will round down numbers.
		int val1 = maxInRange(arr, lowIndex, midIndex);

		//higher half of index.
		int val2 = maxInRange(arr, midIndex + 1, highIndex);

		
		//unsure what if does. attempting to create a value1 larger than val2 results in stack overflow @ line 22.
		if (val1 > val2) {
			return val1;
		} else {
			return val2;
		}
	}

	public static int max(int[] arr) {
		//length-1 because .length begins counting from 1. not putting it in will cause ArrayOutOfBounds error
		return maxInRange(arr, 0, arr.length - 1);
	}

	public static int findInRange(int[] arr, int target, int lowIndex, int highIndex) {
		//if lowIndex == highIndex
		if (lowIndex == highIndex) {
			//if the lowIndex == target return lowIndex which is target
			if (arr[lowIndex] == target) {
				return lowIndex;
				//or else return -1 which means it was not found
			} else {
				return -1;
			}
		}

		//divide the array into 2 values
		int midIndex = (lowIndex + highIndex) / 2;
		System.out.println("midIndex: " + midIndex);
		//why is only the bottom part used?
		int val1 = findInRange(arr, target, lowIndex, midIndex);
		System.out.println("val1: " + val1);
		if (val1 >= 0) {
			return val1;
		}
		return findInRange(arr, target, midIndex + 1, highIndex);
	}

	public static int find(int[] arr, int target) {
		return findInRange(arr, target, 0, arr.length - 1);
	}
}
