package weather.api.natnael.Model;

public class Weather {

    private long CityID;
    private String CityName;
    private String Country;
    private double temp;
    private double uv;
    private double gust_mph;
    private double gust_kph;


    public Weather(String cityName, String country, double temp, double uv) {
        CityName = cityName;
        Country = country;
        this.temp = temp;
        this.uv=uv;
        this.gust_mph=gust_mph;
        this.gust_kph=gust_kph;
    }

    public double getGust_mph() {
        return gust_mph;
    }

    public void setGust_mph(double gust_mph) {
        this.gust_mph = gust_mph;
    }

    public double getGust_kph() {
        return gust_kph;
    }

    public void setGust_kph(double gust_kph) {
        this.gust_kph = gust_kph;
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

    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }
}
