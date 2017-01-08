
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(4));
		
	}
	
	public static int factorial(int n) {
		return fact(n, n);
	}
	
	public static int fact(int n, int result) {
		if (n==0) return 1;
		return fact(n-1, n*result);
	}

}
