/**
 * Auto Generated Java Class.
 * Found this. Most people seem to agree that using an extra method to check the numbers is pointless. Highest voted answer used the while(true) method.
 * http://stackoverflow.com/questions/22110876/creating-a-guessing-game
 */


import java.util.*;

public class GuessNumberGame {
  
//  Random random = new Random();
//  public static Scanner in = new Scanner(System.in);
//  public static int userValue;
//  public static int success;
//  private final int computerValue = random.nextInt(100) + 1;
//  public static int numberOfTries = 0;
//  
//  public static void checkValue(int computerValue, int userValue){
//        
  
  public static void main(String[] args) { 
//    int computerValue, userValue, success, numberOfTries;
    //Generate random number
    
    
    
//    while(true) {
//      int computerValue = random.nextInt(100)+1;
//      int numberOfTries = 0;
    int userValue, computerValue, numberOfTries;
    Random random = new Random();
    Scanner in = new Scanner(System.in);
    
    
    
    //Ask user for input
    
   
        
    while (true) {
      computerValue = random.nextInt(100)+1;
      numberOfTries = 0;
      while (true) {
        System.out.println("Enter an integer between 1 and 100: ");
        userValue = in.nextInt();
        numberOfTries++;
        if (userValue == computerValue) {
          System.out.println("Congrats, you won! Your number of tries was: " + numberOfTries);
          return;
        } else if (userValue < computerValue) {
          System.out.println("Your value is too small.");
        } else if (userValue > computerValue) {
          System.out.println("Your guess was too high!");
        }
      }
    
     
        
      
      
    
  }
    
  }
  
}
  
  


    
    
    
    //Ask user for input
//    System.out.println("I am thinking of a number between 0-100. Type your guess: ");
//    userValue = in.nextInt();
//    System.out.println("Your value is " + userValue);
    
    //If input is not within 1-100, tell them to input it again
    
    //If input is greater than random number, tell user it is too high and to try again
    
    //If input is less than random number, tell user it is to low and to try again
    
    //If input is correct, end the loop
   
    
//  }
  
  /* ADD YOUR CODE HERE */
  
//}
