/**
 * Exercise 3-4 of Think Java, 2016.
 * Guess the number game, non-recursive.
 * @author Quan Truong
 */

import java.util.*;

public class GuessNumberGame1 {

	public static void main(String[] args) {
		int userGuess, computerValue, difference;
		Scanner in = new Scanner(System.in);
		
		
		//Generate computer value
		Random random = new Random();
		computerValue = random.nextInt(100) + 1;
		
		
		//Ask for user input
		System.out.println("I am thinking of a number between 1-100. Enter your guess: ");
		userGuess = in.nextInt();

		//If the user's guess doesn't equal the computer value, print the difference and tell the user his luck ran short
		if (userGuess != computerValue) {
			difference = Math.abs(userGuess - computerValue);
			System.out.println("Your guess was wrong by " + difference + ".");
			userGuess = in.nextInt();
		} else if (userGuess == computerValue) {
			System.out.println("Your guess was correct");
		}
		
	}

}
