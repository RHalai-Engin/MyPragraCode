package SaturdayDec02.OOP.Inheritance.Exercises.Exercise1;

public class Employee {
    String employeeId;
    double salary;
    String role;
    String email;

    public Employee(){

    }
    public void showDetails(){
        System.out.println("Employee ID: 1234");
        System.out.println("$" + 40);
        System.out.println("Developer");
        System.out.println("Rajan@Pragra.ca");
    }

}

class Manager extends Employee {

    public void showDepartment(){
        System.out.println("Superiors");
    }

}

class mainClass{
    public static void main(String[] args) {

        Manager mana = new Manager();
        mana.showDetails();
        mana.showDepartment();
    }
}

