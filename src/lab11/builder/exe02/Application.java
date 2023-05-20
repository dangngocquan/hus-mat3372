package lab11.builder.exe02;

public class Application {
    public static void main(String[] args) {
        Director director = new Director();

        HouseBuilder builder1 = new HouseBuilder();
        director.constructHouseWithGarage(builder1);
        House house1 = builder1.build();
        System.out.println(house1);
        // House{walls=4, floors=2, doors=2, windows=4, hasRoof=true, hasGarage=true,
        //      hasSwimPool=false, hasFancyStatues=false, hasGarden=false}
    }
}
