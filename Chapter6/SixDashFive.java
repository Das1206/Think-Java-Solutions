/**
 * Exercise 6-6 in ThinkJava, 2016 version.
 * The purpose of this exercise is to determine the output of the program. You can use the flow of execution to help you.
 * @author qmtru
 * @param flag1 is used as boolean for isHoopy(202)
 * @param flag 2 is used as boolean for isFrabjuous(202)
 *
 */

public class SixDashFive {
	
	//Follow the execution of this code to determine the output (hopefully without running the code - you'll learn more).
	public static void main(String[] args) {
		boolean flag1 = isHoopy(202);
		boolean flag2 = isFrabjuous(202);
		System.out.println(flag1);
		System.out.println(flag2);
		if (flag1 && flag2) {
			System.out.println("ping!");
		}
		if (flag1 || flag2) {
			System.out.println("pong!");
		}
	}
	
	/**
	 * 
	 * @param x user input to be checked if perfectly divisible by 2.
	 * @return true if x is perfectly divisible by 2, otherwise returns false.
	 */
	public static boolean isHoopy(int x){
		boolean hoopyFlag;
		if (x % 2 == 0) {
			hoopyFlag = true;
		} else {
			hoopyFlag = false;
		}
		return hoopyFlag;
	}
	
	/**
	 * 
	 * @param x User input to be checked if greater than 0
	 * @return true if x is greater than 0, otherwise return false.
	 */
	public static boolean isFrabjuous(int x) {
		boolean frabjuousFlag;
		if (x > 0) {
			frabjuousFlag = true;
		} else { 
			frabjuousFlag = false;
		}
		return frabjuousFlag;
	}
}
