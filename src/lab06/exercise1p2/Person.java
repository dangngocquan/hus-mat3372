package lab06.exercise1p2;

public class Person {
    // private variables
    private String name;
    private String address;

    // constructors
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    // Setters
    public void setAddress(String address) {
        this.address = address;
    }

    // Method
    public String toString() {
        return String.format("Person[name = %s, address = %s]",
                name, address);
    }
}
