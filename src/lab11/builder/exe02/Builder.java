package lab11.builder.exe02;

public interface Builder {
    public Builder reset();
    public Builder buildWalls(int walls);

    public Builder buildFloors(int floors);

    public Builder buildDoors(int doors);

    public Builder buildWindows(int windows);

    public Builder buildRoof(boolean hasRoof);

    public Builder buildGarage(boolean hasGarage);

    public Builder buildSwimPool(boolean hasSwimPool);

    public Builder buildFancyStatues(boolean hasFancyStatues);

    public Builder buildGarden(boolean hasGarden);
}
