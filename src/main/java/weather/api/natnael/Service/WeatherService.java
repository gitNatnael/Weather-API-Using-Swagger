package weather.api.natnael.Service;

import weather.api.natnael.Model.Weather;


public interface WeatherService {

    Weather getWeatherDataByCityName(String city) throws Exception;

    Weather getWeatherDataByZipCode(long zipCode) throws Exception;
}
