package StringTraversal;

public class TraverseThruArrau {

	public static void main(String[] args) {
		String name = "Quan Minh Truong Minh ";
		
		// p: traverse through an array with an enchanced for loop
				

	}
	
	
		/**
		 * Prints the count and character of everye element in an array.
		 * @param name
		 * 				The name of the string to be traversed.
		 */
		public static void traverseArray(String name) {
			
			for (int count = 1; count < name.length(); count++) {
				for (char i : name.toCharArray()) {
					System.out.print("letter[" + count + "]" + i + " ");
					count++;
				}
			}
		}

}
