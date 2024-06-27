import java.util.Scanner;
public class Adekanye {

public static void main(String[]arg) {
Scanner input = new Scanner(System.in);  

System.out.print(" Enter first value: ");
double number1 = input.nextDouble();
  
System.out.print(" Enter second value:");
double number2 = input.nextDouble();
   
double multiplication = number1 * number2;

System.out.printf("%.2f", multiplication);

  }

}


