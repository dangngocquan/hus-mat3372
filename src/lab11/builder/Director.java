package lab11.builder;

public class Director {
    public void constructSportCar(Builder builder) {
        builder.reset()
                .setSeats(2)
                .setEngine("Sport Engine")
                .setTripComputer(true)
                .setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset()
                .setSeats(4)
                .setEngine("SUV")
                .setTripComputer(true)
                .setGPS(true);
    }
}
