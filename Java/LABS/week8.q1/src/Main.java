public class Main {
    public static void main(String[] args) {

    Book book1 = new Book("Object 0riented Programming ");
    book1.addAuthor("Nehad Ramaha");
    System.out.println("Book:" +book1.getTitle()+ "Author:" +book1.getAuthors());
    book1.addAuthor("Kasım 0zacar");
    System.out.println("Book:" +book1.getTitle()+ "Author:" +book1.getAuthors()+" Date:"+ book1.getDate());

    EMail eMail1 = new EMail("Weather ");

    eMail1.addAuthor("Hasan");
    eMail1.addTo("Mehmet");
    System.out.println("Subject:"+eMail1.getSubject()+"From:"+eMail1.getAuthors()+ " To:"+eMail1.getTo());


    }
}