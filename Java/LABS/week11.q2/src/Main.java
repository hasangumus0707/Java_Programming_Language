import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Alice", 1500.0);
        BankAccount a2 = new BankAccount(102, "Charlie", 2500.0);
        BankAccount a3 = new BankAccount(103, "Bob", 3500.0);
        BankAccount a4 = new BankAccount(104, "David", 4500.0);


        ArrayList<BankAccount> myAccounts = new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);

        Collections.sort(myAccounts, new Comparator<BankAccount>() {

            @Override
            public int compare(BankAccount b1, BankAccount b2) {
                return b1.getHolderName().compareTo(b2.getHolderName());
            }
        });

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
        for (BankAccount account : myAccounts) {
            System.out.println(account);
        }

        Collections.sort(myAccounts, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount b1, BankAccount b2) {
                return Double.compare(b1.getBalance(), b2.getBalance());
            }
        });

        for (BankAccount account : myAccounts) {
            System.out.println(account);
        }

    }
}