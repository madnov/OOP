package study_group.view.commands;

import study_group.view.ConsoleUI;

public class GetStudentsInfo extends Command {
      private String description;
    private ConsoleUI consoleUI;

    public GetStudentsInfo(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Получить список студентов";
    }

    public void execute() {
        consoleUI.getStudentsListInfo();
    }

   
}
