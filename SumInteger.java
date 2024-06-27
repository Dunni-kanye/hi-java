import java.util.Scanner;

public class SumInteger {

public static void main(String[]args) {
Scanner input = new Scanner(System.in);


System.out.print(" Enter the value number: ");
int value = input.nextInt();

int sum = 0;

System.out.print(" Enter the currentSum: ");
int currentSum = input.nextInt();

while(currentSum < value) {

System.out.print(" Enter the new number to add: ");
int number = input.nextInt();

currentSum += number;
System.out.println("Current sum:" +  currentSum);

}

System.out.println("The concluding sum:" + currentSum + ", it is greater than or equals to the value" + value);

    }

 }

