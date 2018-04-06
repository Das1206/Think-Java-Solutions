/**
 * Exercise 3-4 of Think Java, 2016.
 * A recursive Guess The Number Game. 
 * Feel free to make improvements!
 * @author Quan Truong
 */

import java.util.*;

public class GuessNumberGameRecursion {

	// Generate computer value
	public static Random r = new Random();
	public static final int MAX_GUESS = r.nextInt(100) + 1;


	//create a class constant for 100 in computerValue variable




	public static void main(String[] args) {
		int userValue;



		// Ask for user input
		Scanner in = new Scanner(System.in);
		System.out.println("I am thinking of a number between 1 and 100.");
		System.out.println("Type your guess: ");
		userValue = in.nextInt();

		// Display user's guess, computer's guess, and the difference
		
		System.out.println("Your guess is: " + userValue);
		System.out.println("You were off by " + Math.abs(userValue - MAX_GUESS));

		// Check difference
		isEqual(userValue, MAX_GUESS);
	}

	public static void isEqual(int userValue, int MAX_GUESS) {
		Scanner in = new Scanner(System.in);
		while (userValue != MAX_GUESS) {
			if (userValue < MAX_GUESS) {
				System.out.println("Too low! Enter another number: ");
				userValue = in.nextInt();
			} else if (userValue > MAX_GUESS) {
				System.out.println("Too high! Enter another number: ");
				userValue = in.nextInt();
			} 
		
		}
		
		if (userValue == MAX_GUESS) {
				System.out.println("You got it right! Give yourself a pat on the back!");
		}
	}
}
