package C13ClassLacture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthorPostService {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        List<post> posts = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print(" 1) 회원가입, 2) 게시글 작성, 3) 회원목록조회, 4) 회원상세조회, 5) 게시글상세조회 \n");
            System.out.println("원하는 서비스 번호를 입력");
            int i = sc.nextInt();
            if (i == 1) { // 1) 회원가입
                System.out.println("회원 가입할 이름 입력: ");
                String name = sc.next();
                System.out.println("이메일 입력 : ");
                String email = sc.next();
                Author author = new Author(name, email);
                authors.add(author);
                System.out.printf("사용자의 id: %d, 이름: %s \n",author.getId(),author.getName());
            } else if (i == 2) { // 게시글 작성
                System.out.println("글 제목 입력 : ");
                String title = sc.next();
                System.out.println("글 내용 입력 : ");
                String contents = sc.next();
                System.out.println("회원 email을 입력 ");
                String email = sc.next();
                Author temp_author = null;
                for(Author a : authors){
                    if(a.getEmail().equals(email)){
                        temp_author = a;
                        break;
                    }
                }
                post post = new post(title, contents, temp_author);
                posts.add(post);
//                temp_author.getPosts().add(post);
                System.out.printf("작성한 글의 id: %d, 제목: %s, 이메일: %s \n",post.getId(),post.getTitle(),post.getAuthor().getEmail());
            } else if (i == 3) { //회원 목록 조회
                for (Author author : authors) {
                    System.out.println(author.getEmail());
                }
            } else if (i == 4) { // 회원 상세 조회
                System.out.println("author email를 입력해주세요");
                String author_email = sc.next();
                Author temp_author2 = null;
                for(Author a : authors){
                    if(a.getEmail().equals(author_email)){
                        temp_author2 = a;
                        break;
                    }
                }
                System.out.println(temp_author2.getName() + " " + temp_author2.getEmail() + " " + temp_author2.getPosts().size());
            }else if(i == 5) { // 게시글 상세 조회
                System.out.println("post id를 입력해주세요");
                Long id = sc.nextLong();
                post temp_post = null;
                for (post post : posts) {
                    if (post.getId().equals(id)) {
                        temp_post = post;
                        break;
                    }
                }
                System.out.println(temp_post.getTitle()+ " " + temp_post.getAuthor().getEmail());
            }
        }

     }

}

/**
 * 인스턴스 변수 생성
 * 생성자 : 모든 인스턴스 변수 초기화
 * 모든 클래스에 getter 생성
 *
 *  - 요구 사항 -
 * 1) 회원가입
 * 2) 게시글 작성
 * 3) 회원 목록 조회
 *  3-1) 회원의 email을 출력
 * 4) 회원 상세 조회
 *  4-1) 회원의 이름, email, 작성글 수 를 출력
 * 5) 게시글 상세 조회
 *  5-1) 제목, 작성자의 email 출력
 */
class Author {
    private Long id;
    private String name;
    private String email;
    private List<post> posts;

    static Long static_id = 0L;

    public void add_post(post post) {
        this.posts.add(post);
    }

    public Author(String name, String email) {
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.posts = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public List<post> getPosts() {
        return posts;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}

class post {
    private Long id;
    static Long static_id = 0L;
    private String title;
    private String contents;
    private Author author;

    post(String title, String contents, Author author) {
        static_id += 1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.author = author;
        this.author.add_post(this);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor() {
        return author;
    }

}
