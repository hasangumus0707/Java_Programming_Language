
public class BankAccount implements Comparable<BankAccount> {

    private int accountNo;
    private String holderName;
    private double balance;

    public BankAccount(int accountNo, String holderName, double balance)
    {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void balanceChange(double amount)
    {

        balance = balance - amount;
    }

    @Override
    public String toString(){
        return "AccountNo:" +accountNo+ " HolderName:" +holderName + " Balance:" +balance;
    }

    @Override
    public int compareTo(BankAccount other)
    {
        return this.holderName.compareTo(other.holderName);
    }

}
