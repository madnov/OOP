package study_group.view;

import java.util.Scanner;

import study_group.presenter.Presenter;

public class ConsoleUI implements View {

    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void start() {
        System.out.println("Приветствие");
        while (work) {
            System.out.println(menu.menu());
            String line = scanner.nextLine();
            int choice = Integer.parseInt(line);
            menu.execute(choice);

        }
    }

    public void finish() {
        System.out.println("Приятно было пообщаться");
        work = false;

    }

    public void sortByAge() {
        presenter.sortByAge();
    }

    public void sortByName() {
        presenter.sortByName();
    }

    public void getStudentsListInfo() {
        presenter.getStudentsListInfo();
    }

    public void addStudent() {
        System.out.println("Введите имя студента");
        String name = scanner.nextLine();
        System.out.println("Укажите возраст студента");
        String ageString = scanner.nextLine();
        int age = Integer.parseInt(ageString);
        presenter.addStudent(ageString, age);
    }
}
