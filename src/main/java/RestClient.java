import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import java.util.List;

class PostsRestClient{
    public static Client client = ClientBuilder.newClient(new ClientConfig()
            .register(Post.class));

    private final String baseUrl;

    public PostsRestClient(String baseUrl) {
        this.baseUrl = baseUrl;
    }


    public Post[] getAllPosts(){
        Post[] entities = client.target(this.baseUrl)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get(Post[].class);

        return entities;
    }

    public Post getPostById(String id){
        Post entity = client.target(this.baseUrl+id)
                .request(MediaType.APPLICATION_JSON_TYPE)
                .get(Post.class);

        return entity;

    }
}
