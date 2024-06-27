import java.util.Scanner;

public class Multiple {

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print(" Enter first integer: ");
int value1 = input.nextInt();

System.out.print(" Enter second integer: ");
int value2 = input.nextInt();

int tripled = value1 * 3;

int doubled = value2 * 2;

int remainder = tripled % doubled;

if (tripled % doubled ==0){ 

   System.out.printf(" it is a multiple of squared second integer ");


  } else {
    System.out.printf(" it is not a multiple of squared second integer ");

    }
  }
}


