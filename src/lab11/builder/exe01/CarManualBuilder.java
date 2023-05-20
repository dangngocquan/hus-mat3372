package lab11.builder.exe01;

public class CarManualBuilder implements Builder {
    private Manual manual;

    @Override
    public Builder reset() {
        this.manual = new Manual();
        return this;
    }

    @Override
    public Builder setSeats(int numSeats) {
        this.manual.setNumSeats(numSeats);
        return this;
    }

    @Override
    public Builder setEngine(String engineName) {
        this.manual.setEngineName(engineName);
        return this;
    }

    @Override
    public Builder setTripComputer(boolean hasTripCompute) {
        this.manual.setHasTripComputer(hasTripCompute);
        return this;
    }

    @Override
    public Builder setGPS(boolean hasGPS) {
        this.manual.setHasGPS(hasGPS);
        return this;
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
