package scr.main.java.weather_api;

import scr.main.java.weather_api.weather.Weather;
import com.google.gson.Gson;

public class Formatter {
    public Weather parse(String json){
        Gson gson = new Gson();
        Weather weather = gson.fromJson(json, Weather.class);
        return weather;
    }
}
