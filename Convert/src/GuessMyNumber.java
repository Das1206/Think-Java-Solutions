import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
	
	public static void printTwice(String s){
		System.out.println(s);
		System.out.println(s);
	}
	
	public static void main(String[] args){
		int userGuess, number;
		//pick a random number using java.util.Random
		Random random = new Random();
		number = random.nextInt(100);
		Scanner in = new Scanner(System.in);
		
		//Ask user for input
		System.out.println("I'm thinking of a number between 1 and 100 (including both). \n"
				+ "Can you guess what it is?");
		System.out.println("Type a number: ");
		userGuess = in.nextInt();
		System.out.println("Your guess is: " + userGuess);
		System.out.println("The number I was thinking was " + number);
		
		//Calculates difference with Math.abs, an absolute value tool
		System.out.println("You were off by " + Math.abs(number - userGuess));
		
		//Compare userInput with number - Note: Use == instead of .equals() for primitive values
		if (userGuess == number) {
			System.out.println("Your guess was correct!");
		} else if (userGuess != number) {
			System.out.println("Your guess was incorrect!");
		}
		
		System.out.println(Math.log(Math.exp(10)));
	}

}
