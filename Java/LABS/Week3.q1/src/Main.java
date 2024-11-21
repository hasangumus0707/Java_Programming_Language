import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50);
        Account account2 = new Account("Bruce Lee" , -7.53);

        System.out.println(account1.getName() + " balance " + account1.getBalance());
        System.out.println(account2.getName() + " balance " + account2.getBalance());

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter deposit amount for account1: ");
        double  depositAmount = scan.nextDouble();
        System.out.println( "Adding " + depositAmount + " to account1's balance");
        account1.deposit(depositAmount);

        System.out.println(account1.getName() + " balance " + account1.getBalance());
        System.out.println(account2.getName() + " balance " + account2.getBalance());

        System.out.println("Enter deposit amount for account2: ");
        depositAmount = scan.nextDouble();
        System.out.println( "Adding " + depositAmount + " to account2's balance");
        account2.deposit(depositAmount);

        System.out.println(account1.getName() + " balance " + account1.getBalance());
        System.out.println(account2.getName() + " balance " + account2.getBalance());


    }
}