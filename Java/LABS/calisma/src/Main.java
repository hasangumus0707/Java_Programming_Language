import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String sentence = input.next();
        System.out.println(sentence);

        MyClass obj = new MyClass();
        Student student = new Student();
        Student student1 = new Student(15, "mahmut", 10);

        System.out.println(student.create());
        System.out.println(student1.create());

        Account hasan = new Account("hasan" ,150);

        hasan.deposit(150);

        System.out.println("bAKİYE GÖSTERİLİYOR");
        System.out.println(hasan.getBalance());

        System.out.println("kac tl cekmek istiyorsun?");
        hasan.setBalance(input.nextDouble());

        System.out.println("bAKİYE GÖSTERİLİYOR");
        System.out.println(hasan.getBalance());


    }
}