/**
 * 1. Encapsulate the method printRow into it's own method. 2. Use
 * generalization to change the constant 2 to n. This allows us to generate the
 * output of a chosen value instead of just 2.
 * 
 * @author qmtru
 * 
 */
public class EncapsulationAndGeneralization {

	public static void main(String[] args) {
		printTable(14);
	}

	public static void printTable(int rows) {
		int i = 1;
		while (i <= rows) {
			printRow(i, i);
			i = i + 1;
		}
	}

	public static void printRow(int n, int cols) {
		// Print the multiples of 2
		int i = 1;
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

	public static void printRow1(int n, int cols) {
		int i = 1;
		while (i <= cols) {
			System.out.printf("4%d", n * i);
			i = i + 1;
		}
		System.out.println();
	}
}
