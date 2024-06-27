import java.util.Scanner;

public class BarChart {

public static void main(String[]args) {
Scanner input = new Scanner(System.in);

int[] numbers = new int[5];

System.out.print(" Enter a number between 1 and 30: ");
int readFiveNumbers = input.nextInt();

for (int i = 0; i < readFiveNumbers; i++)  {
int number;
do {

System.out.print("number" + (i + 1) + " : ");
 number = input.nextInt();
if (number < 1 || number > 30) {
   
System.out.printf(" Enter a number " + (i + 1) + "( between 1 and 30:");
  }

 }
 while (number < 1 || number > 30) ;
 }  

 
System.out.println("\nBar Chart: ");
int number = input.nextInt();

for (int j = 0; j < number; j++) {

  System.out.print("*");

  }

   System.out.println();


   }
}

  



