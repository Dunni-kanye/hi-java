import java.util.Scanner;
public class GasMileage {
public static void main (String[]args) {
Scanner input = new Scanner(System.in);

	int totalMiles = 0;
	int totalGallons = 0;
  
	System.out.print(" Enter the miles driven as integer one: ");
	double miles = input.nextDouble();

	System.out.print(" Enter the gallons used as integer two: ");
	int gallon = input.nextInt();
  
	while (mile != -1) {
	System.out.print(" Enter miles driven and ( -1 to end): ");
	 miles = input.nextInt();
	}
	
	if (miles == -1) {
	double finalMiles = miles / gallon;
	System.out.printf("%.2f%n", finalMiles);

	} else {
 	
	System.out.println(" No trips were entered: ");
	} 

	
	
   }
 }