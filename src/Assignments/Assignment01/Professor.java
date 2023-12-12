package Assignments.Assignment01;

public class Professor extends Person{
    int employeeId;
    String department;

    public Professor(int id, int age, String name, int employeeId, String department) {
        super(id, age, name);
        this.employeeId = employeeId;
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void displayDetails(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Department: " + department);
    }
}
