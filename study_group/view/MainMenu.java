package study_group.view;

import java.util.ArrayList;
import java.util.List;

import study_group.view.commands.AddStudent;
import study_group.view.commands.Command;
import study_group.view.commands.Finish;
import study_group.view.commands.GetStudentsInfo;
import study_group.view.commands.SortByAge;
import study_group.view.commands.SortByName;

public class MainMenu {
    private List<Command> commandList;

    public MainMenu(ConsoleUI consoleUI) {
        commandList = new ArrayList<>();
        commandList.add(new AddStudent(consoleUI));
        commandList.add(new GetStudentsInfo(consoleUI));
        commandList.add(new SortByName(consoleUI));
        commandList.add(new SortByAge(consoleUI));
        commandList.add(new Finish(consoleUI));
    }

    public String menu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }
    public void execute(int choice){
        Command command = commandList.get(choice - 1);
        command.execute();
    }

    public int getSize(){
        return commandList.size();
    }
}
