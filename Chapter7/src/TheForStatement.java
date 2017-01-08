/**
 * Builds a triangular multiplication table.
 * From page 96 of Think Java, 2016 Version.
 * @author Quan Truong
 *
 */

public class TheForStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printTable(6);
	}

	public static void printTable(int rows) {
//	public static void printTable(int rows, int cols) { //use this line if you want to specify the amount of columns
		//For loop parameters: (initializer; condition; update). Initializer only exists within the for loop. While loop can have the initializer exist outside the scope.
		
		//Keep looping until i reaches rows
		for (int i = 1; i <= rows; ++i) {
			printRow(i, i);
//			printRow(i, cols); //use this line if you want to specify the amount of columns
		}

	}

	public static void printRow(int n, int cols) {
		// Print the multiples of 2
		int i = 1;
		
		//keep looping until i reaches cols 
		while (i <= cols) {

			// System.out.printf("%4d", 2 * i); This was changed to n. Now
			// instead of just displaying multiples of 2 we can choose any
			// integer we want. This is called generalization.
			// Display the multiples of n 6 times
			System.out.printf("%4d", n * i);
			i = i + 1;
		}
		System.out.println();
	}

}
