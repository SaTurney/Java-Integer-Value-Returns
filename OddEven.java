import java.util.Scanner;

public class OddEven {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter integer: "); // prompt for input
      int number = input.nextInt(); // read number

      if (number % 2 == 0) {
         System.out.println("Number is even");
      }

      if (number % 2 != 0) {
         System.out.println("Number is odd");
      }
   } // end main
} 