

import java.util.Scanner;


public class BreakAndContinue {

	public static void main(String[] args) {
		scanDouble1();
	}
	
	//Scans a double to check if it is a number.
	public static double scanDouble() {
		Scanner in = new Scanner(System.in);
		boolean okay;

		while (true) {
			// Must ask for the input first
			System.out.println("Enter a number: ");
			//If the input is a double, exit the while loop completely. If not, skip if statement
			if (in.hasNextDouble()) {
				break;
			}
			//Runs if the if statement is not met
			String word = in.nextLine();
			System.err.println(word + " is definitely not a number.");
		}
		double x = in.nextDouble();
		return x;
	}
	
	
	/**
	 * Keep adding positive sums while x (user input) is not equal to 0
	 * @return double value. The sum of all numbers entered.
	 * @param x is set to -1 to keep the loop going
	 */
	public static void scanDouble1() {
		//Ask for user input
		
		Scanner in = new Scanner(System.in);
		int x = -1;
		int sum = 0;
		while (x != 0) {
			System.out.println("Enter an integer: ");
			x = in.nextInt();
			if (x <= 0) {
				//Continue skips an interation, which in CS means a sequence of instructions that can be executed multiple times.
				//this causes the code to "reset" to the beginning of the while loop
				continue;
			}
			
			System.out.print("Adding " + x + " to " + sum);
			sum += x;
			System.out.println(" = " + sum);
		}
	}
}
