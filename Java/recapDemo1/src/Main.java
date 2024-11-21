public class Main {
    public static void main(String[] args) {

        int sayi1 , sayi2 , sayi3 , enBuyuk;

        sayi1 = 20;
        sayi2 = 25;
        sayi3 = 2;
        enBuyuk = sayi1;


        if( sayi2 > enBuyuk )
        {
            enBuyuk = sayi2;
        }

        if( sayi3 > enBuyuk )
        {
            enBuyuk = sayi3;
        }

        System.out.println("En buyuk sayi: " + enBuyuk);


    }
}