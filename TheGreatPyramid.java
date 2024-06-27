import java.util.Scanner;

public class TheGreatPyramid {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the estimated number of stones used: ");
long numberOfStones = input.nextLong();

System.out.print("Enter the average weight of each stones : ");
double averageWeightPerStone = input.nextDouble();

System.out.print("Enter the number of years taken to build the pyramid :");
int numberOfYears = input.nextInt();
 int totalDays = numberOfYears * 365;
int totalHours = totalDays * 24;
int totalMinutes = totalHours * 60;

double totalWeight = numberOfStones * averageWeightPerStone;

double weightPerYear = totalWeight / numberOfYears;
double weightPerHour = totalWeight / totalHours;
double weightPerMinute = totalWeight / totalMinutes;

System.out.printf("%.2f", weightPerYear, weightPerHour ,weightPerMinute);

   }
}

