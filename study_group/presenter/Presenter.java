package study_group.presenter;

import scr.main.java.ui.View;
import study_group.service.Service;
import study_group.view.ConsoleUI;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public Presenter(ConsoleUI consoleUI) {
    }

    public void addStudent(String name, int age){
        service.addStudent(name, age);
        getStudentsListInfo();
    }
    public void getStudentsListInfo(){
        String info = service.getStudentInfo();
        view.print(info);
    }
    public void sortByAge(){
        service.sortByAge();
        getStudentsListInfo();
    }
    public void sortByName(){
        service.sortByName();
        getStudentsListInfo();
    }
}
