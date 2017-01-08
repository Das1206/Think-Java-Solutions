import java.util.Scanner; 

public class ConvertSeconds {
	
	public static void main(String[] args) {
		//Prompt user for inout
		double minutes, seconds;
		int hour, toBeConverted;
		Scanner in = new Scanner(System.in);
		
		//Read an integer from keyboard
		System.out.print("How many secs");
		toBeConverted = in.nextInt();
		
		//Calculate the result
		hour = (toBeConverted / 3600);
//		System.out.println("hour = " + hour);
		
		minutes = (double) (toBeConverted % 3600) / 60;
//		System.out.println("Minutes = " + minutes);
		
		seconds = (double) (minutes % 1) * 60;
//		System.out.println("Seconds = " + seconds);

		//Use printf to display the result
		System.out.printf(toBeConverted + " seconds = " + hour + " hours, %.0f minutes, and %.0f seconds", minutes, seconds);
	
	}
} 
