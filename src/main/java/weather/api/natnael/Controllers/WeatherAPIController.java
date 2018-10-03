package weather.api.natnael.Controllers;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import weather.api.natnael.Model.Weather;
import weather.api.natnael.Service.WeatherServiceImp;


@RestController
@RequestMapping("/weather/api")
public class WeatherAPIController {


    @Autowired
    private WeatherServiceImp weatherServiceImp;

    @ApiOperation(value = "Get weather api by city name",response = Weather.class)
    @RequestMapping(value = "/byCityName/{cityName}",method = RequestMethod.GET, produces = "application/json")
    public Weather getWeatherAPI(@PathVariable String cityName) throws Exception {
       return weatherServiceImp.getWeatherDataByCityName(cityName);
    }


    @ApiOperation(value = "Get weather api by zip code, it work only for US",response = Weather.class)
    @RequestMapping(value = "/byZipCode/{zipCode}",method = RequestMethod.GET, produces = "application/json")
    public Weather getWeatherAPIByZipCode(long zipCode) throws Exception {
        return weatherServiceImp.getWeatherDataByZipCode(zipCode);
    }
}
