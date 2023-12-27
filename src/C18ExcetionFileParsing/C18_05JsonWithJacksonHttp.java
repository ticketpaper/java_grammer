package C18ExcetionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.PipedOutputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C18_05JsonWithJacksonHttp {
    public static void main(String[] args) {
//        http 클라이언트 생성
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mapper = new ObjectMapper();
//        http 요청객체 생성
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
                .GET()
                .build();
//        http응답객체 생성
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String post = response.body();
//            System.out.println(post);
            JsonNode jsonNode = mapper.readTree(post);
            Post post1 = new Post(
                    jsonNode.get("userId").asInt(),
                    jsonNode.get("id").asInt(),
                    jsonNode.get("title").asText(),
                    jsonNode.get("body").asText()
            );
            System.out.println(post1);
//            readValue를 사용해서 객체로 곧바로 매핑 (기본 생성자가 있어야함)
            Post post2 = mapper.readValue(post, Post.class);
//            System.out.println(post2);

//            JsonNode는 트리구조 이므로, for (JsonNode node : jsonNode) 형식이 가능
            HttpRequest request2 = HttpRequest.newBuilder()
                    .uri(URI.create("https://jsonplaceholder.typicode.com/posts/"))
                    .GET()
                    .build();
            HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());
            String post_full = response2.body();
            JsonNode jsonNode2 = mapper.readTree(post_full);
            List<Post> postList = new ArrayList<>();
            for (JsonNode node : jsonNode2) {
                Post post3 = mapper.readValue(node.toString(), Post.class);
                postList.add(post3);
            }
            System.out.println(postList);



        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Post {
    int userId;
    int id;
    String title;
    String body;

    Post() {}

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }


    @Override
    public String toString() {
        return "userId=" + userId + "\n" +
                "id=" + id + "\n" +
                "title='" + title + "\n" +
                "body='" + body;
    }
}
