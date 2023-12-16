package SaturdayDec16.Exercise;

public class Student {
    Human human = new Human();
    public void study(){
        human.live();
    }
    public static void main(String[] args) {
        Student student=new Student();
        student.study();
    }

}
