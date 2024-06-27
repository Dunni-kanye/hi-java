import java.util.Scanner;

public class Division {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.print(" Enter first integer: ");
int firstNumber = input.nextInt();

int lastNumber = firstNumber % 3;

if(lastNumber> 0) {
System.out.println(firstNumber + "is not divisible by 3");

} else {

System.out.println(firstNumber + "is divisible by 3");

  }

}

}