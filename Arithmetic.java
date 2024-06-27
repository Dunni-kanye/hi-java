
 

import java.util.Scanner;

public class Arithmetic {
public static void main(String[]args) {
Scanner input = new Scanner(System.in);
 
System.out.print(" Enter first integer: ");
int firstNumber = input.nextInt();

System.out.print(" Enter second integer: ");
int secondNumber = input.nextInt();

int firstSquare = firstNumber * firstNumber;

int secondSquare = secondNumber * secondNumber;

int sumOfSquares = firstSquare + secondSquare;

int differenceOfSquares = firstSquare - secondSquare;

System.out.printf("The square of %d is %d%n" , firstNumber,firstSquare);
System.out.printf("The square of %d is %d%n", secondNumber,secondSquare);
System.out.printf("The sum of the square is %d%n", sumOfSquares);
System.out.printf("The difference of the squares is %d%n", differenceOfSquares);

  }

}



 