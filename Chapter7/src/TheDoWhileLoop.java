import java.util.Scanner;

public class TheDoWhileLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean okay;
		
		do {
			//Must ask for the input first
			System.out.println("Enter a number: ");
			//Then input is checked to see if it's a double
			if (in.hasNextDouble()) {
				okay = true;
				System.out.println("That was definitely a number.");
			} else {
				okay = false;
				String word = in.nextLine();
				System.err.println(word + " is definitely not a number.");
			}
			//do all this while okay is false
		} while (!okay);
	}
}
