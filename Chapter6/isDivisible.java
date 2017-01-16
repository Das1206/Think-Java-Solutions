

public class isDivisible {
	
	public static void main(String[] args) {
		divisible(9, 2);
	}
	
	public static boolean divisible(double x, double y) {
		if (x % y == 0) {
			System.out.println(x + " is divisible by " + y);
			return true;
		} else {
			System.out.println( x + " is not divisible by " + y);
			return false;
		}
	}
	
	public static boolean isTriangle(int a, int b, int c) {
		if ( (a > (b+c)) || (b > (a+c)) || (c > (a+b)) ) {
			System.out.println("This cannot be a triangle.");
			return false;
		} else {
			System.out.println("This can be a triangle.");
			return true;
		}
	}

}
