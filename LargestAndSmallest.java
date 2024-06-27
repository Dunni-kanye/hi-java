import java.util.Scanner;
public class LargestAndSmallest {
public static void main(String[]args)  {

Scanner input = new Scanner (System.in);

System.out.print(" Enter a number of integer ( 20 to stop): ");
int number = input.nextInt();

int smallestNumber = 0;
int largestNumber = 0;

while(number != 20) {

      if(number > smallestNumber) {
       smallestNumber = number;
   }

   if(number > largestNumber) {
   largestNumber = number;
  }

  System.out.print(" Enter a number of integer ( 20 to stop): ");
   number = input.nextInt();

  }

  System.out.println("smallestNumber is" + smallestNumber);
  System.out.println("largestNumber is " + largestNumber);

      }

   }





