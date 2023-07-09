package scr.main.java.ui;

import java.util.Scanner;

import scr.main.java.presenter.Presenter;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
    }

    @Override
    public void start() {
        while (true) {

            String city = scan();
            presenter.getInfo(city);
        }
    }

    private String scan() {
        System.out.println("Введите город");
        return scanner.nextLine();
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}