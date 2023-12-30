package SaturdayDec30.Exercise.StudentExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(101, "Arpinder", 20, "Java"));
        list.add(new Student(102, "Pankaj", 22, "QA"));
        list.add(new Student(103, "Kunal", 21, "Cloud Computing"));
        list.add(new Student(104, "Rajan", 24, "Cybersecurity"));
        list.add(new Student(105, "Ekam", 24, "Java"));
        list.add(new Student(106, "Surinder", 28, "QA"));
        list.add(new Student(107, "Sachin", 40, "Cloud Computing"));
        list.add(new Student(108, "Ranveer", 17, "Cybersecurity"));

        /*for (Student student: list) {
            if(student.age > 21){
                System.out.println(student);
            }
        }*/
        for (Student student1: list) {
            if(student1.course == "Cloud Computing"){
                System.out.println(student1);
            }
        }
    }
}
