import java.util.Scanner;
public class Rectangle {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);



System.out.printf(" Enter the value for height: ");
double height = input.nextDouble();

System.out.printf(" Enter the value for width: ");
double width = input.nextDouble();

double area = width * height;


System.out.printf("value for area,%f", area );
double perimeter = 2* width + height;

System.out.printf("value for perimeter,%f", perimeter);


  }

}
