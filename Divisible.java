import java.util.Scanner;

		public class Divisible {

  		public static void main(String[]  args ){
  		Scanner input = new Scanner(System.in);

  		System.out.print (" Enter first integer: ");
  		int value1 = input.nextInt();
 
  		int value2 =(value1%3);
 
  		int number = 3;
    
  		if ( value2 == 0 ){
 
  		System.out.println(" it is a multiple of 3 ");
 		}

 		else{
		System.out.println(" it is not a multiple of 3 ");
		}	
    
 	}

  }