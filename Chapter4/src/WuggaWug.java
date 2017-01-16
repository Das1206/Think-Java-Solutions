/**
 * Exercise 4-1 of ThinkJava, 2016.
 * 
 * What is the output of the following program?
 * 
 * HINT: You can use breakpoints to walk you through each step of the code (if using an IDE like eclipse)
 * 
 * @author Quan Truong
 *
 */

public class WuggaWug {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }

}