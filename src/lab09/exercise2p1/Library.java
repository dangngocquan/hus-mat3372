package lab09.exercise2p1;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        Rent longestRent = null;
        long diffDays = 0;
        for (Rent rent : rents) {
            if (rent != null && rent.getDiffDays() > diffDays) {
                longestRent = rent;
                diffDays = rent.getDiffDays();
            }
        }
        return longestRent;
    }
}
