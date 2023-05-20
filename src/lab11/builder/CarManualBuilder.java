package lab11.builder;

public class CarManualBuilder implements Builder {
    private Manual manual;

    @Override
    public Builder reset() {
        this.manual = new Manual();
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

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
