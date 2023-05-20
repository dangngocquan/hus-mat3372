package lab11.builder.exe01;

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
        this.car.setNumSeats(numSeats);
        return this;
    }

    @Override
    public Builder setEngine(String engineName) {
        this.car.setEngineName(engineName);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean hasTripCompute) {
        this.car.setHasTripComputer(hasTripCompute);
        return this;
    }

    @Override
    public Builder setGPS(boolean hasGPS) {
        this.car.setHasGPS(hasGPS);
        return this;
    }


    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}
