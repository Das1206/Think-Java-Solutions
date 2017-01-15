
public class Test1 {

	public static void main(String[] args) {
		
		//Create a char array[26] and add all letters to it using an index
		
		char[] array = new char[26]; // char array
		int index = 0; //to assign current char to index
		
		for (char c = 'a'; c <= 'z'; c++) {
			array[index++] = c;
		}
		
		String result = new String(array);
		
		System.out.println(result);
/*
		// Create a char array of 26 characters.
		// ... Add all letters to it.
		char[] array = new char[26];
		int index = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			array[index++] = c;
		}
		String result = new String(array); // Convert to a string.
*/		// ... Display parts of our new string.
		
		//returns boolean value
		System.out.println(result.startsWith("abc"));
		//returns int
		System.out.println(result.length());
		//returns string
		System.out.println(result);
	}
	
	public static void traverseArray(String name) {
		
		
		
		
	}

}
