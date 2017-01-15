package Exercises;
import java.util.*;

public class wordup {







	public static void main(String[] args) {

		String s = "3.0 6.0 9.0";
		double d = 1.42;

		//inherits type "double"
		s = s +d;

		Scanner sys = new Scanner(s);

		//assign a locale to recognize double numbers in a string
		sys.useLocale(Locale.US);

		while (sys.hasNext()) {
			//checks to see if the scanner's next token is a double..
			//hasNextDouble() returns a boolean alue
			System.out.println("" + sys.hasNextDouble());

			//print what is scanned
			//.next() returns String
			System.out.println("" + sys.next());

		}

	}
}