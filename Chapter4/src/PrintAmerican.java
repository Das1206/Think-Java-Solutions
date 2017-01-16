/**
 * Exercise 4-3 of Think Java, 2016.
 * 
 * Encapsulate the exercise from 2-2 into it's own method. The method should take 4 parameters:
 * A String for the day, e.g. "Friday"; A integer value for the date, i.e. 12; a String for the month,
 *  e.g. "December"; and a Integer value for the year, e.g. 1950.
 * 
 * @author Quan Truong
 *
 */
public class PrintAmerican {
	
	/**
	 * Print the date in American format.
	 * @param date
	 * 				Integer value, date of the current day, e.g. 12
	 * @param month
	 * 				String, the month of the year, e.g. "February".
	 * @param year
	 * 				Integer value, the year, e.g. 1992.
	 */
	public static void printAmerican(String day, int date, String month, int year) {
		System.out.println("American Format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println();
		
	}
	
	/**
	 * Print the date in European format.
	 * @param date
	 * 				Integer value, date of the current day, e.g. 12
	 * @param month
	 * 				String, the month of the year, e.g. "February".
	 * @param year
	 * 				Integer value, the year, e.g. 1992.
	 */
	public static void printEuropean(String day, int date, String month, int year){
		System.out.println("The date in EU format: ");
		System.out.println(day + " " + date + " " + month + " " + year);
		System.out.println();
	}
	
	public static void main(String[] args) {
		printAmerican("Friday", 19, "December", 2016);
		printEuropean("Friday", 19, "December", 2016);
		
	}
	
	
	
	
}
