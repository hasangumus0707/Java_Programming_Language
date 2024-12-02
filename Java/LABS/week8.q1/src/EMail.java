import java.util.ArrayList;
import java.util.List;

public class EMail extends Document {

    private String subject;
    private List<String> to;

    public EMail(String subject) {

        super();
        this.subject = subject;
        to = new ArrayList<>();
    }

    public String getSubject() {
        return subject;
    }

    public List<String> getTo(){
        return to;
    }

    public void addTo(String recipient) {
        to.add(recipient);
    }
}
