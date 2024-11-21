public class Main {
    public static void main(String[] args) {


    Post post = new Post("myPost" , "karabuk" , "ankara");
    PostOffice po1 = new PostOffice("KARABUK 100. YIL OFİS");
    PostOffice po2 = new PostOffice("ANKARA 100. CINCIN OFİS");

    po1.send(post);
    po2.receive(post);
    }
}