package lab11.builder;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public Builder reset() {
        this.car = new Car();
        return this;
    }

    @Override
    public Builder setSeats(int numSeats) {
        return this;
    }

    @Override
    public Builder setEngine(String engineName) {
        return this;
    }

    @Override
    public Builder setTripComputer(boolean hasTripCompute) {
        return this;
    }

    @Override
    public Builder setGPS(boolean hasGPS) {
        return this;
    }


    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
