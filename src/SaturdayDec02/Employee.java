package SaturdayDec02;

public class Employee {

    String name;
    String email;
    double salary;

    public Employee () {

    }

    public Employee (String name){
        this.name = name;
    }
    public Employee (String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public void ShowDetails(){
        System.out.println("Name :" + name);
        System.out.println("Email :" + email);
        System.out.println("Salary :" + salary);
    }

    public static void main(String[] args) {

        Employee em = new Employee("Rajan", "Rajan@Pragra.ca", 200000);
        em.ShowDetails();

    }


}
