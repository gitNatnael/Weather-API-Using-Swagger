package weather.api.natnael.Repository;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import weather.api.natnael.Model.Weather;
import weather.api.natnael.Model.WeatherInfo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Repository
public class WeatherRepository {

    public Weather getWeatherApi(String cityName) throws Exception {
        String urlApixu = "http://api.apixu.com/v1/current.json?key=da0451937f6149aea2f220806180909&q=";
        String url = urlApixu + cityName.replace(" ", "-");
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine=in.readLine();
        ObjectMapper mapper = new ObjectMapper();
        WeatherInfo weatherInfo = mapper.readValue(inputLine, WeatherInfo.class);
        Weather weather = new Weather(weatherInfo.getLocation().getName(), weatherInfo.getLocation().getCountry(), weatherInfo.getCurrent().getTemp_c());
        return weather;
    }

/*
    //it is fake data to check when the controller return the api in json format
    private List<Weather> weathersInCity = Arrays.asList(
            new Weather(123, "Stockholm", "Sweden", 23.45),
            new Weather(124, "Gavle", "Sweden", -2),
            new Weather(125, "Uppsala", "Sweden", 12.7),
            new Weather(126, "Las Vegas", "USA", 23.45),
            new Weather(127, "London", "UK", 10)
    );
    private final String USER_AGENT = "Mozilla/5.0";

    //get weather data in the given city name
    public Weather getWeatherData(String city, String country) {
        return weathersInCity.stream().filter(t -> t.getCityName().equalsIgnoreCase(city) && t.getCountry().equalsIgnoreCase(country)).findFirst().get();
    }


  */

}