import java.util.Scanner;

public class Account {

    private String name;
    private double balance;

    public Account( String name , double balance)
    {
        this.name = name;
        this.balance = balance;

    }

    public void deposit(double depositAmount){

        this.balance += depositAmount;
    }

   /* public double getBalance(){

        return balance;
    }*/

    public void setName(String name){

        this.name = name;
    }

    public String getName(){

        return name;
    }

    public void setBalance(double balance){

       String sifre = "1234";

       Scanner kullaniciGiris = new Scanner(System.in);

        System.out.println("Sifre gir");

       String girilenSifre = kullaniciGiris.next();

       if( sifre.equals(girilenSifre) ){

           this.balance -=balance;
       }


    }

    public double getBalance(){

        String sifre = "1234";

        Scanner kullaniciGiris = new Scanner(System.in);

        System.out.println("Sifre gir");

        String girilenSifre = kullaniciGiris.next();

        if( sifre.equals(girilenSifre) ){

            return balance;

        }else{
            return 0;
        }

    }
}
