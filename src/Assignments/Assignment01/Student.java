package Assignments.Assignment01;

public class Student extends Person{

    int studentId;
    char grade;

    public Student(int id, int age, String name, int studentId, char grade) {
        super(id, age, name);
        this.studentId = studentId;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public void displayDetails(){
        System.out.println("Student ID: " + id);
        System.out.println("Student's Grade: " + grade);
    }
}
