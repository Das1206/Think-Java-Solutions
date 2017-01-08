package StringTraversal;

public class reverseString {

	public static void main(String[] args) {

		String name1 = "name0";
		String name2 = "namd0";
		
		//if compareTo returns a negative value, then the first value came first alphabetically. Otherwise, second value came first.
		
		int diff = name1.compareTo(name2); //-1 if name1 comes first alphabetically
		
		
		//Determines which name comes first alphabetically 
		if (diff == 0) {
			System.out.println("Names are equal.");
		} else if (diff == -1) {
			System.out.println(diff + " " + name1 + " came first alphabetically before " + name2);
		} else if (diff == 1){
			System.out.println(diff + " " + name2 + " came first alphabetically after " + name1);
		}
		
		String myName = "Quan Truong";
		String yourName = "Quan Nguyen";
		
		int diffOfNames = myName.compareTo(yourName);
		
		System.out.println(" the difference is " + diffOfNames);

	}
	
	

}
