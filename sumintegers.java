import java.util.Scanner;

public class SumIntegers{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int stop = 0;
	int firstInt = 0;
	int secondInt = 0;
	do{
		System.out.print("Enter first integer: ");
		firstInt = input.nextInt();

		System.out.print("Enter second integer: ");
		secondInt = input.nextInt();

		int sum = firstInt + secondInt;
		System.out.printf("The sum of the two integers %d & %d is: %d%n.", firstInt, secondInt, sum);

		System.out.print("Press any number to contine, or 0 to stop");
		stop = input.nextInt();

				
	}while(stop!=0);
	
	


	}
}