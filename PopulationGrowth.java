import java.util.Scanner;

public class PopulationGrowth {

public static void main(String[]args) {
Scanner input = new Scanner(System.in);

System.out.print(" Enter estimated population after one year ");  
long population1 = input.nextLong();

System.out.print(" Enter estimated population after two years ");
long population2 = input.nextLong();

System.out.print(" Enter estimated population after three years ");
long population3 = input.nextLong();

System.out.print(" Enter estimated population after four years ");
long population4 = input.nextLong();

System.out.print(" Enter estimated population after five years ");  
long population5 = input.nextLong();

System.out.print(" Enter currentPopulation ");
long currentPopulation = input.nextLong();

System.out.print(" Enter pastPopuation ");
long pastPopulation = input.nextLong();
 

long subtraction= ( currentPopulation - pastPopulation );
long division = ( subtraction - pastPopulation );
long multiplication = ( division * 100);

System.out.printf("%d%n",multiplication);


   }

}