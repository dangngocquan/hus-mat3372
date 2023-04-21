package lab09.exercise2p2;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<String, Student>();
    }


    @Override
    public Student searchByLastname(String lastname) {
        for (Student student : phoneBook.values()) {
            if (student != null && student.getLastname().equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook.values()) {
            if (student != null && student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void addPerson(Student student) {
        if (student != null) {
            phoneBook.put(student.getPhone(), student);
        }
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student != null && student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        for (String key : phoneBook.keySet()) {
            Student student = phoneBook.get(key);
            if (student != null && student.getPhone().equals(phone)) {
                phoneBook.remove(key);
            }
        }
    }
}
