/**
 * Exercise 2-3 #6 of Think Java 2016.
 * @author Quan Truong
 *
 */
import java.util.*;

/**
 * 6. Change the values of hour, minute, and second to reflect the current time. Then write code to compute the elapsed time
 * since you started working on this exercise.
 */
public class elapsedTime {

	public static void main(String[] args) {
		int hour, minute, second;
		
		//The time you started working on this project on.
		hour = 15;
		minute = 30;
		second = 0;
		
		//Retrieve parameters for current time
		int currentHours, currentMinutes, currentSeconds;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the current hours: ");
		currentHours = in.nextInt();
		System.out.println("Enter the current minutes: ");
		currentMinutes = in.nextInt();
		System.out.println("Enter the current seconds");
		currentSeconds = in.nextInt();
		in.close();
		

		
		//Take the startTime and minus it from currentTime to get the elapsed time it took to complete the project
		int startTime = ( (hour * 60) * 60 ) + (minute * 60) + second; 
		int currentTime = ( (currentHours * 60) * 60) + (currentMinutes * 60) + currentSeconds;
		
		System.out.println(currentTime - startTime);

	}

}
