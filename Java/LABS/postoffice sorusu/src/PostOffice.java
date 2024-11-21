public class PostOffice {

    String name;

    public PostOffice(String name)
    {
        this.name = name;
    }

    void send(Post post)
    {
        System.out.println("send " + post.content + "from " + post.source + " to " + post.destination + "by" + this.name);
    }

    void receive(Post post)
    {
        System.out.println("recieve " + post.content + "from " + post.source + " to " + post.destination + "by" + this.name);
    }
}
