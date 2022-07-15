import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String baseUrl = "https://jsonplaceholder.typicode.com/posts/";
        PostsRestClient postsRestClient = new PostsRestClient(baseUrl);

        Post[] arrayPosts = postsRestClient.getAllPosts();
        List<Post> posts = Arrays.asList(arrayPosts);

        int MAX_TITLE_LENGTH = 30;
        //List<String> shortTitles = posts.stream().map(post -> post.title).filter(title -> title.length() <= 30).collect(Collectors.toList());
        List<String> shortTitles = Arrays.stream(arrayPosts).map(post -> post.title).filter(title -> title.length() <= MAX_TITLE_LENGTH).collect(Collectors.toList());
        shortTitles.forEach(System.out::println);



    }
}
