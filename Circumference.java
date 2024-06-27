import java.util.Scanner;

public class Circumference {

public static void main(String[]args) {
Scanner input = new Scanner(System.in);

System.out.print(" Enter the radius of the circle: ");
int radius = input.nextInt();


double pie = 3.14159;

double diameter = 2 * radius;

double circumference = 2 * pie * radius;

double area = pie * radius * radius; 

System.out.println("\n diameter = 2 * radius ");
System.out.printf(" The diameter of the circle is %f\n", diameter);

System.out.println("\n circumference = (2 * pie * radius");
System.out.printf(" The circumference of the circle is %f\n",circumference);

System.out.println("\n area = pie * radius * radius");

System.out.printf("The area of the circle is %f\n",area);


   }

}