package study_group.students.comparators;

import java.util.Comparator;

import study_group.students.Student;

public class StudyComparatorByName implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
}
