package scr.main.java.weather_api;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {
    // Зарегистрироваться на сайте weatherstack.com и получить свой ключ.
    private static final String apiKey = "";
    //http://api.weatherstack.com/current?access_key=apiKey&query=moscow

    public String getJson(String city) throws Exception{
        StringBuilder stringBuilder = new StringBuilder();

        URL url = new URL("http://api.weatherstack.com/current?access_key" + apiKey + "&query=" + city);
        URLConnection connection = url.openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        while(scanner.hasNext()){
            stringBuilder.append(scanner.nextLine());
        }
        System.out.println("от сервера пришёл ответ: " + stringBuilder);
        return stringBuilder.toString();
    }
}
