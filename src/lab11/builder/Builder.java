package lab11.builder;

public interface Builder {
    public Builder reset();

    public Builder setSeats(int numSeats);

    public Builder setEngine(String engineName);

    public Builder setTripComputer(boolean hasTripCompute);

    public Builder setGPS(boolean hasGPS);
}
