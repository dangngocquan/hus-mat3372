package lab11.builder.exe02;

public class Director {
    public void constructHouseWithGarage(Builder builder) {
        builder.reset()
                .buildWalls(4)
                .buildFloors(2)
                .buildDoors(2)
                .buildWindows(4)
                .buildRoof(true)
                .buildGarage(true)
                .buildSwimPool(false)
                .buildFancyStatues(false)
                .buildGarden(false);
    }

    public void constructHouseWithSwimPool(Builder builder) {
        builder.reset()
                .buildWalls(4)
                .buildFloors(2)
                .buildDoors(2)
                .buildWindows(4)
                .buildRoof(true)
                .buildGarage(false)
                .buildSwimPool(true)
                .buildFancyStatues(false)
                .buildGarden(false);
    }

    public void constructHouseWithFancyStatues(Builder builder) {
        builder.reset()
                .buildWalls(4)
                .buildFloors(2)
                .buildDoors(2)
                .buildWindows(4)
                .buildRoof(true)
                .buildGarage(false)
                .buildSwimPool(false)
                .buildFancyStatues(true)
                .buildGarden(false);
    }

    public void constructHouseWithGarden(Builder builder) {
        builder.reset()
                .buildWalls(4)
                .buildFloors(2)
                .buildDoors(2)
                .buildWindows(4)
                .buildRoof(true)
                .buildGarage(false)
                .buildSwimPool(false)
                .buildFancyStatues(false)
                .buildGarden(true);
    }
}
