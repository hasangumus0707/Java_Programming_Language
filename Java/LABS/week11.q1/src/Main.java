import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(15, "hasan", 300);
        BankAccount a2 = new BankAccount(16, "veli", 200);
        BankAccount a3 = new BankAccount(17, "mehmet", 500);
        BankAccount a4 = new BankAccount(18, "omer", 600);

        ArrayList<BankAccount>  myAccounts = new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);

        Collections.sort(myAccounts);

        System.out.println("Sorted accounts by holder name:");
        for(BankAccount account : myAccounts)
        {
            System.out.println(account);
        }

        for(BankAccount account : myAccounts)
        {
            account.balanceChange(500);
        }

        System.out.println("\nAccounts after reducing balances by 500:");
        for(BankAccount account : myAccounts)
        {
            System.out.println(account);
        }
    }
}