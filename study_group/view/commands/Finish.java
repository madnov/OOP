package study_group.view.commands;

import study_group.view.ConsoleUI;

public class Finish extends Command{
    public Finish(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Закончить работу";
    
    }

    @Override
    public void execute() {
        consoleUI.finish();
    }
    
    
}
