import java.util.Scanner;

public class ScannerBug {

	public static String upperCaseAllFirst(String value) {
		//Convert string to char array
		char[] array = value.toCharArray();
		
		//Modify first element in array
		array[0] = Character.toUpperCase(array[0]);
		
		//Uppercase all letters after any whitespace
		for (int i = 1; i < array.length; i++) {
			if (Character.isWhitespace(array[i -1 ])) {
				array[i] = Character.toUpperCase(array[i]);
			}
		}
		
		//Return string
		return new String(array);
	}

	public static void main(String[] args) {
		String name;
		int age;
		Scanner inputs = new Scanner(System.in);
		
		//Ask for age
		System.out.println("What is your age?");
		age = inputs.nextInt();
		
		//Ask for name
		System.out.println("What is your name?");
		inputs.nextLine();
		name = inputs.nextLine();
		
		//Output string
		System.out.printf("Hello, " + upperCaseAllFirst(name) + ". Your age is %d.", age);
	}
	
}
	
