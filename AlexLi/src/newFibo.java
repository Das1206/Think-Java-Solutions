/*
 * Programmer: Quan Truong								CSC110AB
 * Assignment: Lab04									Due: Feb. 8, 2017
 * First 12 squares w/o multiplication: 
 * http://stackoverflow.com/questions/32291540/for-loop-printing-squares-without-multiplication
 */


public class newFibo {

	public static void main(String[] args) {
		
		System.out.println("Print 50 to 1 in decreasing order: ");
		doExercise1();
		System.out.println();
		
		System.out.println("Print first 12 squares: ");
		doExercise2();
		System.out.println();
		/*doExercise3();*/
	}

	// find a way to do fibonacci without returning an int
	
	public static int fibonacci(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	//print 50 to 1 in decreasing order
	public static void doExercise1() {
		for (int i = 50; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}
	
	//print first 12 squares
	public static void doExercise2() {
		for (int i = 2; i <= 12; i++) {
			int prev = 0;
			for (int j = 0; j < i; j++) {
				prev += i;
			}
			System.out.print(prev + " ");
		}
	}
}
