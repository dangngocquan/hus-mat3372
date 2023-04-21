package lab09.exercise2p1;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private String lastname;
    private String phone;
    private double average;

    public Student(String name, String lastname, String phone) {

        this.name=  name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Student(String name, String lastName, double average) {
        this.name = name;
        this.lastname = lastName;
        this.average = average;
    }

    public Student(String name,
                   String lastName,
                   String phone,
                   double average) {
        this.name = name;
        this.lastname = lastName;
        this.phone = phone;
        this.average = average;
    }

    @Override
    public int compareTo(Student anotherStudent) {
        if (name.compareTo(anotherStudent.name) == 0) {
            return lastname.compareTo(anotherStudent.lastname);
        } else {
            return name.compareTo(anotherStudent.name);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Student student = (Student) object;

        return (Double.compare(student.average, average) == 0
            && Objects.equals(name, student.name)
            && Objects.equals(lastname, student.lastname)
            && Objects.equals(phone, student.phone));
    }

    public int hashCode() {
        return Objects.hash(name, lastname, phone, average);
    }

    public String toString() {
        return String.format("Student[name=\'%s\', lastname=\'%s\', phone=\'%s\', average=%s]",
                name, lastname, phone, average);
    }
}
