package C18ExcetionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class AuthorRepository {
    List<Author> authorList;

    AuthorRepository() {
        authorList = new ArrayList<>();
    }

    void resister(Author author) {
        authorList.add(author);
    }

    List<Author> getAuthors() {
        return authorList;
    }

    Optional<Author> checkemail(String email) {
        for (Author author : authorList) {
            if (author.getEmail().equals(email)) {
                return Optional.of(author);
            }
        }
        return Optional.empty();
    }
}
