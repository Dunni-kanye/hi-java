import java.util.Scanner;
public class ComparingIntegers {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);

System.out.print(" Enter first integer: ");
int number = input.nextInt(); 

int square = number * number;

if (number > 100) {
System.out.println(square + "is => 100");
} 

 else {
System.out.println(square + "is < 100");
  }

if(square ==100){
System.out.println(square + "is == 100");
}
  else {
System.out.println(square + "is != 100");

 
      }
    
   }
}

