import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Document {

    private List<String> authors;
    private Date date;

    public Document(){
        authors = new ArrayList<>();
        date = new Date();
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String name) {
        authors.add(name);
    }

    public Date getDate() {
        return date;
    }
}
