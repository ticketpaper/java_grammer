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
//        만약 password가 5자리 이하라면 예외 발생 (IllegalArgu)
        if (author.getPassword().length() < 5) {
            throw new IllegalArgumentException("비밀번호가 짧습니다.");
        }
    }

    Optional<Author> login(String email, String password) {
        List<Author> authorList = authorRepository.getAuthors();
        Optional<Author> author = Optional.empty();
//        email이 존재하지 않으면 예외 발생 (NosuchElement) : for문 돌려서 찾아라
        for (Author author1 : authorList) {
            if()
        }
        if (author.isPresent()) {
            if (!(author.get().getEmail().equals(email))) {
                throw new NoSuchElementException("이메일이 없습니다.");
            } else {
                if (!author.get().getPassword().equals(password)) {
                    throw new IllegalArgumentException("패스워드가 일치하지 않습니다.");
                }
            }
        } else {
            return author;
        }
//        password가 틀리면 예외발생 (IllegalArgu)
        return author= Optional.empty();
    }
}
