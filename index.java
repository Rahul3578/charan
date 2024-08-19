
import java.util.*;
import java.util.Random;
public class Task1NumberGame {
 public static void main(String[] args) {
   int attempts=0;
   Random rand=new Random();
   int rand1=rand.nextInt(1,100);
   boolean correct;
   while (correct=true) {
   Scanner sc=new Scanner(System.in);
   int guess=sc.nextInt();
   attempts+=1;
   if(guess==rand1) {
    System.out.println("user has guessed the correct number");
    System.out.println("user has taken "+attempts+" attempts to guess the correct answer");
    correct=true;
    System.exit(0);
    
    }
   else {
   if(guess>rand1) {
    System.out.println(guess+" is greater than random number,please try again");
     }
   else {
    System.out.println(guess+" is less than random number,please try again");
    
   }
   }
   } 
   
  }
}