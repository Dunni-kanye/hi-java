// CostOfTrip.java
// Multiplication and division program that input how to get the cost of a trip.
import java.util.Scanner;  // program uses class Scanner

 public class CostOfTrip {
   // main method begins execution of java application
   public static void main(String[] args) {
       // create a scanner to obtain input from the command window
       Scanner input = new Scanner (System.in);

       System.out.print (" Enter first integer: ");        
       double value1 = input.nextDouble(); // find first value from the user

       System.out.print(" Enter the second integer: ");
       double value2 = input.nextDouble(); // find second value from the user
 
       System.out.print(" Enter the third integar: ");
       double value3 = input.nextDouble(); // find the third value from the user

       double division = value1 / value2;   // divide value1 with value2
       double multiplication = (division * value3); // to get value4
       
       System.out.printf(" multiplication is %.2f",multiplication); //display multiplication

           }


       } 
        
       