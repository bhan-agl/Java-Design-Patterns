package Simple_Factory_Design_Pattern;

public class BlogPost implements Post {
    @Override
    public void sendPostNotification(String msg) {
        System.out.println(msg + " " + "BlogPost");
    }
}
