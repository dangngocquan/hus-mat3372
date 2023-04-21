package lab09.exercise2p1;

public class Dvd extends Item {
    int duration;

    public Dvd(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String toString() {
        return String.format("Dvd[duration=%d, title=\'%s\', year=%d]",
                duration, title, year);
    }
}
