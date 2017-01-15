import java.util.*;

public class HasNext {
	public static void main(String[] args) {

		   String s = "Hello World! 3 + 3.0 = 6 ";
		   double d= 1.3985;
		   s=s+d;

		   // create a new scanner with the specified String Object
		   Scanner scanner = new Scanner(s);

		   // assign locale as US to recognize double numbers in a string
		   scanner.useLocale(Locale.US);
		      
		   while (scanner.hasNext()) {
		   // check if the scanner's next token is a double
		   System.out.println("" + scanner.hasNextDouble());

		   // print what is scanned
		   System.out.println("" + scanner.next());
		   }

		   // close the scanner
		   scanner.close();
		   
		   }
}
