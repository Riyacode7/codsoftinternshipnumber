import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame{
  public static void main(String args[]){
    Random random=new Random();
    int randomnum=random.nextInt(100)+1;
    int won=0;
   
  while(true){
    System.out.println("Enter the number you want to guess between 1 to 100");
    
    Scanner scanner=new Scanner(System.in);
    int guess=scanner.nextInt();
 
    if(guess==randomnum){
      System.out.println("WOW!YOU HAVE WON");
      won++;
      break;

      
    }
    else if(guess<randomnum){
      System.out.println("Too low!...Try a little higher");
    }
   else if(guess>randomnum){
    System.out.println("Try a little lower");
   }
  
    
  }
  System.out.println("You won one time!");
}
}