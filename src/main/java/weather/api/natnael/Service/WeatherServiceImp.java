package weather.api.natnael.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import weather.api.natnael.Model.Weather;
import weather.api.natnael.Repository.WeatherRepository;



@Service
public class WeatherServiceImp implements WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    public Weather getWeatherDataByCityName(String city) throws Exception {
        return weatherRepository.getWeatherDataByCityName(city);
    }

    public Weather getWeatherDataByZipCode(long zipCode) throws Exception {
        return weatherRepository.getWeatherDataZipCode(zipCode);
    }

}
