public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranan = 3;

        for( int i = 0 ; i < sayilar.length ; i++ ){

            if( aranan == sayilar[i]){

                System.out.println("Sayi Bulundu.");
                break;

            }
        }

        System.out.println("Sayi Bulunamadı");
    }
}