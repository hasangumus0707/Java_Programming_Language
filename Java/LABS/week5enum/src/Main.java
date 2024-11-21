enum Book{

    ALICE_HARIKALAR(150 ,"adasdasd"),
    FARELER_VE_INSANLAR(142 ,"hashah"),
    SEFILLER(198, "hebele");


    int pageNumber;
    String description;

    Book( int pageNumber , String description)
    {
    this.pageNumber = pageNumber;
    this.description = description;

    }
}

public class Main {


    public static void main(String[] args) {


        Book[] books = Book.values();

        for(Book b : books){

            System.out.println(b + " : " + b.pageNumber + " " + b.description);
        }
    }
}