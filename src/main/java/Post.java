import lombok.ToString;

import java.io.Serializable;

@ToString
public class Post implements Serializable {
    Integer id;
    Integer userId;
    String body;
    String title;

    public Post(){

    }

    public Post(Integer id, Integer userId, String body, String title) {
        this.id = id;
        this.userId = userId;
        this.body = body;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
