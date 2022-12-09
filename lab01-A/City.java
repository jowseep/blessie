public class City {

    String city;
    String country;
    int population;
    String latitude;
    String longitude;

    public City() {}

    public City(String city, String country, int population, String latitude, String longitude) {
        this.city =  city;
        this.country = country;
        this.population =  population;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City [city=" + city + ", country=" + country + ", latitude=" + latitude + ", longitude=" + longitude + ", population=" + population + "]";
    }

}