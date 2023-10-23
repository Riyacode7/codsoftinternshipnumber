
import java.util.Scanner;

public class ATM {
  public static void main(String args[]){
    int balance=20000,withdraw,deposit,choice;
    Scanner scanner=new Scanner(System.in);
    while(true){
      System.out.println("Welcome To our ATM!");
      System.out.println("*****************************************");
      System.out.println("Enter your choice:");
      System.out.println("Option 1: Withdraw");
      System.out.println("Option 2: Deposit");
      System.out.println("Option 3: Check Balance");
      System.out.println("Option 4: Exit");
      
       choice=scanner.nextInt();

       switch(choice){
        case 1:
        System.out.println("Enter amount you want to withdraw");
        withdraw=scanner.nextInt();
        if(balance>withdraw){
          balance=balance-withdraw;
        }else{
          System.out.println("Insufficient Balance");
        }
        break;

        case 2:
        System.out.println("Enter amount you want to deposit");
        deposit=scanner.nextInt();
        balance=balance+deposit;
        System.out.println("Balance amount is : "+balance);
        System.out.println("Amount  has been added");
        System.out.println(" ");
        break;

        case 3:
        System.out.println("Balance of yur account is"+balance);
        System.out.println(" ");
        break;

        case 4:
        System.exit(0);
        System.out.println(" ");

       }

    }
  } 
  
}

  

