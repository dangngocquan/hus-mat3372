package lab09.exercise2p2;

public interface PhoneBook {
    public Student searchByLastname(String lastname);

    public Student searchByNumber(String phone);

    public void addPerson(Student student);

    public Student searchByName(String name);

    public void deleteByNumber(String phone);
}
