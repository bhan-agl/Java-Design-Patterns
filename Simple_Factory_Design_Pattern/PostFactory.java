package Simple_Factory_Design_Pattern;

public class PostFactory {
    public static Post getPost(PostType type) {
        switch (type) {
            case PRODUCT:
                return new ProductPost();
            case BLOG:
                return new BlogPost();
            case NEWS:
                return new NewsPost();
            default:
                throw new IllegalArgumentException("Unknown type");
        }
    }
}
