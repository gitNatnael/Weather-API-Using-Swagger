package weather.api.natnael.Model;

public class Weather {

    private long CityID;
    private String CityName;
    private String Country;
    private double temp;

    public Weather(String cityName, String country, double temp) {
        CityName = cityName;
        Country = country;
        this.temp = temp;
    }

    public Weather() {
    }

    public long getCityID() {
        return CityID;
    }

    public void setCityID(long cityID) {
        CityID = cityID;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
