import java.util.Arrays;

public class MultiDimensionalArray33 {

	public static void main(String[] args) {
		// multi-dimensional array
		int firstArray[][] = { { 8, 9, 10, 12 }, { 12, 13, 14, 15 } };
		// has 3 rows {every bracket is a row}
		// the first brackets is [0][x]
		int secondArray[][] = { { 30, 31, 32, 33 }, { 43 }, { 4, 5, 6 } };

		//Print the 0th row and 2nd column of secondArray
		System.out.print("The element from the 0th row, 2nd column of secondArray is: ");
		accessElement(secondArray, 0, 2);

		
	}

	/**
	 * Returns the element of a 2D array in integer form.
	 * 
	 * @param array
	 *            The 2D integer array to be accessed.
	 * @param row
	 *            The row of the array to be accessed.
	 * @param column
	 *            The column of the array to be accessed.
	 */
	public static void accessElement(int[][] array, int row, int column) {
		System.out.println(array[row][column]);
	}
}
