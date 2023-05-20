package lab11.builder.exe02;

public class House {
    private int walls;
    private int floors;
    private int doors;
    private int windows;
    private boolean hasRoof;
    private boolean hasGarage;
    private boolean hasSwimPool;
    private boolean hasFancyStatues;
    private boolean hasGarden;

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public boolean isHasRoof() {
        return hasRoof;
    }

    public void setHasRoof(boolean hasRoof) {
        this.hasRoof = hasRoof;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasSwimPool() {
        return hasSwimPool;
    }

    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public boolean isHasFancyStatues() {
        return hasFancyStatues;
    }

    public void setHasFancyStatues(boolean hasFancyStatues) {
        this.hasFancyStatues = hasFancyStatues;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls=" + walls +
                ", floors=" + floors +
                ", doors=" + doors +
                ", windows=" + windows +
                ", hasRoof=" + hasRoof +
                ", hasGarage=" + hasGarage +
                ", hasSwimPool=" + hasSwimPool +
                ", hasFancyStatues=" + hasFancyStatues +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
