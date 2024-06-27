import java.util.Scanner;
public class EBankingDefault {
public static void main(String[]args) {
Scanner input = new Scanner(System.in);


	
	System.out.println("1, Transfer");
	System.out.println("2, Airtime");
	System.out.println("3, Buy data");
	System.out.println("4, Share data");
	System.out.println("99, Go back");
	System.out.print("Enter a number to get started:"); 
	int number = input.nextInt();

	switch(number) {
	case 1: System.out.println("Transfer");
                System.out.println("Airtime");
	        System.out.println("Buy data");
	        System.out.println("Share data");
                System.out.println("Go back");
	break;
	
	case 2: System.out.print("Default");
	break;
	





}
	
 }
}