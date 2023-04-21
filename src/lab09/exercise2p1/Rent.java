package lab09.exercise2p1;

import java.util.Date;

public class Rent {
    Item item;
    Date end;
    Student student;
    Date begin;

    public Rent(Item item, Student student, Date begin, Date end) {
        this.item = item;
        this.student = student;
        this.begin = begin;
        this.end = end;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public long getDiffDays() {
        return Math.abs(end.getTime() - begin.getTime()) / 1000 / 3600 / 24;
    }
}
