import java.util.Scanner;

public class FootIntoMeter {
public static void main (String[] args) { 

Scanner input = new Scanner (System.in);

System.out.print (" Enter n integer: ");
double footmeter = input.nextDouble();

System.out.print(" Enter the value for foot: ");
double value = input.nextDouble();


double multiplication = footmeter*value;

System.out.printf("Multiplication is %.2f", multiplication);
}

  }

 