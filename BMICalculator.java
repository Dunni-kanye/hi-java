import java.util.Scanner;

public class BMICalculator {
public static void main(String[]args) {
Scanner input = new Scanner(System.in);

System.out.print(" Enter weight in kilograms: ");
double weightKilograms = input.nextDouble();
 
System.out.print(" Enter height in meters: "); 
double heightMeters = input.nextDouble();



double bmi  = weightKilograms / (heightMeters * heightMeters); 

System.out.printf(" %.2f%n",weightKilograms,heightMeters,bmi);

  }
} 