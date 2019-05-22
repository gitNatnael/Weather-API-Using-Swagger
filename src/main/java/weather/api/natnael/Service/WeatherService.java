package weather.api.natnael.Service;

import weather.api.natnael.Model.Weather;

import java.util.List;


public interface WeatherService {

    Weather getWeatherDataByCityName(String city) throws Exception;

    Weather getWeatherDataByZipCode(long zipCode) throws Exception;

   // List<String> getNamesList() throws Exception;
}
