package TuesdayDec05.StudentExercise;

public class Student {
    String name;
    String rollNo;
    Address address;

    public Student(String name, String rollNo, Address address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    public void showDetails(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(address);
    }

    public static void main(String[] args) {
        Address address = new Address("00", "No Where BLVD", "B3T 6D8", "CA");
        Student student = new Student("Rajan", "000", address);
        student.showDetails();
    }
}
