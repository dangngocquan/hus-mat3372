package lab08.exercise4p3.countryarraymanager;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population 
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        for (int index = 0; index < newArray.length; index++) {
            // Find country which has min population
            int minPopulation = newArray[index].getPopulation();
            int indexOfMinPopulation = index;
            for (int i = index + 1; i < newArray.length; i++) {
                int tempPopulation = newArray[i].getPopulation();
                if (tempPopulation < minPopulation) {
                    minPopulation = tempPopulation;
                    indexOfMinPopulation = i;
                }
            }

            // Swap
            Country tempCountry = newArray[index];
            newArray[index] = newArray[indexOfMinPopulation];
            newArray[indexOfMinPopulation] = tempCountry;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population 
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int index = 0; index < newArray.length; index++) {
            // Find country which has min population
            int maxPopulation = newArray[index].getPopulation();
            int indexOfMaxPopulation = index;
            for (int i = index + 1; i < newArray.length; i++) {
                int tempPopulation = newArray[i].getPopulation();
                if (tempPopulation > maxPopulation) {
                    maxPopulation = tempPopulation;
                    indexOfMaxPopulation = i;
                }
            }

            // Swap
            Country tempCountry = newArray[index];
            newArray[index] = newArray[indexOfMaxPopulation];
            newArray[indexOfMaxPopulation] = tempCountry;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int index = 0; index < newArray.length - 1; index++) {
                double area1 = newArray[index].getArea();
                double area2 = newArray[index+1].getArea();
                if (area1 > area2) {
                    Country tempCountry = newArray[index];
                    newArray[index] = newArray[index+1];
                    newArray[index+1] = tempCountry;
                    swapped = true;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int index = 0; index < newArray.length - 1; index++) {
                double area1 = newArray[index].getArea();
                double area2 = newArray[index+1].getArea();
                if (area1 < area2) {
                    Country tempCountry = newArray[index];
                    newArray[index] = newArray[index+1];
                    newArray[index+1] = tempCountry;
                    swapped = true;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        for (int index = 1; index < newArray.length; index++) {
            Country country = newArray[index];
            double gdp = country.getGdp();
            int tempIndex = index - 1;
            while (tempIndex >= 0 && newArray[tempIndex].getGdp() > gdp) {
                newArray[tempIndex+1] = newArray[index];
                tempIndex--;
            }
            newArray[tempIndex+1] = country;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int index = 1; index < newArray.length; index++) {
            Country country = newArray[index];
            double gdp = country.getGdp();
            int tempIndex = index - 1;
            while (tempIndex >= 0 && newArray[tempIndex].getGdp() < gdp) {
                newArray[tempIndex+1] = newArray[index];
                tempIndex--;
            }
            newArray[tempIndex+1] = country;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        List<AfricaCountry> africaCountriesList = new LinkedList<AfricaCountry>();
        for (Country country : countries) {
            if (country != null && country.getContinent().equals("Africa")) {
                africaCountriesList.add((AfricaCountry) country);
            }
        }

        AfricaCountry[] africaCountriesArray = new AfricaCountry[africaCountriesList.size()];
        for (int index = 0; index < africaCountriesArray.length; index++) {
            africaCountriesArray[index] = africaCountriesList.get(index);
        }

        return africaCountriesArray;
    }

    public AsiaCountry[] filterAsiaCountry() {
        List<AsiaCountry> asiaCountriesList = new LinkedList<AsiaCountry>();
        for (Country country : countries) {
            if (country != null && country.getContinent().equals("Asia")) {
                asiaCountriesList.add((AsiaCountry) country);
            }
        }

        AsiaCountry[] asiaCountriesArray = new AsiaCountry[asiaCountriesList.size()];
        for (int index = 0; index < asiaCountriesArray.length; index++) {
            asiaCountriesArray[index] = asiaCountriesList.get(index);
        }

        return asiaCountriesArray;
    }

    public EuropeCountry[] filterEuropeCountry() {
        List<EuropeCountry> europeCountriesList = new LinkedList<EuropeCountry>();
        for (Country country : countries) {
            if (country != null && country.getContinent().equals("Europe")) {
                europeCountriesList.add((EuropeCountry) country);
            }
        }

        EuropeCountry[] europeCountriesArray = new EuropeCountry[europeCountriesList.size()];
        for (int index = 0; index < europeCountriesArray.length; index++) {
            europeCountriesArray[index] = europeCountriesList.get(index);
        }

        return europeCountriesArray;
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        List<NorthAmericaCountry> northAmericaCountriesList = new LinkedList<NorthAmericaCountry>();
        for (Country country : countries) {
            if (country != null && country.getContinent().equals("North America")) {
                northAmericaCountriesList.add((NorthAmericaCountry) country);
            }
        }

        NorthAmericaCountry[] northAmericaCountriesArray = new NorthAmericaCountry[northAmericaCountriesList.size()];
        for (int index = 0; index < northAmericaCountriesArray.length; index++) {
            northAmericaCountriesArray[index] = northAmericaCountriesList.get(index);
        }

        return northAmericaCountriesArray;
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        List<OceaniaCountry> oceanCountriesList = new LinkedList<OceaniaCountry>();
        for (Country country : countries) {
            if (country != null && country.getContinent().equals("Oceania")) {
                oceanCountriesList.add((OceaniaCountry) country);
            }
        }

        OceaniaCountry[] oceanCountriesArray = new OceaniaCountry[oceanCountriesList.size()];
        for (int index = 0; index < oceanCountriesArray.length; index++) {
            oceanCountriesArray[index] = oceanCountriesList.get(index);
        }

        return oceanCountriesArray;
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        List<SouthAmericaCountry> southAmericaCountriesList = new LinkedList<SouthAmericaCountry>();
        for (Country country : countries) {
            if (country != null && country.getContinent().equals("South America")) {
                southAmericaCountriesList.add((SouthAmericaCountry) country);
            }
        }

        SouthAmericaCountry[] southAmericaCountriesArray = new SouthAmericaCountry[southAmericaCountriesList.size()];
        for (int index = 0; index < southAmericaCountriesArray.length; index++) {
            southAmericaCountriesArray[index] = southAmericaCountriesList.get(index);
        }

        return southAmericaCountriesArray;
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] countriesSorted = sortByDecreasingPopulation();
        Country[] mostPopulousCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            mostPopulousCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                mostPopulousCountries[index] = countriesSorted[index];
            }
        }
        return mostPopulousCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] countriesSorted = sortByIncreasingPopulation();
        Country[] leastPopulousCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            leastPopulousCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                leastPopulousCountries[index] = countriesSorted[index];
            }
        }
        return leastPopulousCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] countriesSorted = sortByDecreasingArea();
        Country[] largestAreaCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            largestAreaCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                largestAreaCountries[index] = countriesSorted[index];
            }
        }
        return largestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] countriesSorted = sortByIncreasingArea();
        Country[] smallestAreaCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            smallestAreaCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                smallestAreaCountries[index] = countriesSorted[index];
            }
        }
        return smallestAreaCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] countriesSorted = sortByDecreasingGdp();
        Country[] highestGdpCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            highestGdpCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                highestGdpCountries[index] = countriesSorted[index];
            }
        }
        return highestGdpCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] countriesSorted = sortByIncreasingGdp();
        Country[] lowestestGdpCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            lowestestGdpCountries = new Country[size];
            for (int index = 0; index < size; index++) {
                lowestestGdpCountries[index] = countriesSorted[index];
            }
        }
        return lowestestGdpCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }
        
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
