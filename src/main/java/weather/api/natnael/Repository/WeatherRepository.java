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

    private WeatherInfo weatherInfo;

    private WeatherInfo getWeatherApi(String cityName) throws Exception {
        String urlApixu = "http://api.apixu.com/v1/current.json?key=da0451937f6149aea2f220806180909&q=";
        String url = urlApixu + cityName.replace(" ", "-");
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine = in.readLine();
        ObjectMapper mapper = new ObjectMapper();
        weatherInfo = mapper.readValue(inputLine, WeatherInfo.class);
        return weatherInfo;
    }


    public Weather getWeatherJSonData(String cityName) throws Exception {
        WeatherRepository weatherRepository = new WeatherRepository();
        weatherInfo = weatherRepository.getWeatherApi(cityName);
        Weather weather = new Weather(weatherInfo.getLocation().getName(), weatherInfo.getLocation().getCountry(), weatherInfo.getCurrent().getTemp_c());
        return weather;
    }
}