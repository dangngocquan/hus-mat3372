package lab08.exercise4p3.countryarraymanager;

public class EuropeCountry extends Country {
    private int population;
    private double area;
    private double gdp;
    private String continent;

    public EuropeCountry(String code,
                         String name,
                         int population,
                         double area,
                         double gdp,
                         String continent) {
        super(code, name);
        this.population = population;
        this.area = area;
        this.gdp = gdp;
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getContinent() {
        return continent;
    }
}
