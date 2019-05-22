package weather.api.natnael.Repository;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import weather.api.natnael.Model.Weather;
import weather.api.natnael.Transformer.WeatherInfo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Repository
public class WeatherRepository {


    @Autowired
    private WeatherRepository weatherRepository;

    private WeatherInfo weatherInfo;

    public Weather getWeatherDataByCityName(String cityName) throws Exception {
        String city = cityName.replace(" ", "-");
        return weatherRepository.getWeatherData(city);
    }

    public Weather getWeatherDataZipCode(long zipCode) throws Exception {
        String zipCodeAddress = Long.toString(zipCode);
        if (zipCode<0 || zipCode>99999)
            return null;
        return weatherRepository.getWeatherData(zipCodeAddress);
    }

    private Weather getWeatherData(String parameter) throws Exception {
        weatherInfo = weatherRepository.getWeatherInfo(parameter);
        Weather weather = new Weather(weatherInfo.getLocation().getName(), weatherInfo.getLocation().getCountry(), weatherInfo.getCurrent().getTemp_c(),weatherInfo.getCurrent().getUv());
        return weather;
    }

    private WeatherInfo getWeatherInfo(String parameter) throws Exception {
        String urlApixu = "http://api.apixu.com/v1/current.json?key=da0451937f6149aea2f220806180909&q=";
        String url = urlApixu + parameter;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine = in.readLine();
        ObjectMapper mapper = new ObjectMapper();
        weatherInfo = mapper.readValue(inputLine, WeatherInfo.class);
        return weatherInfo;
    }


}