//Sabrina Turney
//COP2800 - January 17 2018
//Week One Program
//This program takes four inputs from the user, and then returns
//the lowest and highest integers entered, using only syntax learned in Chapters
//One and Two.

import java.util.Scanner;
//Import the scanner utility to get integer input

public class WeekOne {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int largest = 0; //Declaring the variables I'll be calling later to set up
      //the order.
      int smallest = 0;
      System.out.print("Hello ");
      System.out.println("World");
      //Provide introduction and explain program to user.
      System.out.print("Welcome to my week one program!");
      System.out.println("In this program, I need four integers from you,");
      System.out.println("and in return, I'll tell you the maximum"); 
      System.out.println("and minimum values you entered!");

      System.out.print("\nPlease enter your first integer: "); 
      //Prompt user for input 1.
      int numOne = input.nextInt(); // Read number 1, assign variable value.

      System.out.print("Please enter your second integer: "); 
      // Prompt user for input 2.
      int numTwo = input.nextInt(); // Read number 2, assign variable value.
      
      System.out.print("Please enter your third integer: "); 
      // Prompt user for input 3.
      int numThree = input.nextInt(); // Read number 3, assign variable value.
      
      System.out.print("Please enter your fourth integer: "); 
      // Prompt user for input 4.
      int numFour = input.nextInt(); // Read number 4, assign variable value.
      
            if(numOne > numTwo){
                largest = numOne;
                smallest = numTwo;
            }
            if(numOne < numTwo){
                largest = numTwo;
                smallest = numOne;
            }

            if(numThree > largest){
                largest = numThree;
            }
            if(numThree < smallest)
                smallest = numThree;
                
            if(numFour > largest){
                largest = numFour;
            }
            if(numFour < smallest){
               smallest = numFour;
            }

       
      System.out.println("\n\nThe maximum value you entered is: " + largest); 
      //Display max value entered.
      System.out.println("\nThe minimum value you entered is: " + smallest); 
      //Display min value entered.
      System.out.println ("\nThank you for using my program! Goodbye!"); 
      //Say goodbye to user.
   } // end main
} 