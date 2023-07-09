package scr.main.java;

import scr.main.java.weather_api.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = new Connection();
        try {
            connection.getJson("new york");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
