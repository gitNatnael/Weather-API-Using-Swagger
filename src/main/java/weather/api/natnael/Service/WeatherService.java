package weather.api.natnael.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weather.api.natnael.Model.Weather;
import weather.api.natnael.Repository.WeatherRepository;

import java.util.List;

@Service
public class WeatherService {


    @Autowired
    private WeatherRepository weatherRepository;

    public Weather getWeatherData(String city) throws Exception {
        return weatherRepository.getWeatherApi(city);
    }

}
