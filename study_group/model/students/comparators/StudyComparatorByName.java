package study_group.model.students.comparators;

import java.util.Comparator;

import study_group.model.students.Student;

public class StudyComparatorByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
