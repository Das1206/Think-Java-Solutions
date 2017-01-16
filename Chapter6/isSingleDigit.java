import java.util.Scanner;

public class isSingleDigit {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		//Ask for user input
		System.out.println("Enter a number to see if it's a single digit: ");
		int n = in.nextInt(); 
		
		System.out.println(isSingleDigit(n));
		
		
		

	}

	public static boolean isSingleDigit(int n) {
		if (n > -10 && n < 10) 
			return true;
		else
			return false;
	}
}
