package Simple_Factory_Design_Pattern.client;

import Simple_Factory_Design_Pattern.Post;
import Simple_Factory_Design_Pattern.PostFactory;
import Simple_Factory_Design_Pattern.PostType;

public class SimpleFactory {
    public static void main(String[] args) {
        Post blog = PostFactory.getPost(PostType.BLOG);
        blog.sendPostNotification("Message forwarded to...");

        Post news = PostFactory.getPost(PostType.NEWS);
        news.sendPostNotification("Message forwarded to...");

        Post product = PostFactory.getPost(PostType.PRODUCT);
        product.sendPostNotification("Message forwarded to...");
    }
}
