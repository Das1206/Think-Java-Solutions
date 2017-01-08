package Tests;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] src  = new int[]{1,2,3,4,5};
		int[] dest = new int[5];

		System.arraycopy( src, 0, dest, 0, src.length );
		
		
		System.out.println(Arrays.toString(dest));
	}

}
