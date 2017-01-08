
/**
 * Switch statement from newBoston: 
 * Link: https://www.youtube.com/watch?v=8ZuWD2CBjgs&index=13&list=PLFE2CE09D83EE3E28
 * @author Quan Truong
 *
 */

public class SwitchStatement12 {

	public static void main(String[] args) {
		int age;
		age = 7;

		switch (age) {
		case 1:
			System.out.println("You can crawl");
			break;
		case 2:
			System.out.println("You can talk");
			break;

		case 3:
			System.out.println("You can talk and walk");
			break;
		default: 
			System.out.println("I don't know how old you are");
		break;
		}

	}

}


