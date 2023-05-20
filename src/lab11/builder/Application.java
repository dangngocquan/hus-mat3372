package lab11.builder;

public class Application {
    public void makeCar() {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);
        Car car = builder.getProduct();

        CarManualBuilder builder2 = new CarManualBuilder();
        director.constructSportCar(builder2);
        Manual manual = builder2.getProduct();
    }
}
