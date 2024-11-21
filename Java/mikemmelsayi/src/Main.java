public class Main {
    public static void main(String[] args) {

        int number = 28 , sum = 0 , i;

        for( i = 1 ; i < number ; i++ ){

            if( number % i == 0){

                sum += i;
            }
        }

        if( number == sum){

            System.out.println("Mükemmel sayi.");

        }else{

            System.out.println("Mükemmel sayi degil.");
        }
    }
}