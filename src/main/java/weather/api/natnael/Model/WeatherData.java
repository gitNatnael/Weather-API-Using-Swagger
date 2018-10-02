package weather.api.natnael.Model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by natna on 2018-10-02.
 */
public class WeatherData {

    public static void main(String[] args) throws IOException {


       String url1 = "http://api.apixu.com/v1/current.json?key=da0451937f6149aea2f220806180909&q=";
        Scanner inCity = new Scanner(System.in);
        System.out.println("Enter city name");
        String city = inCity.nextLine();
        System.out.println(city);
        String url = url1  +city.replace(" ","-");
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        String jsonResponse=response.toString();
        System.out.println(response.toString());
        ObjectMapper mapper = new ObjectMapper();
        WeatherInfo weatherInfo=mapper.readValue(jsonResponse, WeatherInfo.class);

        System.out.println(weatherInfo.getCurrent().getTemp_c());
        System.out.println(weatherInfo.getLocation().getCountry());

    }
}
