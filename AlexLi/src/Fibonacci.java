/**
 * Finish prologue...
 * Programmer: Quan Truong					CSC110AB <12:00 - 12:50 PM>
 * 											
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
 doExercise1();
 
 doExercise2();
 
 /*doExercise3();*/
 
		// print first 12 numbers of the fibonacci sequence
		for (int i = 1; i <= 12; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}

	public static int fibonacci(int n) {
		if (n <= 2) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	
	public static void doExercise1() {
		for (int i = 50; i >= 1; i--){
			System.out.print(i + " ");
		}
		
	}

	public static void doExercise2() {
		for (int i = 1; i <= 10; i++) {
			double result = (int) Math.pow(i, 2);
			System.out.println(result);
		}
	}
}
