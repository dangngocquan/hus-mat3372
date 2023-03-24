package lab05.exercise2p3.service;

public class Author {
    // private instance variables
    private String name;
    private String email;

    // constructor
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return String.format("Author[name = %s, email = %s]", name, email);
    }
}
