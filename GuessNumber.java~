import java.util.*;
//import java.util.Scanner;
//import java.util.Random;

public class GuessNumber {
  
 
  public static void main(String[] args) {
    int guess, computerValue, success, numberOfTries;
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    
    while(true) {
      computerValue = random.nextInt(100)+1;
      numberOfTries = 0;
      while(true) {
        System.out.println("please enter an integer between 1 and 100: ");
        guess = in.nextInt();
        numberOfTries++;
        if (guess < 1 || guess > 100) {
          System.out.println("Invalid input");
        }
        
        else if (guess == computerValue) {
          System.out.println("Congradulations you won! Your number of tries was: " + numberOfTries);
          break;
        } 
        else if (guess < computerValue) {
          System.out.println("Your guess is too low!");
        } 
        else if (guess > computerValue) {
          System.out.println("Your guess was too high!");
        }
      }
    }
  }
}
       
          
    
    //Computer's guess. To be run everytime.
//    Random random = new Random();
//    computerValue = random.nextInt(100)+1;
//    
//    //Prompt user for guess
//    System.out.println("I am thinking of a number between 0-100. What is your guess?");
//    Scanner in = new Scanner(System.in);
//    userGuess = in.nextInt();
//    System.out.println("The user's guess is " + userGuess + ".");
//    
//    while ( userGuess < compGuess) {
//    System.out.print("Your guess was " + userGuess + "." + " The computer's guess was " + compGuess + ".\n" 
//                       + "The difference was " + (Math.abs(userGuess-compGuess)) + ".");
//    
//    }
//  }
//    
//  }
    
//  public static void checkGuess(int compGuess, int userGuess) {
//
//     
//    if (compGuess == userGuess) {
//      System.out.println("You guessed right!");
//      return true;
//    } else {
////    Recursive
//      System.out.println("You're wrong. Keep guessing");
//      return false;
//    }
//  }
//}