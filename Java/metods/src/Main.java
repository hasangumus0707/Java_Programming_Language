public class Main {

    public static void main(String[] args) {

        sayiBulmaca();

    }

    public static void sayiBulmaca() {


        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranan = 5;
        boolean bulundu = false;

        for (int i = 0; i < sayilar.length; i++) {

            if (aranan == sayilar[i]) {

                mesajVer("Sayi Bulundu:" +aranan);
                bulundu = true;
                break;

            }
        }

        if ( !bulundu ) {

            mesajVer("Sayi Bulunamadı: " + aranan);

        }
    }

    public static void mesajVer( String mesaj ) {

        System.out.println(mesaj);

    }
}