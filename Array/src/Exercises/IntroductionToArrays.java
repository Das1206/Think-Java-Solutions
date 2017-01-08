package Exercises;

/**
 * Introduction to arrays. Bucky's video https://www.youtube.com/watch?v=L06uGnF4IpY
 * @author Quan Truong
 *
 */
public class IntroductionToArrays {

	public static void main(String[] args) {
	
	
		//Call the index of an array in another method
		System.out.println(arrayIndex1(9));
		
		

	}
	

	/**
	 * Pull the value of an index in arrayIndex1.
	 * This is one way to create an index.
	 * @param x The index number to pull.
	 * @return Integer value.
	 */
	
	public static int arrayIndex1(int x) {
		
		
		//Create the array. Must give it a type and set the amount of entries it will have.
		int quanxhi[] = new int[10]; 

		//the number inside the [n] is called the index
		quanxhi[0]=87;
		quanxhi[1]=54;
		quanxhi[9]=9;
		
		//takes the input (x) and returns the xth index of quanxchi
		return quanxhi[x];
	}
	
	/**
	 * Return the value of an index in arrayIndex2.
	 * This is the array intializer method. 
	 * @param x The index number to pull.
	 * @return Integer value.
	 */
	
	public static int arrayIndex2(int x) {
		
		//"Array initializer" method. This method sets number of items in the array automatically.
		int quanXchi[]={2,4,5,6,7,8,9,16,32,72,36};
		
		
		
		return quanXchi[x];
	}

}

