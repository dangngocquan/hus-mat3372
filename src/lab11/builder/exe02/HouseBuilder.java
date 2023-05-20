package lab11.builder.exe02;

public class HouseBuilder implements Builder {
    private House house;

    @Override
    public Builder reset() {
        this.house = new House();
        return this;
    }

    @Override
    public Builder buildWalls(int walls) {
        this.house.setWalls(walls);
        return this;
    }

    @Override
    public Builder buildFloors(int floors) {
        this.house.setFloors(floors);
        return this;
    }

    @Override
    public Builder buildDoors(int doors) {
        this.house.setDoors(doors);
        return this;
    }

    @Override
    public Builder buildWindows(int windows) {
        this.house.setWindows(windows);
        return this;
    }

    @Override
    public Builder buildRoof(boolean hasRoof) {
        this.house.setHasRoof(hasRoof);
        return this;
    }

    @Override
    public Builder buildGarage(boolean hasGarage) {
        this.house.setHasGarage(hasGarage);
        return this;
    }

    @Override
    public Builder buildSwimPool(boolean hasSwimPool) {
        this.house.setHasSwimPool(hasSwimPool);
        return this;
    }

    @Override
    public Builder buildFancyStatues(boolean hasFancyStatues) {
        this.house.setHasFancyStatues(hasFancyStatues);
        return this;
    }

    @Override
    public Builder buildGarden(boolean hasGarden) {
        this.house.setHasGarden(hasGarden);
        return this;
    }


    public House build() {
        House house = this.house;
        this.reset();
        return house;
    }

}
