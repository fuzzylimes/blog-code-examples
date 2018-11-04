package net.fuzzylimes.blog.comparator;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    int age;
    int grade;
    double gpa;
    String name;

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }

    public static Comparator<Student> COMPARE_GRADE = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getGrade() - o2.getGrade();
        }
    };

    public static Comparator<Student> COMPARE_GRADE_LAMBDA = (o1, o2) -> o1.getGrade() - o2.getGrade();

    public static Comparator<Student> COMPARE_GRADE_LAMDA_KEY = Comparator.comparingInt(Student::getGrade);

    public static Comparator<Student> COMPARE_NAMES = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Student> COMPARE_NAMES_LAMBDA = Comparator.comparing(Student::getName);

    public static Comparator<Student> COMPARE_AGE_GPA = (o1, o2) -> {
        int age = o1.getAge() - o2.getAge();
        double gpa =  (o1.getGpa() - o2.getGpa());

        if (age == 0) {
            return gpa == 0 ? age : gpa > 0 ? 1 : -1;
        } else {
            return age;
        }
    };

    public Student(int age, int grade, double gpa, String name) {
        this.age = age;
        this.grade = grade;
        this.gpa = gpa;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", grade=" + grade +
                ", gpa=" + gpa +
                ", name='" + name + '\'' +
                '}';
    }
}
