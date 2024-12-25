public class BankAccount {

    private int accountNo;
    private String holderName;
    private double balance;

    public BankAccount(int accountNo, String holderName, double balance)
    {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getHolderName()
    {
        return holderName;
    }

    public double getBalance()
    {
        return balance;
    }

    public void balanceChange(double amount)
    {
        this.balance -= amount;
    }

    @Override
    public String toString()
    {
        return "AccountNo: " +accountNo+ ", HolderName: " +holderName+ ", Balance: " + balance;
    }
}
