import java.util.Scanner;

  public class NumberCount {  

public static void main(String[]args) {
Scanner input = new Scanner(System.in);

int positiveNumber = 0;
int negativeNumber = 0;
int zeroNumber = 0;
int stop = 0;

while (stop!=-1) { 

System.out.print(" Enter a number of integer (-1 to stop): ");
int noOfCounter  = input.nextInt();


if (number > 0) {
 positiveNumber ++;


} else if (number < 0) { 
    negativeNumber ++;


} else {

  zeroNumber ++;
}

}



System.out.printf("%d%n" , positiveNumber, negativeNumber, zeroNumber);
   
    }
  }


  






 