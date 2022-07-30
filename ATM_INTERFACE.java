import java.util.Scanner;
public class ATM_INTERFACE
{
    public static void main(String args[] )
    { 
        int balance = 0, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("ATM\n");
            System.out.println("Press 1 to Withdraw\n");
            System.out.println("Press 2 to Deposit\n");
            System.out.println("Press 3 to Check Balance\n");
            System.out.println("Press 4 to EXIT\n");
            System.out.print("Choose the operation you want to perform:");
            int menu = s.nextInt();
            switch(menu)
            {
                case 1:
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully deposited");
                System.out.println("");
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
 
                case 4:
                    System.out.println("Thankyou for using ATM!");
                System.exit(0);
            }
        }
    }
}