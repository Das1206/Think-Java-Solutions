/**
 * Exercise 2-2 #4 & 5 of the book Think Java, 2016 version.
 * 
 * Print the time in American and European format. 
 * 
 * @author Quan Truong
 *
 */


public class AmericanAndEuropeanTime {

	
	public static void main(String[] args) {
		String day = "Thursday";
		String month = "July";
		int date = 16;
		int year = 2016;
		
		//Print the date in American format
		System.out.println("American Format:");
		System.out.println(day +"," + month + " " + date + ", " + year);
		
		//Print the date in European format
		System.out.println("Tomorrow's date in EU format:");
		System.out.println(day + " " + (++date) + " " + month + " " + year);
	}
}
