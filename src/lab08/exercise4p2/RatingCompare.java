package lab08.exercise4p2;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        if (Double.compare(left.getRating(), right.getRating()) == 0) {
            return 0;
        } else if (Double.compare(left.getRating(), right.getRating()) < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
