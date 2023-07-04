package study_group.group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import study_group.students.Student;
import study_group.students.comparators.StudentComparatorByAge;
import study_group.students.comparators.StudyComparatorByName;

public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }

    public void sortByName(){
        studentList.sort(new StudyComparatorByName());;
    }

    public void sortByAge(){
        studentList.sort(new StudentComparatorByAge());
    }

}
