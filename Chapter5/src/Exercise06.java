/**
 * Exercise 5-6 of Think Java, 2016.
 * 
 * Follow the flow of execution and figure out the output of this program.
 * 
 * @author Quan Truong
 *
 */
public class Exercise06 {

	public static void main(String[] args) {
		zippo("rattle", 13);

	}
	
	public static void baffle(String blimp) {
		System.out.println(blimp);
		zippo("ping", -5);
	}
	
	public static void zippo(String quince, int flag) {
		if (flag < 0) {
			System.out.println(quince + " zoop");
		} else {
			System.out.println("ik");
			baffle(quince);
			System.out.println("boo-wa-ha-ha");
		}
	}

}
