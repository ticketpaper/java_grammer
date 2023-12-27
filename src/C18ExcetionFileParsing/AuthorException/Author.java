package C18ExcetionFileParsing.AuthorException;

class Author {
    private Long id;
    private String name;
    private String email;
    private String password;

    static Long static_id = 0L;

    public Author(String name, String email, String password) {
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}

