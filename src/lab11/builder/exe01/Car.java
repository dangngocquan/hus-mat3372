package lab11.builder.exe01;

public class Car {
    private int numSeats;
    private String engineName;
    private boolean hasTripComputer;
    private boolean hasGPS;

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public boolean isHasTripComputer() {
        return hasTripComputer;
    }

    public void setHasTripComputer(boolean hasTripComputer) {
        this.hasTripComputer = hasTripComputer;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }
}
