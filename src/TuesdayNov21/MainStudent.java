package TuesdayNov21;

public class MainStudent {

    public static void main(String[] args) {

        Students students = new Students();
        students.fullName = "John Doe";
        students.age = 19;
        students.address = "20 Anywhere blvd";

        students.StudentCourse();
        students.StudentHomework();
        students.StudentResult();

    }
}
