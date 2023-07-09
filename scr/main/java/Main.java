package scr.main.java;

import scr.main.java.ui.ConsoleUI;
import scr.main.java.ui.View;

public class Main {
    public static void main(String[] args) {
        View view = new ConsoleUI();
        view.start();
    }
}
