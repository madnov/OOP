package scr.main.java.presenter;

import javax.swing.text.View;

import scr.main.java.ui.ConsoleUI;
import scr.main.java.weather_api.WeatherService;

public class Presenter {
    private View view;
    private WeatherService service;

    public Presenter(ConsoleUI consoleUI) {
        this.view = view;
        service = new WeatherService();
    }

    public void getInfo(String city) {
        String answer = service.get(city);
        ((scr.main.java.ui.View) view).print(answer);
    }

}
