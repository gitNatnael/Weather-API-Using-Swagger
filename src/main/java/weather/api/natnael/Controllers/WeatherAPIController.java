package weather.api.natnael.Controllers;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import weather.api.natnael.Model.Weather;
import weather.api.natnael.Service.WeatherService;


@RestController
@RequestMapping("/weather")
public class WeatherAPIController {


    @Autowired
    private WeatherService weatherService;

    @ApiOperation(value = "Get weather api by city name",response = Weather.class)
    @RequestMapping(value = "/api/{cityName}",method = RequestMethod.GET, produces = "application/json")
    public Weather getWeatherAPI(@PathVariable String cityName) throws Exception {
       return weatherService.getWeatherData(cityName);
    }
}
