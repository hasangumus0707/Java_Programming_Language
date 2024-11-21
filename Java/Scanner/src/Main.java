import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Sayilari Giriniz:");
        int a = scan.nextInt();;
        int b = scan.nextInt();;
        double c = scan.nextDouble();

        // Tamponda kalan \n karekterini temizlemek icin
        scan.nextLine();

        System.out.println("Isminizi giriniz:");
        String name = scan.nextLine();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(name);
    }
}