/**
 * Auto Generated Java Class.
 * Found this. Most people seem to agree that using an extra method to check the numbers is pointless. Highest voted answer used the while(true) method.
 * http://stackoverflow.com/questions/22110876/creating-a-guessing-game
 */

import java.util.*;

public class GuessNumberGame {

	public static void main(String[] args) {
		int userValue, computerValue, numberOfTries;
		Random random = new Random();
		Scanner in = new Scanner(System.in);

		// Ask user for input
		while (true) {
			computerValue = random.nextInt(100) + 1;
			numberOfTries = 0;
			while (true) {
				System.out.println("Enter an integer between 1 and 100: ");
				userValue = in.nextInt();
				numberOfTries++;
				if (userValue == computerValue) {
					System.out
							.println("Congrats, you won! Your number of tries was: "
									+ numberOfTries);
					return;
				} else if (userValue < computerValue) {
					System.out.println("Your value is too small.");
				} else if (userValue > computerValue) {
					System.out.println("Your guess was too high!");
				}
			}
		}
	}
}
