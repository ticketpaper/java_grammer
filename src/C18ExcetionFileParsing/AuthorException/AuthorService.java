package C18ExcetionFileParsing.AuthorException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

class AuthorService {
    AuthorRepository authorRepository;
    AuthorService() {
        authorRepository = new AuthorRepository();
    }

    void resister(Author author) {
        Optional<Author> author1 = authorRepository.checkemail(author.getEmail());
        if (author1.isPresent()) {
            throw new IllegalArgumentException("이미 있는 email입니다");
        }
//        만약 password가 5자리 이하라면 예외 발생 (IllegalArgu)
        if (author.getPassword().length() < 5) {
            throw new IllegalArgumentException("비밀번호가 짧습니다.");
        }
        authorRepository.resister(author);
    }

    Author login(String email, String password) {
        Optional<Author> author = authorRepository.checkemail(email);
//        email이 존재하지 않으면 예외 발생 (NosuchElement) : for문 돌려서 찾아라
        if (!author.isPresent()) {
            throw new NoSuchElementException("email로 가입된 회원이 없습니다");
        }
//        password가 틀리면 예외발생 (IllegalArgu)
        if (!author.get().getPassword().equals(password)) {
            throw new IllegalArgumentException("패스워드가 일치하지 않습니다");
        }
        return author.get();
    }
}
