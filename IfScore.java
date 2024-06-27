import java.util.Scanner;

public class IfScore  {

public static void main(String[]args) {

Scanner input = new Scanner(System.in);


	System.out.print("Enter the score of grade :");
        int number = input.nextInt();
	
	if(number > 80){
	System.out.println("The score of grade is: A");
	}


	if(number >= 70 && number <= 80){ 
	System.out.println("The score of grade is: B");
	}

  	if (number >= 50 && number <= 60) {
	System.out.println("The score of grade: C");
	}
	
	if(number < 40) {
	Sy stem.out.println("The score of grade: D");
	}

	

 
     
	
   }
 } 