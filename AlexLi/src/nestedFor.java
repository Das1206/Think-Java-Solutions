
public class nestedFor {

	public static void main(String[] args) {
		
		
	for (int i = 1; i <= 5; i++) {
		for (int k = 1; k <= 10; k++){
			System.out.print("*");
		}
		System.out.println();
	}
	
	//prints right triangle made of asterisks
	for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	
	
	
	/*
	 * ....1
	 * ...2
	 * ..3
	 * .4
	 * 5
	 * 
	 */
	
	for (int i=1; i<=5; i++) {
		//print dots
		for (int j = 1; j <= 5-i; j++) {
			System.out.print(".");
		}
		System.out.println(i);
	}

	}

}
