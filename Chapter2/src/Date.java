/**
 * Exercise 2-2 of the book Think Java, paperback, 2016 version.
 * @author Quan Truong
 *
 */



public class Date {

	
	
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
