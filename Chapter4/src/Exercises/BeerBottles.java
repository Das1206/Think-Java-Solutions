package Exercises;
/**
 * Beer bottles exercise #4.3 from Think Java, 2016.
 * @author Quan Truong
 *
 */




    public static void bottles(int n){
        //first verse only
        if (n>0) {

                if (n==1) {
                    System.out.println(n-- + "bottle of beer");
                } else if (n==2) {
                System.out.println(n-- + "bottle of beer on the wall, ya' take one down, ya' pass it around, " + n + " bottle of beer on the wall, ");
                } else {
                    System.out.println(n-- + "bottles of beer on the wall, " + n-- + " bottles of beer, ya’ take one down, ya’ pass it around," + n + " bottles of beer on the wall.");
                    //calls itself again here
                }
                bottles(n - 1);
            }

        else {
        System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take\n" +
                "one down, ya’ can’t pass it around, ’cause there are no more\n" +
                "bottles of beer on the wall!");
        }

    }
    public static void main(String[] args) {
        bottles(4);
    }
	
	
}
