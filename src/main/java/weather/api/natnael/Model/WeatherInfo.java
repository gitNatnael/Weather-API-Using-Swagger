package weather.api.natnael.Model;

/**
 * Created by natna on 2018-10-02.
 */
public class WeatherInfo {

    private Location location;
    private Current current;

    public WeatherInfo(Location location, Current current) {
        this.location = location;
        this.current = current;
    }

    public WeatherInfo() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }
}
