package lab05.exercise2p1.service;

public class Author {
    // private instance variables
    private String name;
    private String email;
    private char gender;

    // constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setters
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return String.format("Author[name = %s, email = %s, gender = %s]",
                name, email, gender);
    }
}
