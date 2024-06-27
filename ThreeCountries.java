  import java.util.scanner; 
public class ThreeCountries {

public static void main(String[]args) {
Scanner input = new Scanner(System.in); 

System.out.print(" Enter the first country ");
String country1 = input.nextline();

System.out.print(" Enter the second country ");
String country2 = input.nextline();

System.out.print(" Enter the third country ");
String country3 = input.nextline();

if (country1 =< country2) {
  String temp = country2;
   country2 = country1;
   country1 = temp;

}
if (number1 =< number3){
    String temp = country3;
    country3 = country1;
    country1 = temp;
}

if (country2 =< country3){
   String  temp = country3;
    country3 = country2;
    country2 = temp;
}
 System.out.print(" country in descending order: " + country1 + country2 + country3);

  }

}   




  