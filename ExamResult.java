import java.util.Scanner;

  public class ExamResult{

  public static void main(String[]args) {
  Scanner input = new Scanner(System.in);

 
   System.out.printf(" Enter the score: ");
   int score1 = input.nextInt();
   
   int score2 = 60;


   if (score1 >= 60){
 System.out.println("you pass the exam."); 
} 

else if(score1 <= 59) {
   System.out.println("you don't pass the exam.");

  }
    
    }
 
   
   
}