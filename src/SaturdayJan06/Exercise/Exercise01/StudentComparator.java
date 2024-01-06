package SaturdayJan06.Exercise.Exercise01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparator {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Tom", 20));
        studentList.add(new Student("Jerry", 25));
        studentList.add(new Student("Chris", 15));
        studentList.add(new Student("Robert", 18));
        studentList.add(new Student("Sam", 12));
        studentList.add(new Student("Roger", 21));

        Collections.sort(studentList);
        System.out.println(studentList);

    }
}
