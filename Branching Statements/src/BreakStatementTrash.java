public class BreakStatementTrash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create int array
		int[] arrayOfInts = { 2, 4, 6, 8, 10, 12, 21, 19, 22, 6 };
		// Create search term
		int searchFor = 12;
		// Create loop initializer outside of loop
		int i;

		boolean foundIt = false;

		//If you find searchFor, then set foundIt to true and skip to next statement in code
		for (i = 1; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] == searchFor) {
				foundIt = true;
				break;
			}
			// else {
			// foundIt = false;
			// }
		}

		if (foundIt) {
			System.out.println("Found " + searchFor + " at index " + i);
		} else {
			System.out.println(searchFor + " was not in array");
		}
	}

}
