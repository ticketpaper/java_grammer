package C18ExcetionFileParsing.AuthorException;

import java.util.*;

/**
 * 메모리 DB에 데이터 추가/삭제 부분은 repository로 분리 -> AuthorRepository
 * Controller(입력받아 객체 생성, 예외처리)
 * -> Service(비지니스 로직 - resiter, login, throw new)
 * -> Repository (list에 add)
 */
class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print(" 1) 회원가입, 2) 로그인 \n");
            System.out.println("원하는 서비스 번호를 입력");
            int i = sc.nextInt();
            if (i == 1) { // 1) 회원가입
                System.out.println("회원 가입할 이름 입력: ");
                String name = sc.next();
                System.out.println("이메일 입력 : ");
                String email = sc.next();
                System.out.println("비밀번호 입력 : ");
                String password = sc.next();
                Author author = new Author(name, email, password);
                try {
                    authorService.resister(author);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                System.out.printf("사용자의 id: %d, 이름: %s \n", author.getId(), author.getName());
            } else if (i == 2) { // 로그인
                System.out.println("login email : ");
                String email = sc.next();
                System.out.println("login password : ");
                String password = sc.next();
                Optional<Author> login_author = Optional.empty();
                try {
                    login_author = authorService.login(email, password);
                } catch (NoSuchElementException e) {
                    System.out.println(e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                if (login_author.isPresent()) {
                    System.out.println(login_author.get().getName() + "님 환영합니다.");
                }
            }
        }
    }
}

