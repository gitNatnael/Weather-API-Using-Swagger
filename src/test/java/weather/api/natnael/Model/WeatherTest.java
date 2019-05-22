package weather.api.natnael.Model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeatherTest {

    Weather weather;

    @Before
    public void setup() {
        weather = new Weather("Stockholm", "Sweden", 22.12, 2.0);
    }

    @Test
    public void getCityName() throws Exception {

        assertEquals("Stockholm", weather.getCityName());
    }

    @Test
    public void getCountry() throws Exception {

        assertEquals("Sweden", weather.getCountry());
    }

    @Test
    public void getTemp() throws Exception {
        Assert.assertEquals(0, Double.compare(22.12, weather.getTemp()));
    }

}