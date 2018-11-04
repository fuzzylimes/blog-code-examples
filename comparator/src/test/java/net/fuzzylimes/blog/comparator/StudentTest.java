package net.fuzzylimes.blog.comparator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

    List<Student> students = new ArrayList<Student>();

    @Before
    public void setUp() {
        students.add(new Student(17, 12, 3.5, "James"));
        students.add(new Student(17, 12, 3.25, "Jill"));
        students.add(new Student(16, 10, 2.4, "Bill"));
        students.add(new Student(15, 9, 3.9, "Sally"));
        students.add(new Student(18, 12, 3.8, "Emily"));
    }

    @Test
    public void comparatorSorting() {
        System.out.println(students.toString());
        Collections.sort(students);
        System.out.println(students.toString());
    }

    @Test
    public void compareGrade() {
        System.out.println(students.toString());
        students.sort(Student.COMPARE_GRADE);
        System.out.println(students.toString());
    }

    @Test
    public void compareGradeLambda() {
        System.out.println(students.toString());
        students.sort(Student.COMPARE_GRADE_LAMBDA);
        System.out.println(students.toString());
    }

    @Test
    public void compareGradeLambdaKey() {
        System.out.println(students.toString());
        students.sort(Student.COMPARE_GRADE_LAMDA_KEY);
        System.out.println(students.toString());
    }

    @Test
    public void compareNames() {
        System.out.println(students.toString());
        students.sort(Student.COMPARE_NAMES);
        System.out.println(students.toString());
    }

    @Test
    public void compareNamesLambda() {
        System.out.println(students.toString());
        students.sort(Student.COMPARE_NAMES_LAMBDA);
        System.out.println(students.toString());
    }

    @Test
    public void compareAgeGpa() {
        System.out.println(students.toString());
        students.sort(Student.COMPARE_AGE_GPA);
        System.out.println(students.toString());
    }

}