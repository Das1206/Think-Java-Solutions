/**
 * Find the number 12 in an array
 * @author Quan Truong
 *
 */
public class BreakStatement {

	public static void main(String[] args) {

		
		int[] arrayOfInts = {32, 87, 3, 589,
							12, 1076, 2000,
							8, 622, 127 };
		int searchFor = 12;
		
		int i;
		boolean foundIt = false;
		
		//Search through arrayOfInts the same amount of times as there are numbers in arrayOfInts
		for (i =0; i < arrayOfInts.length; i++) {
			//if You find it, break and then continue to next statement
			if (arrayOfInts[i] == searchFor) {
				foundIt = true;
				break;
			}
		}
		
		// If you find it, display that you found it. If you didnt, display that
		// you didn't.
		if (foundIt) {
			System.out.println("Found " + searchFor + " at index " + i);
		} else {
			System.out.println(searchFor + " is not in the array.");
		}

	}

}
