/**
 * Exercise 2-2 of the book Think Java, paperback, 2016 version.
 * @author Quan Truong
 *
 */

<<<<<<< HEAD:Chapter2/src/Date.java
public class Date {
=======


public class Date {

	
	
>>>>>>> 56f74f9d04b7a4e667509b81ca057a776acfbac1:Chapter2/src/Date.java
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
