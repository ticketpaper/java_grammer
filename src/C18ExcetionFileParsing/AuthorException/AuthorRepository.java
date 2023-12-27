package C18ExcetionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;

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




}
