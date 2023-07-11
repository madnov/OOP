package study_group.model.group;

import java.util.Iterator;
import java.util.List;

import study_group.model.students.Student;

public class StudentIterator implements Iterator<Student> {
    private int index;
    private List<Student> studentList;

    public StudentIterator(List<Student> studentList2) {
    }

    @Override
    public boolean hasNext() {
        return studentList.size() > index;
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }

}
