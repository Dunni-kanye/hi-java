import java.util.Scanner;

public class BarChart {

public static void main(String[]args) {
Scanner input = new Scanner(System.in);

int numbers = 5;

while(number < 1 && > 30)  {


System.out.print(" Enter a number between 1 and 30: ");
int readFiveNumbers = input.nextInt();

for (int i = 0; i < readFiveNumbers; i++)  {

System.out.print("integers" + (i + 1) + " : ");
int number = input.nextInt();
if (number < 1 || number > 30) {

System.out.printf(" Enter a number between 1 and 30.");
  }

 }
}  
System.out.println("\Bar Chart: ");
for (int number: numbers) {
for (int j = 0; j < number; j++) {

  System.out.print("*");

  }
}
   System.out.println();


   }
}

  



