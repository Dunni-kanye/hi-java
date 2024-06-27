import java.util.Scanner;

public class PowerBaseCalculation {

	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);

		int base = 0;
		int power = 0;
		int result = 1;

		System.out.print(" Enter the value of base number: ");
		base = input.nextInt();

		System.out.print(" Enter the  value of power number: ");
		power = input.nextInt();

		for (int i = 0; i < base; i++) { 		
			result *= base; 
 		}

  			System.out.printf("%d ^ %d: %d", base, power,result);
    	 }
  }