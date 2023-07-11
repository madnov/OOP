package study_group.view.commands;

import study_group.view.ConsoleUI;

public class AddStudent extends Command{
    private String description;
    private ConsoleUI consoleUI;

    public AddStudent(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить студента";
    }

    public void execute() {
        consoleUI.addStudent();
    }

    public String getDescription() {
        return description;
    }

}
