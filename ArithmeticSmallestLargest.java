import java.util.Scanner;

public class ArithmeticSmallestLargest {
public static void main(String[]args) {
Scanner input = new Scanner(System.in);
 
System.out.print(" Enter first integer: ");
int number1 = input.nextInt();

System.out.print(" Enter second integer: ");
int number2 = input.nextInt();

System.out.print(" Enter third integer: ");
int number3 = input.nextInt();

int sum = number1 + number2 + number3;

double average = sum / 3.0;

int product = number1 * number2 * number3;

int smallest = Math.min(number1,Math.min( number2, number3));

int largest = Math.max(number1, Math.min(number2, number3)) ;

System.out.printf(" The sum of the number is " + sum);
System.out.printf(" The average of the number is " + average);
System.out.printf(" The product of the number is " + product);
System.out.printf(" The smallest of the  number is " + smallest);
System.out.printf(" The largest of the number is " + largest);

  }

}