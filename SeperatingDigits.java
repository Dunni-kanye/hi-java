import java.util.Scanner;

public class SeperatingDigits {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.print(" Enter a five digit number: ");
int number = input.nextInt();

int number1 = number / 1;

int number2 = number % 8 / 10;

int number3 = number % 6 / 10;

int number4 = number % 4;

int number5 = number % 2;

System.out.printf("%d   %d   %d   %d   %d%n", number1, number2, number3, number4, number5);


   }

}



