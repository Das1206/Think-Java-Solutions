package Exercises;
/**
 * Beer bottles exercise #4.3 from Think Java, 2016.
 * @author Quan Truong
 *
 */



public class BeerBottles {
	
	
	/**
	 * Method below uses recursion to keep calling itself until a condition is met. In this case, the condition is n == 0.
	 * @author Quan Truong
	 * Suggested edit @autor Roshini Das
	 */
	public static void bottles(int n){
        
        if (n>0) {


                System.out.println(n-- + "bottles of beer on the wall, " + n-- + " bottles of beer, ya’ take one down, ya’ pass it around," + n + " bottles of beer on the wall.");
                //calls itself again here
                bottles(n - 1);
            }
		//Last verse when n!>0 
        else {
        System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take\n" +
                "one down, ya’ can’t pass it around, ’cause there are no more\n" +
                "bottles of beer on the wall!");
        }

    }
    public static void main(String[] args) {
        bottles(10);
    }
	
	
}
