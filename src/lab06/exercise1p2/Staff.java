package lab06.exercise1p2;

public class Staff extends Person {
    // private variables
    private String school;
    private double pay;

    // constructors
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // Getters and Setters
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    // Method
    public String toString() {
        return String.format("Staff[%s, school = %s, pay = %s]",
                super.toString(), school, pay);
    }
}
