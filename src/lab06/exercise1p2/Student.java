package lab06.exercise1p2;

public class Student extends Person {
    // private variables
    private String program;
    private int year;
    private double fee;

    // constructors
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // Getters and Setters
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    // Method
    public String toString() {
        return String.format("Student[%s, program = %s, year = %d, fee = %s]",
                super.toString(), program, year, fee);
    }
}
