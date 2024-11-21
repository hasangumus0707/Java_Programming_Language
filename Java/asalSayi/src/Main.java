public class Main {
    public static void main(String[] args) {

    int number = 1 , i , control = 1;

    if( number == 1){

        System.out.println("Number is not prime.");
        return;

    }

    if ( number < 1){

        System.out.println("Invalid Number");
    }

    for( i = 2 ; i <= number / 2 ; i++){

        if( number % i == 0 ){

            control = 0;
        }
    }

    if( control == 1 ){

        System.out.println("Number is prime");

    }else{

        System.out.println("Number is not prime");
    }


    }
}