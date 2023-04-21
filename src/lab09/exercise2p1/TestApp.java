package lab09.exercise2p1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class TestApp {
    public static void main(String[] args) throws ParseException {
        Item i1 = new Book("Soffocare", 2002, 170);
        Item i2 = new Dvd("Moon", 2011, 130);

        Student s1 = new Student("0001", "Darrell", "Abbott");
        Student s2 = new Student("0002", "Nick", "Drake");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Rent[] rents = new Rent[5];
        rents[0] = new Rent(i1, s1, sdf.parse("15/06/2020"), sdf.parse("15/07/2020"));
        rents[1] = new Rent(i1, s2, sdf.parse("10/07/2020"), sdf.parse("20/07/2020"));
        rents[2] = new Rent(i1, s1, sdf.parse("15/06/2020"), sdf.parse("15/07/2020"));
        rents[3] = new Rent(i2, s2, sdf.parse("10/07/2020"), sdf.parse("20/07/2020"));
        rents[4] = new Rent(i2, s1, sdf.parse("25/08/2020"), sdf.parse("28/08/2020"));

        Library l = new Library(rents);
        System.out.println(l.getLongestRent());
    }
}
