package Exercises;

public class isAbcedarian {

	public static void main(String[] args) {
		String name = "Quan Minh Truong";
		
		String s = "abcdef";
		
		System.out.println(isAbcRec(s, 'a'));
		System.out.println(isAbcdearian(s));
		
		System.out.println(name.charAt(0));

	}

	
/**
 * Recursive abcedarian method
 * @param s
 * @param c
 * @return
 */
	public static boolean isAbcRec(String s, char c) {
		if (s.isEmpty()) 
			return true;
		else if (c > s.charAt(0)) {
			return false;
		} else {
		
		
		return isAbcRec(s.substring(1), s.charAt(0));
		}
	}
	
public static boolean isAbcdearian(String s) {
    int index = 0;
    char c = 'a'; 
    while (index < s.length()) {
            if (c > s.charAt(index)) {
                    return false;
            }
            
            //if this came after next line, it would cause the index to be out of bounds
            c = s.charAt(index); 
            index = index + 1;
           
            
            
    }
    return true;
}
}
	/*public static boolean isAbcedarian(String s) {
		char[] array = s.toCharArray();
		
		int index = 0;
		for (char c = 'a'; c<= 'z'; c++) {
			
			
		}
		
		return true;
	}
}*/
