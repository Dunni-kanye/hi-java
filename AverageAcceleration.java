import java.util.Scanner;

public class AverageAcceleration {
public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.print(" Enter the velocity1 ");
double velocity1 = input.nextDouble();

System.out.print(" Enter the velocity2 ");
double velocity2 = input.nextDouble();

System.out.print(" Enter the time ");
double time = input.nextDouble();

double division = (velocity1 - velocity2) / (time);

System.out.printf("%.2f" ,division);

   }

}




