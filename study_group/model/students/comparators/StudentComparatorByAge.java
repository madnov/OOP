package study_group.model.students.comparators;

import java.util.Comparator;

import study_group.model.students.Student;

public class StudentComparatorByAge implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
    
}
